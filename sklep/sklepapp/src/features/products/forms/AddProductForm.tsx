import React, { useContext, useEffect} from 'react'
import { Image, Button, Card, Grid} from 'semantic-ui-react'
import { RouteComponentProps } from 'react-router-dom';
import { observer } from 'mobx-react-lite';
import AddOrderForm from '../../orders/AddOrderForm';
import { RootStoreContext } from '../../../app/stores/rootStore';

interface DetailParams {
    id:string
}

const AddProductForm: React.FC<RouteComponentProps<DetailParams>> = ({match,history}) => {

    const rootStore = useContext(RootStoreContext);
    const {loadProduct,product,clearProduct,loadCategories,categories,brands} = rootStore.productStore;
    useEffect(() => {
        loadProduct(match.params.id);
    },[loadProduct,clearProduct,match.params.id,loadCategories])

    return (
        <Grid>
            <Grid.Column width={10}>

            
        <Card fluid>
        <Image src={'/list/logo192.png'} wrapped ui={false} />
        <Card.Content>
          <Card.Header>
              <span>Name: </span>{product?.name}</Card.Header>
          <Card.Meta>
          <span>Brand: </span>
            <span>{brands.filter(x => x.id == product?.brandId)[0]?.name}</span>
          </Card.Meta>
          <Card.Meta>
          <span>Category: </span>
            <span>{categories.filter(x => x.id == product?.categoryId)[0]?.name}</span>
          </Card.Meta>
          <Card.Description>
          {product?.description}
          </Card.Description>
        </Card.Content>
        <Card.Content extra>
          <Button.Group width={2}>
              <Button basic color='grey' content='Back' onClick={() => history.push('/products')} />
          </Button.Group>
        </Card.Content>
      </Card>
      </Grid.Column>
      <Grid.Column width={6}>
        <AddOrderForm product={product!}/>
      </Grid.Column>
    </Grid>
    )
}

export default observer(AddProductForm)