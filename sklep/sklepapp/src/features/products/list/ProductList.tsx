import React from 'react'
import { Item, Button, Label, Segment } from 'semantic-ui-react'
import { IProduct } from '../../../app/modules/product'

interface IProps {
    products: IProduct[],
    // addProduct: () => void
}
export const ProductList : React.FC<IProps> = ({products}) => {

    return (
        <Segment clearing>
            <Item.Group divided>
                {products.map(prod =>
                    (
                        <Item>
                        <Item.Content>
                            <Item.Header as='a'>{prod.name}</Item.Header>
                            <Item.Description>
                                <div>{prod.description}</div>
                            </Item.Description>
                            {/* <Item.Extra>
                                <Button floated='right' content='View' color='blue' onClick={() => selectActivity(activity.id)} />
                                <Label basic content={activity.category} />
                            </Item.Extra> */}
                        </Item.Content>
                        </Item>            
                ))}
        </Item.Group>
        </Segment>
    )

   
}
