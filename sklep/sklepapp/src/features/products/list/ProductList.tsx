import React, { useContext, useEffect } from 'react'
import { Item, Button, Label, Segment } from 'semantic-ui-react'
import { IProduct } from '../../../app/modules/product'
import { IProductCategory } from '../../../app/modules/productCategory'
import { IBrand } from '../../../app/modules/brand'
import { observer } from 'mobx-react-lite'
import ProductStore from '../../../app/stores/productStore'

interface IProps {
    makeOrder: (id:string) => void,
    categories: IProductCategory[],
    brands: IBrand[],
    loaded: boolean,
    products: IProduct[]
}
export const ProductList : React.FC<IProps> = ({makeOrder,categories,brands,loaded,products}) => {

    // const productStore = useContext(ProductStore)
    return (
        <Segment clearing>
            <Item.Group divided>
                {products.map(prod =>
                    (
                        <Item>
                            <Item.Image
                            size='tiny'
                            circular
                            src={'logo192.png'}
                            style={{ marginBottom: 3 }}
                            />
                        <Item.Content>
                            <Item.Header as='a'>{prod.name}</Item.Header>
                            <Item.Description>
                                <div>More info: {prod.description}</div>
                            </Item.Description>
                            <Item.Description>
                                <div>Brand: {brands.filter(b => b.id == prod.brandId)[0]?.name}</div>
                            </Item.Description>
                            <Item.Description floated='right'>
                                <div>Price: {prod.price}</div>
                            </Item.Description>
                            <Item.Extra>
                                <Button floated='right' content='Make order' color='blue' onClick={() => makeOrder(prod.id)} />
                                <Label basic content={categories.filter(c => c.id == prod.categoryId)[0]?.name} />
                            </Item.Extra>
                        </Item.Content>
                        </Item>            
                ))}
        </Item.Group>
        </Segment>
    )

   
}

export default observer(ProductList)