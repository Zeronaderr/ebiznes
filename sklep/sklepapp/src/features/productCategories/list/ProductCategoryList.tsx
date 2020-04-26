import React from 'react'
import { Item, Button, Label, Segment } from 'semantic-ui-react'
import { IProductCategory } from '../../../app/modules/productCategory'

interface IProps {
    productCategories: IProductCategory[],
}
export const ProductCategoryList : React.FC<IProps> = ({productCategories}) => {

    return (
        <Segment clearing>
            <Item.Group divided>
                {productCategories.map(pc =>
                    (
                        <Item>
                        <Item.Content>
                            <Item.Header>{pc.name}</Item.Header>
                        </Item.Content>
                        </Item>            
                ))}
        </Item.Group>
        </Segment>
    )
}
