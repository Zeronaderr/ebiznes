// @GENERATOR:play-routes-compiler
// @SOURCE:D:/ebiznes/sklep/conf/routes
// @DATE:Sun Apr 26 18:37:46 CEST 2020

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers {

  // @LINE:51
  class ReverseDiscountController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:51
    def getDiscountApi(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/discount/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:58
    def deleteDiscount(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deletediscount/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:53
    def addDiscountApi(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/adddiscount")
    }
  
    // @LINE:54
    def updateDiscountHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "updatediscounthandle")
    }
  
    // @LINE:56
    def updateDiscount(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updatediscount/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:52
    def getDiscountsApi(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/discounts")
    }
  
    // @LINE:55
    def addDiscountHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "adddiscounthandle")
    }
  
    // @LINE:57
    def addDiscount(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "adddiscount")
    }
  
  }

  // @LINE:106
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:106
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:33
  class ReverseBrandController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:36
    def updateBrandHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "updatebrandhandle")
    }
  
    // @LINE:38
    def updateBrand(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updatebrand/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:33
    def getBrandApi(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/brand/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:35
    def addBrandApi(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/addbrand")
    }
  
    // @LINE:40
    def deleteBrand(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deletebrand/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:39
    def addBrand(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addbrand")
    }
  
    // @LINE:37
    def addBrandHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addbrandhandle")
    }
  
    // @LINE:34
    def getBrandsApi(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/brands")
    }
  
  }

  // @LINE:42
  class ReverseCustomerController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:48
    def addCustomer(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addcustomer")
    }
  
    // @LINE:49
    def deleteCustomer(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deletecustomer/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:47
    def updateCustomer(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updatecustomer/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:43
    def getCustomersApi(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/customers")
    }
  
    // @LINE:44
    def addCustomerApi(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/addcustomer")
    }
  
    // @LINE:45
    def updateCustomerHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "updatecustomerhandle")
    }
  
    // @LINE:46
    def addCustomerHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addcustomerhandle")
    }
  
    // @LINE:42
    def getCustomerApi(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/customer/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
  }

  // @LINE:89
  class ReverseProductCategoryController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:98
    def updateProductCategoryHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "updateproductcategoryhandle")
    }
  
    // @LINE:91
    def getProductCategoriesApi(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/productcategories")
    }
  
    // @LINE:96
    def addProductCategoryHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addproductcategoryhandle")
    }
  
    // @LINE:89
    def addProductCategoryApi(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/addproductcategory")
    }
  
    // @LINE:93
    def getProductCategory(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "productcategory/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:97
    def addProductCategory(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addproductcategory")
    }
  
    // @LINE:99
    def deleteProductCategory(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deleteproductcategory/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:90
    def getProductCategoryApi(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/productcategory/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:94
    def getProductCategories(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "productcategories")
    }
  
    // @LINE:95
    def updateProductCategory(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updateproductcategory/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
  }

  // @LINE:101
  class ReverseCountController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:101
    def count(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "count")
    }
  
  }

  // @LINE:74
  class ReversePaymentController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:74
    def getPaymentApi(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/payment/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:76
    def addPaymentApi(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/addpayment")
    }
  
    // @LINE:75
    def getPaymentsApi(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/payments")
    }
  
    // @LINE:77
    def deletePayment(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deletepayment/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
  }

  // @LINE:10
  class ReverseProductController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def getProductsApi(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/products")
    }
  
    // @LINE:14
    def getProduct(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "product/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:10
    def addProductApi(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/addproduct")
    }
  
    // @LINE:15
    def getProducts(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "products")
    }
  
    // @LINE:19
    def updateProductHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "updateproducthandle")
    }
  
    // @LINE:18
    def addProductHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addproducthandle")
    }
  
    // @LINE:20
    def deleteProduct(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deleteproduct/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:16
    def updateProduct(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updateproduct/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:17
    def addProduct(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addproduct")
    }
  
    // @LINE:11
    def getProductApi(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/product/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
  }

  // @LINE:65
  class ReverseShipperController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:68
    def updateShipperHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "updateshipperhandle")
    }
  
    // @LINE:69
    def addShipperHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addshipperhandle")
    }
  
    // @LINE:70
    def updateShipper(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updateshipper/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:72
    def deleteShipper(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deleteshipper/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:67
    def addShipperApi(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/addshipper")
    }
  
    // @LINE:66
    def getShippersApi(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/shippers")
    }
  
    // @LINE:71
    def addShipper(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addshipper")
    }
  
    // @LINE:65
    def getShipperApi(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/shipper/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
  }

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:103
  class ReverseAsyncController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:103
    def message(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "message")
    }
  
  }

  // @LINE:60
  class ReverseOrderController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:61
    def getOrdersApi(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/orders")
    }
  
    // @LINE:63
    def deleteOrder(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deleteorder/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:60
    def getOrderApi(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/order/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:62
    def addOrderApi(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/addorder")
    }
  
  }

  // @LINE:79
  class ReverseEmployeeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:86
    def deleteEmployee(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deleteemployee/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:83
    def addEmployeeHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addemployeehandle")
    }
  
    // @LINE:81
    def addEmployeeApi(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/addemployee")
    }
  
    // @LINE:79
    def getEmployeeApi(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/employee/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:84
    def updateEmployee(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updateemployee/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:85
    def addEmployee(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addemployee")
    }
  
    // @LINE:80
    def getEmployeesApi(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/employees")
    }
  
    // @LINE:82
    def updateEmployeeHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "updateemployeehandle")
    }
  
  }

  // @LINE:23
  class ReverseAddressController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:27
    def addAddressHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addaddresshandle")
    }
  
    // @LINE:23
    def addAddressApi(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/addaddress")
    }
  
    // @LINE:25
    def getAddressesApi(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/addresses")
    }
  
    // @LINE:29
    def updateAddress(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updateaddres/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:28
    def updateAddressHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "updateaddresshandle")
    }
  
    // @LINE:30
    def addAddress(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addaddress")
    }
  
    // @LINE:31
    def deleteAddress(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deleteaddress/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:24
    def getAddressApi(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/address/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
  }


}
