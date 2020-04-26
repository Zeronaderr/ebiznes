import React, { useState, useEffect, Fragment } from 'react';
import axios from 'axios';
import './App.css';
import { Container } from 'semantic-ui-react';
import { ProductCategoryList } from './features/productCategories/list/ProductCategoryList';
import { IProductCategory } from './app/modules/productCategory';
import { IProduct } from './app/modules/product';
import { ProductList } from './features/products/list/ProductList';


const App = () => {
  const[productCategories,setProductCategories] = useState<IProductCategory[]>([])
  const[products,setProducts] = useState<IProduct[]>([])

  var categories_url = "http://localhost:9000/api/productcategories"
  var products_url = "http://localhost:9000/api/products"

  useEffect(() => {
      // axios.get<IProductCategory[]>(url,{method: 'get', headers: {
      //   'Access-Control-Allow-Origin':'http://localhost:3000',
      //   },
      //  })
      // .then((response) => {
      //   console.log('Starting Request', response)
      //   setProductCategories(response.data)
      //   });
      axios.get<IProduct[]>(products_url,{method: 'get', headers: {
        'Access-Control-Allow-Origin':'http://localhost:3000',
        },
       })
      .then((response) => {
        console.log('Starting Request', response)
        setProducts(response.data)
        });

    },[]);
  
  return (
    <Fragment>
    {/* <NavBar openCreateForm={handleOpenCreateForm} /> */}
    <Container style={{marginTop: '7em'}}>
      {/* <ProductCategoryList productCategories={productCategories} /> */}
      <ProductList products={products} />
    </Container>
  </Fragment>
  );
}

export default App;
