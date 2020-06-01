import React, { useContext, useEffect} from 'react'
import { Image, Button, Card, Grid, Segment, Item, Header, Icon} from 'semantic-ui-react'
import { RouteComponentProps, Link } from 'react-router-dom';
import { observer } from 'mobx-react-lite';
import AddOrderForm from '../../orders/AddOrderForm';
import { RootStoreContext } from '../../../app/stores/rootStore';
import LoginForm from '../../user/LoginForm';

interface DetailParams {
    id:string
}


const AddProductForm: React.FC<RouteComponentProps<DetailParams>> = ({match,history}) => {

    const rootStore = useContext(RootStoreContext);
    const {loadProduct,product,clearProduct,loadCategories,categories,brands} = rootStore.productStore;
    const {isLoggedIn} = rootStore.userStore
    useEffect(() => {
        loadProduct(match.params.id);
    },[loadProduct,clearProduct,match.params.id,loadCategories])

    return (
        <Grid>
            <Grid.Column width={10}>
        <Segment.Group>
        <Segment basic attached='top' style={{ padding: '0' }}>
          <Image src={`../${product?.img}.png`} size={"medium"} style={{align: "center"}} fluid />
          <Segment basic>
            <Item.Group>
              <Item>
                <Item.Content>
                  <Header
                    size='huge'
                    content={product?.name}
                  />
                  <p>
                    {product?.description}
                  </p>
                </Item.Content>
              </Item>
            </Item.Group>
          </Segment>
        </Segment>
        <Segment clearing attached='bottom'>
        <Icon name='industry' /> {brands.filter(x => x.id == product?.brandId)[0]?.name}
        <Icon name='filter' /> {categories.filter(x => x.id == product?.categoryId)[0]?.name}
        </Segment>
        <Segment>
          <Icon name='money' size={"large"} /> <span style={{textDecoration: "line-through"}}>{Math.round((+(product?.price!))*1.1)} </span> <span style={{fontSize: "24px"}}> {product?.price} zł </span>
        </Segment>
      </Segment.Group>
        {/* <Card fluid>
        <Image src={`../${product?.img}.png`} tiny ui={true} />
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
      </Card> */}
      </Grid.Column>
      <Grid.Column width={6}>
        {
          isLoggedIn &&
          <AddOrderForm productId={product?.id!}/>
        }
        {
          !isLoggedIn &&
          <LoginForm />
        }
      </Grid.Column>
    </Grid>
    )
}

export default observer(AddProductForm)