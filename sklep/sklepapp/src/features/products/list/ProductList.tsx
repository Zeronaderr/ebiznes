import React, { useContext, useEffect } from 'react'
import { Item, Button, Label, Segment } from 'semantic-ui-react'
import { observer } from 'mobx-react-lite'
import { Link } from 'react-router-dom'
import { RootStoreContext } from '../../../app/stores/rootStore'


export const ProductList : React.FC = () => {


    const rootStore = useContext(RootStoreContext)
    const {brands,categories,clearProduct,loadProducts,productsByCategory} = rootStore.productStore
    const {userToken} = rootStore.userStore
    useEffect(() => {
        clearProduct();
        loadProducts();
        userToken();
    }, [clearProduct,loadProducts,userToken])
    return (
        <Segment clearing>
            <Item.Group divided>
                {productsByCategory.map(prod =>
                    (
                        <Item>
                            <Item.Image
                            size='tiny'
                            src={`${prod.img}.png`}
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
                                <Button floated='right' content='Szczegóły' color='blue' as={Link} to={`/product/${prod.id}`} />
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