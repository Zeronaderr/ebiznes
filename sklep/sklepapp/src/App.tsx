import React, {useContext , useEffect, Fragment } from 'react';
import './App.css';
import { Container } from 'semantic-ui-react';
import NavBar from './features/nav/NavBar';
import { ProductsDashboard } from './features/products/ProductsDashboard';
import ProductStore from './app/stores/productStore';
import {observer} from 'mobx-react-lite';
import { Route } from 'react-router-dom';
import { OrderList } from './features/orders/OrderList';
import LoginForm from './app/Login/LoginForm';

const App = () => {
  const productStore = useContext(ProductStore);
  const {
  customers,loadCustomers
  } = productStore;

  useEffect(() => {
    loadCustomers();
    },[loadCustomers]);

  return (
    <Fragment>
    <NavBar customers={customers} />
    <Container style={{marginTop: '7em'}}>
      <Route exact path='/' component={LoginForm} />
      <Route component={ProductsDashboard} exact path='/products' />
      <Route component={OrderList} exact path='/orders' />
    </Container>
  </Fragment>
  );
}

export default observer(App);
