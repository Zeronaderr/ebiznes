// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/zeron/IdeaProjects/sklep/conf/routes
// @DATE:Thu Apr 23 19:12:48 CEST 2020

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers {

  // @LINE:33
  class ReverseDiscountController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:35
    def updateDiscount(id:Long): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "updatediscount/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:34
    def getDiscounts(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "discounts")
    }
  
    // @LINE:33
    def getDiscount(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "discount/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:37
    def deleteDiscount(id:Long): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "deletediscount/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:36
    def addDiscount(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "adddiscount")
    }
  
  }

  // @LINE:74
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:74
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:21
  class ReverseBrandController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:22
    def getBrands(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "brands")
    }
  
    // @LINE:21
    def getBrand(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "brand/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:24
    def addBrand(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addbrand")
    }
  
    // @LINE:25
    def deleteBrand(id:Long): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "deletebrand/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:23
    def updateBrand(id:Long): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "updateaddress/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
  }

  // @LINE:27
  class ReverseCustomerController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:30
    def addCustomer(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addcustomer")
    }
  
    // @LINE:27
    def getCustomer(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "customer/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:31
    def deleteCustomer(id:Long): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "deletecustomer/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:29
    def updateCustomer(id:Long): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "updatecustomer/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:28
    def getCustomers(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "customers")
    }
  
  }

  // @LINE:63
  class ReverseProductCategoryController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:67
    def deleteProductCategory(id:Long): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "deleteproductcategory/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:63
    def getProductCategory(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "productcategory/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:65
    def updateProductCategory(id:Long): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "updateproductcategory/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:66
    def addProductCategory(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addproductcategory")
    }
  
    // @LINE:64
    def getProductCategories(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "productscategories")
    }
  
  }

  // @LINE:69
  class ReverseCountController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:69
    def count(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "count")
    }
  
  }

  // @LINE:51
  class ReversePaymentController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:54
    def addPayment(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addpayment")
    }
  
    // @LINE:55
    def deletePayment(id:Long): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "deletepayment/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:52
    def getPayments(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "payments")
    }
  
    // @LINE:53
    def updatePayment(id:Long): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "updatepayment/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:51
    def getPayment(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "payment/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
  }

  // @LINE:9
  class ReverseProductController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def getProduct(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "product/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:10
    def getProducts(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "products")
    }
  
    // @LINE:13
    def deleteProduct(id:Long): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "deleteproduct/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:11
    def updateProduct(id:Long): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "updateproduct/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:12
    def addProduct(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addproduct")
    }
  
  }

  // @LINE:45
  class ReverseShipperController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:49
    def deleteShipper(id:Long): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "deleteshipper/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:45
    def getShipper(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "shipper/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:47
    def updateShipper(id:Long): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "updateshipper/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:46
    def getShippers(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "shippers")
    }
  
    // @LINE:48
    def addShipper(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addshipper")
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

  // @LINE:71
  class ReverseAsyncController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:71
    def message(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "message")
    }
  
  }

  // @LINE:39
  class ReverseOrderController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:43
    def deleteOrder(id:Long): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "deleteorder/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:42
    def addOrder(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addorder")
    }
  
    // @LINE:40
    def getOrders(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "orders")
    }
  
    // @LINE:39
    def getOrder(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "order/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:41
    def updateOrder(id:Long): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "updateorder/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
  }

  // @LINE:57
  class ReverseEmployeeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:59
    def updateEmployee(id:Long): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "updateemployee/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:58
    def getEmployees(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "employees")
    }
  
    // @LINE:61
    def deleteEmployee(id:Long): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "deleteemployee/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:60
    def addEmployee(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addemployee")
    }
  
    // @LINE:57
    def getEmployee(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "employee/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
  }

  // @LINE:15
  class ReverseAddressController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:18
    def addAddress(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addaddress")
    }
  
    // @LINE:16
    def getAddresses(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addresses")
    }
  
    // @LINE:19
    def deleteAddress(id:Long): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "deleteaddress/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:17
    def updateAddress(id:Long): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "updateaddres/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:15
    def getAddress(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "address/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
  }


}
