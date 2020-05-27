import React, { useContext, useEffect } from 'react'
import { Item, Button, Label, Segment } from 'semantic-ui-react'
import { observer } from 'mobx-react-lite'
import { Link } from 'react-router-dom'
import { RootStoreContext } from '../../../app/stores/rootStore'


export const ProductList : React.FC = () => {


    const rootStore = useContext(RootStoreContext)
    const {brands,categories,clearProduct,loadProducts} = rootStore.productStore
    useEffect(() => {
        clearProduct();
        loadProducts();

    }, [clearProduct,loadProducts,])
    return (
        <Segment clearing>
            <Item.Group divided>
                {Array.from(rootStore.productStore.productRegistry.values()).map(prod =>
                    (
                        <Item>
                            <Item.Image
                            size='tiny'
                            circular
                            src={'logo192.png'}
                            style={{ marginBottom: 3 }}
                            />
                        <Item.Content>
                            <Item.Header >{prod.name}</Item.Header>
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
                                <Button floated='right' content='Make order' color='blue' as={Link} to={`/product/${prod.id}`} />
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