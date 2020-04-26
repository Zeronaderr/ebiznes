import React, {useState} from 'react'
import { Segment, Form, Button, Dropdown } from 'semantic-ui-react'
import { IProduct } from '../../../app/modules/product'
import { IProductCategory } from '../../../app/modules/productCategory';

interface IProps{
    product: IProduct,
    productCategories: IProductCategory[],
    setEditMode: (editMode: boolean) => void,
    handleSubmit: () => void
}

export const AddProductForm: React.FC<IProps> = ({product: initializeFormState,handleSubmit,productCategories}) => {

    const initializeForm = () =>
    {
        if(initializeFormState)
        {
            return initializeFormState;
        }
        else {
            return {
                id: '',
                name: '',
                description: '',
                category: ''
            }
        }
    };

    const[product,setProduct] = useState<IProduct>(initializeForm)
    return (
        <Segment clearing>
            <Form onSubmit={handleSubmit}> 
                <Form.Input placeholder='Name' value={product.name} />
                <Form.TextArea rows={2} placeholder='Description' value={product.name} />
                <Dropdown
                    placeholder='Select Category'
                    fluid
                    search
                    selection
                    options={productCategories}
                />
                <Button floated='right' positive type='submit' content='submit' />
                <Button floated='right' normal type='submit' content='cancel' onClick={() => handleSubmit} />
            </Form>
        </Segment>
    )
}
