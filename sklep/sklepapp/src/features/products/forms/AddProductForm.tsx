import React, {useState, useContext} from 'react'
import { Segment, Form, Button, Dropdown, Select } from 'semantic-ui-react'
import { IProduct } from '../../../app/modules/product'
import { IProductCategory } from '../../../app/modules/productCategory';
import ProductStore from '../../../app/stores/productStore';

interface IProps{
    product: IProduct,
    productCategories: IProductCategory[],
    // setEditMode: (editMode: boolean) => void,
    // handleSubmit: () => void
}

export const AddProductForm: React.FC<IProps> = ({product: initializeFormState,productCategories}) => {

    const productStore = useContext(ProductStore);

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
                categoryId: '',
                price: '',
                img: '',
                brandId: ''
            }
        }
    };
    const categoriesList = productCategories.map(x => {
        return {
            key: x.id,
            value: x.name,
            text: x.name
         }
    })             
    
    const[product,setProduct] = useState<IProduct>(initializeForm)
    return (
        <Segment clearing>
            <Form > 
                <Form.Input placeholder='Name' value={product.name} />
                <Form.TextArea rows={2} placeholder='Description' value={product.description} />
                <Dropdown
                    placeholder='Select Category'
                    fluid
                    selection
                    options={categoriesList}
                />
                <Button floated='right' positive type='submit' content='submit' />
                {/* <Button floated='right' normal type='submit' content='cancel' onClick={() => handleSubmit} /> */}
            </Form>
        </Segment>
    )
}
