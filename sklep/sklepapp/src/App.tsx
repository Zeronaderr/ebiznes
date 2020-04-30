import React, {useContext , useState, useEffect, Fragment } from 'react';
import './App.css';
import { Container } from 'semantic-ui-react';
import { IProductCategory } from './app/modules/productCategory';
import { IProduct } from './app/modules/product';
import NavBar from './features/nav/NavBar';
import { ProductsDashboard } from './features/products/ProductsDashboard';
import { IOrder } from './app/modules/order';
import agent from './app/api/agent';
import ProductStore from './app/stores/productStore';
import {observer} from 'mobx-react-lite';
import { Route } from 'react-router-dom';
import HomePage from './features/home/HomePage';

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
      <Route exact path='/' component={HomePage} />
      <Route component={ProductsDashboard} exact path='/products' />
      {/* <ProductsDashboard  /> */}
    </Container>
  </Fragment>
  );
}

export default observer(App);
