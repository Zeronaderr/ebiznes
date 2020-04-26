// @GENERATOR:play-routes-compiler
// @SOURCE:D:/ebiznes/sklep/conf/routes
// @DATE:Sun Apr 26 18:37:46 CEST 2020

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers.javascript {

  // @LINE:51
  class ReverseDiscountController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:51
    def getDiscountApi: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DiscountController.getDiscountApi",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/discount/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:58
    def deleteDiscount: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DiscountController.deleteDiscount",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deletediscount/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:53
    def addDiscountApi: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DiscountController.addDiscountApi",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/adddiscount"})
        }
      """
    )
  
    // @LINE:54
    def updateDiscountHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DiscountController.updateDiscountHandle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updatediscounthandle"})
        }
      """
    )
  
    // @LINE:56
    def updateDiscount: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DiscountController.updateDiscount",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "updatediscount/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:52
    def getDiscountsApi: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DiscountController.getDiscountsApi",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/discounts"})
        }
      """
    )
  
    // @LINE:55
    def addDiscountHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DiscountController.addDiscountHandle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "adddiscounthandle"})
        }
      """
    )
  
    // @LINE:57
    def addDiscount: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DiscountController.addDiscount",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "adddiscount"})
        }
      """
    )
  
  }

  // @LINE:106
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:106
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:33
  class ReverseBrandController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:36
    def updateBrandHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BrandController.updateBrandHandle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updatebrandhandle"})
        }
      """
    )
  
    // @LINE:38
    def updateBrand: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BrandController.updateBrand",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "updatebrand/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:33
    def getBrandApi: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BrandController.getBrandApi",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/brand/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:35
    def addBrandApi: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BrandController.addBrandApi",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/addbrand"})
        }
      """
    )
  
    // @LINE:40
    def deleteBrand: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BrandController.deleteBrand",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deletebrand/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:39
    def addBrand: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BrandController.addBrand",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addbrand"})
        }
      """
    )
  
    // @LINE:37
    def addBrandHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BrandController.addBrandHandle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addbrandhandle"})
        }
      """
    )
  
    // @LINE:34
    def getBrandsApi: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BrandController.getBrandsApi",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/brands"})
        }
      """
    )
  
  }

  // @LINE:42
  class ReverseCustomerController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:48
    def addCustomer: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CustomerController.addCustomer",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addcustomer"})
        }
      """
    )
  
    // @LINE:49
    def deleteCustomer: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CustomerController.deleteCustomer",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deletecustomer/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:47
    def updateCustomer: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CustomerController.updateCustomer",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "updatecustomer/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:43
    def getCustomersApi: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CustomerController.getCustomersApi",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/customers"})
        }
      """
    )
  
    // @LINE:44
    def addCustomerApi: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CustomerController.addCustomerApi",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/addcustomer"})
        }
      """
    )
  
    // @LINE:45
    def updateCustomerHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CustomerController.updateCustomerHandle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updatecustomerhandle"})
        }
      """
    )
  
    // @LINE:46
    def addCustomerHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CustomerController.addCustomerHandle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addcustomerhandle"})
        }
      """
    )
  
    // @LINE:42
    def getCustomerApi: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CustomerController.getCustomerApi",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/customer/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
  }

  // @LINE:89
  class ReverseProductCategoryController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:98
    def updateProductCategoryHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductCategoryController.updateProductCategoryHandle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updateproductcategoryhandle"})
        }
      """
    )
  
    // @LINE:91
    def getProductCategoriesApi: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductCategoryController.getProductCategoriesApi",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/productcategories"})
        }
      """
    )
  
    // @LINE:96
    def addProductCategoryHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductCategoryController.addProductCategoryHandle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addproductcategoryhandle"})
        }
      """
    )
  
    // @LINE:89
    def addProductCategoryApi: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductCategoryController.addProductCategoryApi",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/addproductcategory"})
        }
      """
    )
  
    // @LINE:93
    def getProductCategory: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductCategoryController.getProductCategory",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "productcategory/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:97
    def addProductCategory: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductCategoryController.addProductCategory",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addproductcategory"})
        }
      """
    )
  
    // @LINE:99
    def deleteProductCategory: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductCategoryController.deleteProductCategory",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteproductcategory/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:90
    def getProductCategoryApi: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductCategoryController.getProductCategoryApi",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/productcategory/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:94
    def getProductCategories: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductCategoryController.getProductCategories",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "productcategories"})
        }
      """
    )
  
    // @LINE:95
    def updateProductCategory: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductCategoryController.updateProductCategory",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "updateproductcategory/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
  }

  // @LINE:101
  class ReverseCountController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:101
    def count: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CountController.count",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "count"})
        }
      """
    )
  
  }

  // @LINE:74
  class ReversePaymentController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:74
    def getPaymentApi: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PaymentController.getPaymentApi",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/payment/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:76
    def addPaymentApi: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PaymentController.addPaymentApi",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/addpayment"})
        }
      """
    )
  
    // @LINE:75
    def getPaymentsApi: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PaymentController.getPaymentsApi",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/payments"})
        }
      """
    )
  
    // @LINE:77
    def deletePayment: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PaymentController.deletePayment",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deletepayment/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
  }

  // @LINE:10
  class ReverseProductController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def getProductsApi: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductController.getProductsApi",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/products"})
        }
      """
    )
  
    // @LINE:14
    def getProduct: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductController.getProduct",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "product/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:10
    def addProductApi: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductController.addProductApi",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/addproduct"})
        }
      """
    )
  
    // @LINE:15
    def getProducts: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductController.getProducts",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "products"})
        }
      """
    )
  
    // @LINE:19
    def updateProductHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductController.updateProductHandle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updateproducthandle"})
        }
      """
    )
  
    // @LINE:18
    def addProductHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductController.addProductHandle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addproducthandle"})
        }
      """
    )
  
    // @LINE:20
    def deleteProduct: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductController.deleteProduct",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteproduct/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:16
    def updateProduct: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductController.updateProduct",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "updateproduct/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:17
    def addProduct: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductController.addProduct",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addproduct"})
        }
      """
    )
  
    // @LINE:11
    def getProductApi: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductController.getProductApi",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/product/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
  }

  // @LINE:65
  class ReverseShipperController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:68
    def updateShipperHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShipperController.updateShipperHandle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updateshipperhandle"})
        }
      """
    )
  
    // @LINE:69
    def addShipperHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShipperController.addShipperHandle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addshipperhandle"})
        }
      """
    )
  
    // @LINE:70
    def updateShipper: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShipperController.updateShipper",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "updateshipper/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:72
    def deleteShipper: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShipperController.deleteShipper",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteshipper/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:67
    def addShipperApi: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShipperController.addShipperApi",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/addshipper"})
        }
      """
    )
  
    // @LINE:66
    def getShippersApi: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShipperController.getShippersApi",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/shippers"})
        }
      """
    )
  
    // @LINE:71
    def addShipper: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShipperController.addShipper",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addshipper"})
        }
      """
    )
  
    // @LINE:65
    def getShipperApi: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShipperController.getShipperApi",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/shipper/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
  }

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:103
  class ReverseAsyncController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:103
    def message: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AsyncController.message",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "message"})
        }
      """
    )
  
  }

  // @LINE:60
  class ReverseOrderController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:61
    def getOrdersApi: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OrderController.getOrdersApi",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/orders"})
        }
      """
    )
  
    // @LINE:63
    def deleteOrder: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OrderController.deleteOrder",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteorder/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:60
    def getOrderApi: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OrderController.getOrderApi",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/order/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:62
    def addOrderApi: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OrderController.addOrderApi",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/addorder"})
        }
      """
    )
  
  }

  // @LINE:79
  class ReverseEmployeeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:86
    def deleteEmployee: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EmployeeController.deleteEmployee",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteemployee/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:83
    def addEmployeeHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EmployeeController.addEmployeeHandle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addemployeehandle"})
        }
      """
    )
  
    // @LINE:81
    def addEmployeeApi: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EmployeeController.addEmployeeApi",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/addemployee"})
        }
      """
    )
  
    // @LINE:79
    def getEmployeeApi: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EmployeeController.getEmployeeApi",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/employee/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:84
    def updateEmployee: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EmployeeController.updateEmployee",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "updateemployee/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:85
    def addEmployee: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EmployeeController.addEmployee",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addemployee"})
        }
      """
    )
  
    // @LINE:80
    def getEmployeesApi: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EmployeeController.getEmployeesApi",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/employees"})
        }
      """
    )
  
    // @LINE:82
    def updateEmployeeHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EmployeeController.updateEmployeeHandle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updateemployeehandle"})
        }
      """
    )
  
  }

  // @LINE:23
  class ReverseAddressController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:27
    def addAddressHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AddressController.addAddressHandle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addaddresshandle"})
        }
      """
    )
  
    // @LINE:23
    def addAddressApi: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AddressController.addAddressApi",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/addaddress"})
        }
      """
    )
  
    // @LINE:25
    def getAddressesApi: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AddressController.getAddressesApi",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/addresses"})
        }
      """
    )
  
    // @LINE:29
    def updateAddress: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AddressController.updateAddress",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "updateaddres/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:28
    def updateAddressHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AddressController.updateAddressHandle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updateaddresshandle"})
        }
      """
    )
  
    // @LINE:30
    def addAddress: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AddressController.addAddress",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addaddress"})
        }
      """
    )
  
    // @LINE:31
    def deleteAddress: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AddressController.deleteAddress",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteaddress/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:24
    def getAddressApi: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AddressController.getAddressApi",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/address/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
  }


}
