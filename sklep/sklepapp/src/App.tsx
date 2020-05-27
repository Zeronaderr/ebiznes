import React, {useContext , useEffect, Fragment } from 'react';
import './App.css';
import { Container } from 'semantic-ui-react';
import NavBar from './features/nav/NavBar';
import { ProductsDashboard } from './features/products/ProductsDashboard';
import {observer} from 'mobx-react-lite';
import { Route, RouteComponentProps, withRouter, Switch } from 'react-router-dom';
import { OrderList } from './features/orders/OrderList';
import AddOrderForm from './features/orders/AddOrderForm';
import AddProductForm from './features/products/forms/AddProductForm';
import {  RootStoreContext } from './app/stores/rootStore';
import LoginForm from './features/user/LoginForm';

const App: React.FC<RouteComponentProps> = ({location}) => {
  const rootStore = useContext(RootStoreContext);
  const {
  loadOrders,loadProducts,loadShippers,loadBrands
  } = rootStore.productStore;

  useEffect(() => {
    loadOrders();
    loadProducts();
    loadShippers();
    loadBrands();
    },[loadOrders,loadProducts,loadShippers,loadBrands]);

  return (
    <Fragment>
      <Route exact path='/' component={LoginForm} />
      <Route path={'/(.+)'} render={() => (
            <Fragment>
              <NavBar />
              <Container style={{marginTop: '7em'}}>
                <Switch>
                  <Route component={ProductsDashboard} path='/products' />
                  <Route component={ProductsDashboard} path='/products#' />
                  <Route component={OrderList} exact path='/orders' />
                  <Route exact path='/product/:id' component={AddProductForm} key={location.key} />
                  <Route exact path={['/createOrder','/manage/:id']} component={AddOrderForm} key={location.key} />
                  <Route component={LoginForm} exact path='/login' />
                </Switch>
            </Container>
          </Fragment>
          )} />
      </Fragment>
  );
}

export default withRouter(observer(App));