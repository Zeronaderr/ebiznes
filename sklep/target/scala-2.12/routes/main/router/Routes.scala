// @GENERATOR:play-routes-compiler
// @SOURCE:D:/ebiznes/sklep/conf/routes
// @DATE:Sun Apr 26 18:37:46 CEST 2020

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:7
  HomeController_12: controllers.HomeController,
  // @LINE:10
  ProductController_9: controllers.ProductController,
  // @LINE:23
  AddressController_3: controllers.AddressController,
  // @LINE:33
  BrandController_6: controllers.BrandController,
  // @LINE:42
  CustomerController_7: controllers.CustomerController,
  // @LINE:51
  DiscountController_13: controllers.DiscountController,
  // @LINE:60
  OrderController_1: controllers.OrderController,
  // @LINE:65
  ShipperController_8: controllers.ShipperController,
  // @LINE:74
  PaymentController_5: controllers.PaymentController,
  // @LINE:79
  EmployeeController_2: controllers.EmployeeController,
  // @LINE:89
  ProductCategoryController_0: controllers.ProductCategoryController,
  // @LINE:101
  CountController_4: controllers.CountController,
  // @LINE:103
  AsyncController_11: controllers.AsyncController,
  // @LINE:106
  Assets_10: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
    HomeController_12: controllers.HomeController,
    // @LINE:10
    ProductController_9: controllers.ProductController,
    // @LINE:23
    AddressController_3: controllers.AddressController,
    // @LINE:33
    BrandController_6: controllers.BrandController,
    // @LINE:42
    CustomerController_7: controllers.CustomerController,
    // @LINE:51
    DiscountController_13: controllers.DiscountController,
    // @LINE:60
    OrderController_1: controllers.OrderController,
    // @LINE:65
    ShipperController_8: controllers.ShipperController,
    // @LINE:74
    PaymentController_5: controllers.PaymentController,
    // @LINE:79
    EmployeeController_2: controllers.EmployeeController,
    // @LINE:89
    ProductCategoryController_0: controllers.ProductCategoryController,
    // @LINE:101
    CountController_4: controllers.CountController,
    // @LINE:103
    AsyncController_11: controllers.AsyncController,
    // @LINE:106
    Assets_10: controllers.Assets
  ) = this(errorHandler, HomeController_12, ProductController_9, AddressController_3, BrandController_6, CustomerController_7, DiscountController_13, OrderController_1, ShipperController_8, PaymentController_5, EmployeeController_2, ProductCategoryController_0, CountController_4, AsyncController_11, Assets_10, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_12, ProductController_9, AddressController_3, BrandController_6, CustomerController_7, DiscountController_13, OrderController_1, ShipperController_8, PaymentController_5, EmployeeController_2, ProductCategoryController_0, CountController_4, AsyncController_11, Assets_10, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/addproduct""", """controllers.ProductController.addProductApi"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/product/""" + "$" + """id<[^/]+>""", """controllers.ProductController.getProductApi(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/products""", """controllers.ProductController.getProductsApi"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """product/""" + "$" + """id<[^/]+>""", """controllers.ProductController.getProduct(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """products""", """controllers.ProductController.getProducts"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateproduct/""" + "$" + """id<[^/]+>""", """controllers.ProductController.updateProduct(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addproduct""", """controllers.ProductController.addProduct"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addproducthandle""", """controllers.ProductController.addProductHandle"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateproducthandle""", """controllers.ProductController.updateProductHandle"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteproduct/""" + "$" + """id<[^/]+>""", """controllers.ProductController.deleteProduct(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/addaddress""", """controllers.AddressController.addAddressApi"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/address/""" + "$" + """id<[^/]+>""", """controllers.AddressController.getAddressApi(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/addresses""", """controllers.AddressController.getAddressesApi"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addaddresshandle""", """controllers.AddressController.addAddressHandle()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateaddresshandle""", """controllers.AddressController.updateAddressHandle()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateaddres/""" + "$" + """id<[^/]+>""", """controllers.AddressController.updateAddress(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addaddress""", """controllers.AddressController.addAddress()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteaddress/""" + "$" + """id<[^/]+>""", """controllers.AddressController.deleteAddress(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/brand/""" + "$" + """id<[^/]+>""", """controllers.BrandController.getBrandApi(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/brands""", """controllers.BrandController.getBrandsApi"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/addbrand""", """controllers.BrandController.addBrandApi"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updatebrandhandle""", """controllers.BrandController.updateBrandHandle()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addbrandhandle""", """controllers.BrandController.addBrandHandle()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updatebrand/""" + "$" + """id<[^/]+>""", """controllers.BrandController.updateBrand(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addbrand""", """controllers.BrandController.addBrand()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deletebrand/""" + "$" + """id<[^/]+>""", """controllers.BrandController.deleteBrand(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/customer/""" + "$" + """id<[^/]+>""", """controllers.CustomerController.getCustomerApi(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/customers""", """controllers.CustomerController.getCustomersApi"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/addcustomer""", """controllers.CustomerController.addCustomerApi"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updatecustomerhandle""", """controllers.CustomerController.updateCustomerHandle()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addcustomerhandle""", """controllers.CustomerController.addCustomerHandle()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updatecustomer/""" + "$" + """id<[^/]+>""", """controllers.CustomerController.updateCustomer(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addcustomer""", """controllers.CustomerController.addCustomer()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deletecustomer/""" + "$" + """id<[^/]+>""", """controllers.CustomerController.deleteCustomer(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/discount/""" + "$" + """id<[^/]+>""", """controllers.DiscountController.getDiscountApi(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/discounts""", """controllers.DiscountController.getDiscountsApi"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/adddiscount""", """controllers.DiscountController.addDiscountApi"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updatediscounthandle""", """controllers.DiscountController.updateDiscountHandle()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """adddiscounthandle""", """controllers.DiscountController.addDiscountHandle()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updatediscount/""" + "$" + """id<[^/]+>""", """controllers.DiscountController.updateDiscount(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """adddiscount""", """controllers.DiscountController.addDiscount()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deletediscount/""" + "$" + """id<[^/]+>""", """controllers.DiscountController.deleteDiscount(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/order/""" + "$" + """id<[^/]+>""", """controllers.OrderController.getOrderApi(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/orders""", """controllers.OrderController.getOrdersApi()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/addorder""", """controllers.OrderController.addOrderApi()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteorder/""" + "$" + """id<[^/]+>""", """controllers.OrderController.deleteOrder(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/shipper/""" + "$" + """id<[^/]+>""", """controllers.ShipperController.getShipperApi(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/shippers""", """controllers.ShipperController.getShippersApi()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/addshipper""", """controllers.ShipperController.addShipperApi()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateshipperhandle""", """controllers.ShipperController.updateShipperHandle()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addshipperhandle""", """controllers.ShipperController.addShipperHandle()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateshipper/""" + "$" + """id<[^/]+>""", """controllers.ShipperController.updateShipper(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addshipper""", """controllers.ShipperController.addShipper()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteshipper/""" + "$" + """id<[^/]+>""", """controllers.ShipperController.deleteShipper(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/payment/""" + "$" + """id<[^/]+>""", """controllers.PaymentController.getPaymentApi(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/payments""", """controllers.PaymentController.getPaymentsApi"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/addpayment""", """controllers.PaymentController.addPaymentApi()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deletepayment/""" + "$" + """id<[^/]+>""", """controllers.PaymentController.deletePayment(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/employee/""" + "$" + """id<[^/]+>""", """controllers.EmployeeController.getEmployeeApi(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/employees""", """controllers.EmployeeController.getEmployeesApi"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/addemployee""", """controllers.EmployeeController.addEmployeeApi"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateemployeehandle""", """controllers.EmployeeController.updateEmployeeHandle()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addemployeehandle""", """controllers.EmployeeController.addEmployeeHandle()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateemployee/""" + "$" + """id<[^/]+>""", """controllers.EmployeeController.updateEmployee(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addemployee""", """controllers.EmployeeController.addEmployee()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteemployee/""" + "$" + """id<[^/]+>""", """controllers.EmployeeController.deleteEmployee(id:Int)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/addproductcategory""", """controllers.ProductCategoryController.addProductCategoryApi"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/productcategory/""" + "$" + """id<[^/]+>""", """controllers.ProductCategoryController.getProductCategoryApi(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/productcategories""", """controllers.ProductCategoryController.getProductCategoriesApi"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """productcategory/""" + "$" + """id<[^/]+>""", """controllers.ProductCategoryController.getProductCategory(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """productcategories""", """controllers.ProductCategoryController.getProductCategories()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateproductcategory/""" + "$" + """id<[^/]+>""", """controllers.ProductCategoryController.updateProductCategory(id:Int)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addproductcategoryhandle""", """controllers.ProductCategoryController.addProductCategoryHandle()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addproductcategory""", """controllers.ProductCategoryController.addProductCategory()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateproductcategoryhandle""", """controllers.ProductCategoryController.updateProductCategoryHandle()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteproductcategory/""" + "$" + """id<[^/]+>""", """controllers.ProductCategoryController.deleteProductCategory(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """count""", """controllers.CountController.count"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:7
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_12.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_ProductController_addProductApi1_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/addproduct")))
  )
  private[this] lazy val controllers_ProductController_addProductApi1_invoker = createInvoker(
    ProductController_9.addProductApi,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductController",
      "addProductApi",
      Nil,
      "POST",
      this.prefix + """api/addproduct""",
      """ PRODUCTS
API""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_ProductController_getProductApi2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/product/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProductController_getProductApi2_invoker = createInvoker(
    ProductController_9.getProductApi(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductController",
      "getProductApi",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """api/product/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_ProductController_getProductsApi3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/products")))
  )
  private[this] lazy val controllers_ProductController_getProductsApi3_invoker = createInvoker(
    ProductController_9.getProductsApi,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductController",
      "getProductsApi",
      Nil,
      "GET",
      this.prefix + """api/products""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_ProductController_getProduct4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("product/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProductController_getProduct4_invoker = createInvoker(
    ProductController_9.getProduct(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductController",
      "getProduct",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """product/""" + "$" + """id<[^/]+>""",
      """ENDAPI""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_ProductController_getProducts5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("products")))
  )
  private[this] lazy val controllers_ProductController_getProducts5_invoker = createInvoker(
    ProductController_9.getProducts,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductController",
      "getProducts",
      Nil,
      "GET",
      this.prefix + """products""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_ProductController_updateProduct6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateproduct/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProductController_updateProduct6_invoker = createInvoker(
    ProductController_9.updateProduct(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductController",
      "updateProduct",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """updateproduct/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_ProductController_addProduct7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addproduct")))
  )
  private[this] lazy val controllers_ProductController_addProduct7_invoker = createInvoker(
    ProductController_9.addProduct,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductController",
      "addProduct",
      Nil,
      "GET",
      this.prefix + """addproduct""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_ProductController_addProductHandle8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addproducthandle")))
  )
  private[this] lazy val controllers_ProductController_addProductHandle8_invoker = createInvoker(
    ProductController_9.addProductHandle,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductController",
      "addProductHandle",
      Nil,
      "POST",
      this.prefix + """addproducthandle""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_ProductController_updateProductHandle9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateproducthandle")))
  )
  private[this] lazy val controllers_ProductController_updateProductHandle9_invoker = createInvoker(
    ProductController_9.updateProductHandle,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductController",
      "updateProductHandle",
      Nil,
      "POST",
      this.prefix + """updateproducthandle""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_ProductController_deleteProduct10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteproduct/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProductController_deleteProduct10_invoker = createInvoker(
    ProductController_9.deleteProduct(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductController",
      "deleteProduct",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """deleteproduct/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val controllers_AddressController_addAddressApi11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/addaddress")))
  )
  private[this] lazy val controllers_AddressController_addAddressApi11_invoker = createInvoker(
    AddressController_3.addAddressApi,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AddressController",
      "addAddressApi",
      Nil,
      "POST",
      this.prefix + """api/addaddress""",
      """ addresses
API""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_AddressController_getAddressApi12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/address/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AddressController_getAddressApi12_invoker = createInvoker(
    AddressController_3.getAddressApi(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AddressController",
      "getAddressApi",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """api/address/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_AddressController_getAddressesApi13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/addresses")))
  )
  private[this] lazy val controllers_AddressController_getAddressesApi13_invoker = createInvoker(
    AddressController_3.getAddressesApi,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AddressController",
      "getAddressesApi",
      Nil,
      "GET",
      this.prefix + """api/addresses""",
      """""",
      Seq()
    )
  )

  // @LINE:27
  private[this] lazy val controllers_AddressController_addAddressHandle14_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addaddresshandle")))
  )
  private[this] lazy val controllers_AddressController_addAddressHandle14_invoker = createInvoker(
    AddressController_3.addAddressHandle(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AddressController",
      "addAddressHandle",
      Nil,
      "POST",
      this.prefix + """addaddresshandle""",
      """ENDAPI""",
      Seq()
    )
  )

  // @LINE:28
  private[this] lazy val controllers_AddressController_updateAddressHandle15_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateaddresshandle")))
  )
  private[this] lazy val controllers_AddressController_updateAddressHandle15_invoker = createInvoker(
    AddressController_3.updateAddressHandle(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AddressController",
      "updateAddressHandle",
      Nil,
      "POST",
      this.prefix + """updateaddresshandle""",
      """""",
      Seq()
    )
  )

  // @LINE:29
  private[this] lazy val controllers_AddressController_updateAddress16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateaddres/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AddressController_updateAddress16_invoker = createInvoker(
    AddressController_3.updateAddress(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AddressController",
      "updateAddress",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """updateaddres/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:30
  private[this] lazy val controllers_AddressController_addAddress17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addaddress")))
  )
  private[this] lazy val controllers_AddressController_addAddress17_invoker = createInvoker(
    AddressController_3.addAddress(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AddressController",
      "addAddress",
      Nil,
      "GET",
      this.prefix + """addaddress""",
      """""",
      Seq()
    )
  )

  // @LINE:31
  private[this] lazy val controllers_AddressController_deleteAddress18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteaddress/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AddressController_deleteAddress18_invoker = createInvoker(
    AddressController_3.deleteAddress(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AddressController",
      "deleteAddress",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """deleteaddress/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:33
  private[this] lazy val controllers_BrandController_getBrandApi19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/brand/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BrandController_getBrandApi19_invoker = createInvoker(
    BrandController_6.getBrandApi(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BrandController",
      "getBrandApi",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """api/brand/""" + "$" + """id<[^/]+>""",
      """ brands""",
      Seq()
    )
  )

  // @LINE:34
  private[this] lazy val controllers_BrandController_getBrandsApi20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/brands")))
  )
  private[this] lazy val controllers_BrandController_getBrandsApi20_invoker = createInvoker(
    BrandController_6.getBrandsApi,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BrandController",
      "getBrandsApi",
      Nil,
      "GET",
      this.prefix + """api/brands""",
      """""",
      Seq()
    )
  )

  // @LINE:35
  private[this] lazy val controllers_BrandController_addBrandApi21_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/addbrand")))
  )
  private[this] lazy val controllers_BrandController_addBrandApi21_invoker = createInvoker(
    BrandController_6.addBrandApi,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BrandController",
      "addBrandApi",
      Nil,
      "POST",
      this.prefix + """api/addbrand""",
      """""",
      Seq()
    )
  )

  // @LINE:36
  private[this] lazy val controllers_BrandController_updateBrandHandle22_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updatebrandhandle")))
  )
  private[this] lazy val controllers_BrandController_updateBrandHandle22_invoker = createInvoker(
    BrandController_6.updateBrandHandle(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BrandController",
      "updateBrandHandle",
      Nil,
      "POST",
      this.prefix + """updatebrandhandle""",
      """""",
      Seq()
    )
  )

  // @LINE:37
  private[this] lazy val controllers_BrandController_addBrandHandle23_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addbrandhandle")))
  )
  private[this] lazy val controllers_BrandController_addBrandHandle23_invoker = createInvoker(
    BrandController_6.addBrandHandle(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BrandController",
      "addBrandHandle",
      Nil,
      "POST",
      this.prefix + """addbrandhandle""",
      """""",
      Seq()
    )
  )

  // @LINE:38
  private[this] lazy val controllers_BrandController_updateBrand24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updatebrand/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BrandController_updateBrand24_invoker = createInvoker(
    BrandController_6.updateBrand(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BrandController",
      "updateBrand",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """updatebrand/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:39
  private[this] lazy val controllers_BrandController_addBrand25_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addbrand")))
  )
  private[this] lazy val controllers_BrandController_addBrand25_invoker = createInvoker(
    BrandController_6.addBrand(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BrandController",
      "addBrand",
      Nil,
      "GET",
      this.prefix + """addbrand""",
      """""",
      Seq()
    )
  )

  // @LINE:40
  private[this] lazy val controllers_BrandController_deleteBrand26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deletebrand/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BrandController_deleteBrand26_invoker = createInvoker(
    BrandController_6.deleteBrand(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BrandController",
      "deleteBrand",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """deletebrand/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:42
  private[this] lazy val controllers_CustomerController_getCustomerApi27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/customer/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CustomerController_getCustomerApi27_invoker = createInvoker(
    CustomerController_7.getCustomerApi(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CustomerController",
      "getCustomerApi",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """api/customer/""" + "$" + """id<[^/]+>""",
      """ customers""",
      Seq()
    )
  )

  // @LINE:43
  private[this] lazy val controllers_CustomerController_getCustomersApi28_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/customers")))
  )
  private[this] lazy val controllers_CustomerController_getCustomersApi28_invoker = createInvoker(
    CustomerController_7.getCustomersApi,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CustomerController",
      "getCustomersApi",
      Nil,
      "GET",
      this.prefix + """api/customers""",
      """""",
      Seq()
    )
  )

  // @LINE:44
  private[this] lazy val controllers_CustomerController_addCustomerApi29_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/addcustomer")))
  )
  private[this] lazy val controllers_CustomerController_addCustomerApi29_invoker = createInvoker(
    CustomerController_7.addCustomerApi,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CustomerController",
      "addCustomerApi",
      Nil,
      "POST",
      this.prefix + """api/addcustomer""",
      """""",
      Seq()
    )
  )

  // @LINE:45
  private[this] lazy val controllers_CustomerController_updateCustomerHandle30_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updatecustomerhandle")))
  )
  private[this] lazy val controllers_CustomerController_updateCustomerHandle30_invoker = createInvoker(
    CustomerController_7.updateCustomerHandle(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CustomerController",
      "updateCustomerHandle",
      Nil,
      "POST",
      this.prefix + """updatecustomerhandle""",
      """""",
      Seq()
    )
  )

  // @LINE:46
  private[this] lazy val controllers_CustomerController_addCustomerHandle31_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addcustomerhandle")))
  )
  private[this] lazy val controllers_CustomerController_addCustomerHandle31_invoker = createInvoker(
    CustomerController_7.addCustomerHandle(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CustomerController",
      "addCustomerHandle",
      Nil,
      "POST",
      this.prefix + """addcustomerhandle""",
      """""",
      Seq()
    )
  )

  // @LINE:47
  private[this] lazy val controllers_CustomerController_updateCustomer32_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updatecustomer/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CustomerController_updateCustomer32_invoker = createInvoker(
    CustomerController_7.updateCustomer(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CustomerController",
      "updateCustomer",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """updatecustomer/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:48
  private[this] lazy val controllers_CustomerController_addCustomer33_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addcustomer")))
  )
  private[this] lazy val controllers_CustomerController_addCustomer33_invoker = createInvoker(
    CustomerController_7.addCustomer(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CustomerController",
      "addCustomer",
      Nil,
      "GET",
      this.prefix + """addcustomer""",
      """""",
      Seq()
    )
  )

  // @LINE:49
  private[this] lazy val controllers_CustomerController_deleteCustomer34_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deletecustomer/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CustomerController_deleteCustomer34_invoker = createInvoker(
    CustomerController_7.deleteCustomer(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CustomerController",
      "deleteCustomer",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """deletecustomer/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:51
  private[this] lazy val controllers_DiscountController_getDiscountApi35_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/discount/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_DiscountController_getDiscountApi35_invoker = createInvoker(
    DiscountController_13.getDiscountApi(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DiscountController",
      "getDiscountApi",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """api/discount/""" + "$" + """id<[^/]+>""",
      """ brands""",
      Seq()
    )
  )

  // @LINE:52
  private[this] lazy val controllers_DiscountController_getDiscountsApi36_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/discounts")))
  )
  private[this] lazy val controllers_DiscountController_getDiscountsApi36_invoker = createInvoker(
    DiscountController_13.getDiscountsApi,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DiscountController",
      "getDiscountsApi",
      Nil,
      "GET",
      this.prefix + """api/discounts""",
      """""",
      Seq()
    )
  )

  // @LINE:53
  private[this] lazy val controllers_DiscountController_addDiscountApi37_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/adddiscount")))
  )
  private[this] lazy val controllers_DiscountController_addDiscountApi37_invoker = createInvoker(
    DiscountController_13.addDiscountApi,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DiscountController",
      "addDiscountApi",
      Nil,
      "POST",
      this.prefix + """api/adddiscount""",
      """""",
      Seq()
    )
  )

  // @LINE:54
  private[this] lazy val controllers_DiscountController_updateDiscountHandle38_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updatediscounthandle")))
  )
  private[this] lazy val controllers_DiscountController_updateDiscountHandle38_invoker = createInvoker(
    DiscountController_13.updateDiscountHandle(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DiscountController",
      "updateDiscountHandle",
      Nil,
      "POST",
      this.prefix + """updatediscounthandle""",
      """""",
      Seq()
    )
  )

  // @LINE:55
  private[this] lazy val controllers_DiscountController_addDiscountHandle39_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("adddiscounthandle")))
  )
  private[this] lazy val controllers_DiscountController_addDiscountHandle39_invoker = createInvoker(
    DiscountController_13.addDiscountHandle(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DiscountController",
      "addDiscountHandle",
      Nil,
      "POST",
      this.prefix + """adddiscounthandle""",
      """""",
      Seq()
    )
  )

  // @LINE:56
  private[this] lazy val controllers_DiscountController_updateDiscount40_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updatediscount/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_DiscountController_updateDiscount40_invoker = createInvoker(
    DiscountController_13.updateDiscount(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DiscountController",
      "updateDiscount",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """updatediscount/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:57
  private[this] lazy val controllers_DiscountController_addDiscount41_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("adddiscount")))
  )
  private[this] lazy val controllers_DiscountController_addDiscount41_invoker = createInvoker(
    DiscountController_13.addDiscount(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DiscountController",
      "addDiscount",
      Nil,
      "GET",
      this.prefix + """adddiscount""",
      """""",
      Seq()
    )
  )

  // @LINE:58
  private[this] lazy val controllers_DiscountController_deleteDiscount42_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deletediscount/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_DiscountController_deleteDiscount42_invoker = createInvoker(
    DiscountController_13.deleteDiscount(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DiscountController",
      "deleteDiscount",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """deletediscount/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:60
  private[this] lazy val controllers_OrderController_getOrderApi43_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/order/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_OrderController_getOrderApi43_invoker = createInvoker(
    OrderController_1.getOrderApi(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrderController",
      "getOrderApi",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """api/order/""" + "$" + """id<[^/]+>""",
      """ orders""",
      Seq()
    )
  )

  // @LINE:61
  private[this] lazy val controllers_OrderController_getOrdersApi44_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/orders")))
  )
  private[this] lazy val controllers_OrderController_getOrdersApi44_invoker = createInvoker(
    OrderController_1.getOrdersApi(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrderController",
      "getOrdersApi",
      Nil,
      "GET",
      this.prefix + """api/orders""",
      """""",
      Seq()
    )
  )

  // @LINE:62
  private[this] lazy val controllers_OrderController_addOrderApi45_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/addorder")))
  )
  private[this] lazy val controllers_OrderController_addOrderApi45_invoker = createInvoker(
    OrderController_1.addOrderApi(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrderController",
      "addOrderApi",
      Nil,
      "POST",
      this.prefix + """api/addorder""",
      """""",
      Seq()
    )
  )

  // @LINE:63
  private[this] lazy val controllers_OrderController_deleteOrder46_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteorder/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_OrderController_deleteOrder46_invoker = createInvoker(
    OrderController_1.deleteOrder(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrderController",
      "deleteOrder",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """deleteorder/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:65
  private[this] lazy val controllers_ShipperController_getShipperApi47_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/shipper/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShipperController_getShipperApi47_invoker = createInvoker(
    ShipperController_8.getShipperApi(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShipperController",
      "getShipperApi",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """api/shipper/""" + "$" + """id<[^/]+>""",
      """ shippers""",
      Seq()
    )
  )

  // @LINE:66
  private[this] lazy val controllers_ShipperController_getShippersApi48_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/shippers")))
  )
  private[this] lazy val controllers_ShipperController_getShippersApi48_invoker = createInvoker(
    ShipperController_8.getShippersApi(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShipperController",
      "getShippersApi",
      Nil,
      "GET",
      this.prefix + """api/shippers""",
      """""",
      Seq()
    )
  )

  // @LINE:67
  private[this] lazy val controllers_ShipperController_addShipperApi49_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/addshipper")))
  )
  private[this] lazy val controllers_ShipperController_addShipperApi49_invoker = createInvoker(
    ShipperController_8.addShipperApi(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShipperController",
      "addShipperApi",
      Nil,
      "POST",
      this.prefix + """api/addshipper""",
      """""",
      Seq()
    )
  )

  // @LINE:68
  private[this] lazy val controllers_ShipperController_updateShipperHandle50_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateshipperhandle")))
  )
  private[this] lazy val controllers_ShipperController_updateShipperHandle50_invoker = createInvoker(
    ShipperController_8.updateShipperHandle(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShipperController",
      "updateShipperHandle",
      Nil,
      "POST",
      this.prefix + """updateshipperhandle""",
      """""",
      Seq()
    )
  )

  // @LINE:69
  private[this] lazy val controllers_ShipperController_addShipperHandle51_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addshipperhandle")))
  )
  private[this] lazy val controllers_ShipperController_addShipperHandle51_invoker = createInvoker(
    ShipperController_8.addShipperHandle(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShipperController",
      "addShipperHandle",
      Nil,
      "POST",
      this.prefix + """addshipperhandle""",
      """""",
      Seq()
    )
  )

  // @LINE:70
  private[this] lazy val controllers_ShipperController_updateShipper52_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateshipper/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShipperController_updateShipper52_invoker = createInvoker(
    ShipperController_8.updateShipper(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShipperController",
      "updateShipper",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """updateshipper/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:71
  private[this] lazy val controllers_ShipperController_addShipper53_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addshipper")))
  )
  private[this] lazy val controllers_ShipperController_addShipper53_invoker = createInvoker(
    ShipperController_8.addShipper(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShipperController",
      "addShipper",
      Nil,
      "GET",
      this.prefix + """addshipper""",
      """""",
      Seq()
    )
  )

  // @LINE:72
  private[this] lazy val controllers_ShipperController_deleteShipper54_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteshipper/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShipperController_deleteShipper54_invoker = createInvoker(
    ShipperController_8.deleteShipper(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShipperController",
      "deleteShipper",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """deleteshipper/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:74
  private[this] lazy val controllers_PaymentController_getPaymentApi55_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/payment/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PaymentController_getPaymentApi55_invoker = createInvoker(
    PaymentController_5.getPaymentApi(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PaymentController",
      "getPaymentApi",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """api/payment/""" + "$" + """id<[^/]+>""",
      """ payments""",
      Seq()
    )
  )

  // @LINE:75
  private[this] lazy val controllers_PaymentController_getPaymentsApi56_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/payments")))
  )
  private[this] lazy val controllers_PaymentController_getPaymentsApi56_invoker = createInvoker(
    PaymentController_5.getPaymentsApi,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PaymentController",
      "getPaymentsApi",
      Nil,
      "GET",
      this.prefix + """api/payments""",
      """""",
      Seq()
    )
  )

  // @LINE:76
  private[this] lazy val controllers_PaymentController_addPaymentApi57_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/addpayment")))
  )
  private[this] lazy val controllers_PaymentController_addPaymentApi57_invoker = createInvoker(
    PaymentController_5.addPaymentApi(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PaymentController",
      "addPaymentApi",
      Nil,
      "POST",
      this.prefix + """api/addpayment""",
      """""",
      Seq()
    )
  )

  // @LINE:77
  private[this] lazy val controllers_PaymentController_deletePayment58_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deletepayment/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PaymentController_deletePayment58_invoker = createInvoker(
    PaymentController_5.deletePayment(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PaymentController",
      "deletePayment",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """deletepayment/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:79
  private[this] lazy val controllers_EmployeeController_getEmployeeApi59_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/employee/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_EmployeeController_getEmployeeApi59_invoker = createInvoker(
    EmployeeController_2.getEmployeeApi(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EmployeeController",
      "getEmployeeApi",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """api/employee/""" + "$" + """id<[^/]+>""",
      """ employees""",
      Seq()
    )
  )

  // @LINE:80
  private[this] lazy val controllers_EmployeeController_getEmployeesApi60_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/employees")))
  )
  private[this] lazy val controllers_EmployeeController_getEmployeesApi60_invoker = createInvoker(
    EmployeeController_2.getEmployeesApi,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EmployeeController",
      "getEmployeesApi",
      Nil,
      "GET",
      this.prefix + """api/employees""",
      """""",
      Seq()
    )
  )

  // @LINE:81
  private[this] lazy val controllers_EmployeeController_addEmployeeApi61_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/addemployee")))
  )
  private[this] lazy val controllers_EmployeeController_addEmployeeApi61_invoker = createInvoker(
    EmployeeController_2.addEmployeeApi,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EmployeeController",
      "addEmployeeApi",
      Nil,
      "POST",
      this.prefix + """api/addemployee""",
      """""",
      Seq()
    )
  )

  // @LINE:82
  private[this] lazy val controllers_EmployeeController_updateEmployeeHandle62_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateemployeehandle")))
  )
  private[this] lazy val controllers_EmployeeController_updateEmployeeHandle62_invoker = createInvoker(
    EmployeeController_2.updateEmployeeHandle(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EmployeeController",
      "updateEmployeeHandle",
      Nil,
      "POST",
      this.prefix + """updateemployeehandle""",
      """""",
      Seq()
    )
  )

  // @LINE:83
  private[this] lazy val controllers_EmployeeController_addEmployeeHandle63_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addemployeehandle")))
  )
  private[this] lazy val controllers_EmployeeController_addEmployeeHandle63_invoker = createInvoker(
    EmployeeController_2.addEmployeeHandle(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EmployeeController",
      "addEmployeeHandle",
      Nil,
      "POST",
      this.prefix + """addemployeehandle""",
      """""",
      Seq()
    )
  )

  // @LINE:84
  private[this] lazy val controllers_EmployeeController_updateEmployee64_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateemployee/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_EmployeeController_updateEmployee64_invoker = createInvoker(
    EmployeeController_2.updateEmployee(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EmployeeController",
      "updateEmployee",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """updateemployee/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:85
  private[this] lazy val controllers_EmployeeController_addEmployee65_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addemployee")))
  )
  private[this] lazy val controllers_EmployeeController_addEmployee65_invoker = createInvoker(
    EmployeeController_2.addEmployee(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EmployeeController",
      "addEmployee",
      Nil,
      "GET",
      this.prefix + """addemployee""",
      """""",
      Seq()
    )
  )

  // @LINE:86
  private[this] lazy val controllers_EmployeeController_deleteEmployee66_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteemployee/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_EmployeeController_deleteEmployee66_invoker = createInvoker(
    EmployeeController_2.deleteEmployee(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EmployeeController",
      "deleteEmployee",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """deleteemployee/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:89
  private[this] lazy val controllers_ProductCategoryController_addProductCategoryApi67_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/addproductcategory")))
  )
  private[this] lazy val controllers_ProductCategoryController_addProductCategoryApi67_invoker = createInvoker(
    ProductCategoryController_0.addProductCategoryApi,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductCategoryController",
      "addProductCategoryApi",
      Nil,
      "POST",
      this.prefix + """api/addproductcategory""",
      """ PRODUCT CATEGORIES
API""",
      Seq()
    )
  )

  // @LINE:90
  private[this] lazy val controllers_ProductCategoryController_getProductCategoryApi68_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/productcategory/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProductCategoryController_getProductCategoryApi68_invoker = createInvoker(
    ProductCategoryController_0.getProductCategoryApi(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductCategoryController",
      "getProductCategoryApi",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """api/productcategory/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:91
  private[this] lazy val controllers_ProductCategoryController_getProductCategoriesApi69_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/productcategories")))
  )
  private[this] lazy val controllers_ProductCategoryController_getProductCategoriesApi69_invoker = createInvoker(
    ProductCategoryController_0.getProductCategoriesApi,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductCategoryController",
      "getProductCategoriesApi",
      Nil,
      "GET",
      this.prefix + """api/productcategories""",
      """""",
      Seq()
    )
  )

  // @LINE:93
  private[this] lazy val controllers_ProductCategoryController_getProductCategory70_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("productcategory/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProductCategoryController_getProductCategory70_invoker = createInvoker(
    ProductCategoryController_0.getProductCategory(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductCategoryController",
      "getProductCategory",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """productcategory/""" + "$" + """id<[^/]+>""",
      """ENDAPI""",
      Seq()
    )
  )

  // @LINE:94
  private[this] lazy val controllers_ProductCategoryController_getProductCategories71_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("productcategories")))
  )
  private[this] lazy val controllers_ProductCategoryController_getProductCategories71_invoker = createInvoker(
    ProductCategoryController_0.getProductCategories(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductCategoryController",
      "getProductCategories",
      Nil,
      "GET",
      this.prefix + """productcategories""",
      """""",
      Seq()
    )
  )

  // @LINE:95
  private[this] lazy val controllers_ProductCategoryController_updateProductCategory72_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateproductcategory/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProductCategoryController_updateProductCategory72_invoker = createInvoker(
    ProductCategoryController_0.updateProductCategory(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductCategoryController",
      "updateProductCategory",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """updateproductcategory/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:96
  private[this] lazy val controllers_ProductCategoryController_addProductCategoryHandle73_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addproductcategoryhandle")))
  )
  private[this] lazy val controllers_ProductCategoryController_addProductCategoryHandle73_invoker = createInvoker(
    ProductCategoryController_0.addProductCategoryHandle(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductCategoryController",
      "addProductCategoryHandle",
      Nil,
      "POST",
      this.prefix + """addproductcategoryhandle""",
      """""",
      Seq()
    )
  )

  // @LINE:97
  private[this] lazy val controllers_ProductCategoryController_addProductCategory74_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addproductcategory")))
  )
  private[this] lazy val controllers_ProductCategoryController_addProductCategory74_invoker = createInvoker(
    ProductCategoryController_0.addProductCategory(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductCategoryController",
      "addProductCategory",
      Nil,
      "GET",
      this.prefix + """addproductcategory""",
      """""",
      Seq()
    )
  )

  // @LINE:98
  private[this] lazy val controllers_ProductCategoryController_updateProductCategoryHandle75_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateproductcategoryhandle")))
  )
  private[this] lazy val controllers_ProductCategoryController_updateProductCategoryHandle75_invoker = createInvoker(
    ProductCategoryController_0.updateProductCategoryHandle(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductCategoryController",
      "updateProductCategoryHandle",
      Nil,
      "POST",
      this.prefix + """updateproductcategoryhandle""",
      """""",
      Seq()
    )
  )

  // @LINE:99
  private[this] lazy val controllers_ProductCategoryController_deleteProductCategory76_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteproductcategory/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProductCategoryController_deleteProductCategory76_invoker = createInvoker(
    ProductCategoryController_0.deleteProductCategory(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductCategoryController",
      "deleteProductCategory",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """deleteproductcategory/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:101
  private[this] lazy val controllers_CountController_count77_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count77_invoker = createInvoker(
    CountController_4.count,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CountController",
      "count",
      Nil,
      "GET",
      this.prefix + """count""",
      """ An example controller showing how to use dependency injection""",
      Seq()
    )
  )

  // @LINE:103
  private[this] lazy val controllers_AsyncController_message78_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message78_invoker = createInvoker(
    AsyncController_11.message,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AsyncController",
      "message",
      Nil,
      "GET",
      this.prefix + """message""",
      """ An example controller showing how to write asynchronous code""",
      Seq()
    )
  )

  // @LINE:106
  private[this] lazy val controllers_Assets_versioned79_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned79_invoker = createInvoker(
    Assets_10.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:7
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_12.index)
      }
  
    // @LINE:10
    case controllers_ProductController_addProductApi1_route(params@_) =>
      call { 
        controllers_ProductController_addProductApi1_invoker.call(ProductController_9.addProductApi)
      }
  
    // @LINE:11
    case controllers_ProductController_getProductApi2_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_ProductController_getProductApi2_invoker.call(ProductController_9.getProductApi(id))
      }
  
    // @LINE:12
    case controllers_ProductController_getProductsApi3_route(params@_) =>
      call { 
        controllers_ProductController_getProductsApi3_invoker.call(ProductController_9.getProductsApi)
      }
  
    // @LINE:14
    case controllers_ProductController_getProduct4_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ProductController_getProduct4_invoker.call(ProductController_9.getProduct(id))
      }
  
    // @LINE:15
    case controllers_ProductController_getProducts5_route(params@_) =>
      call { 
        controllers_ProductController_getProducts5_invoker.call(ProductController_9.getProducts)
      }
  
    // @LINE:16
    case controllers_ProductController_updateProduct6_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ProductController_updateProduct6_invoker.call(ProductController_9.updateProduct(id))
      }
  
    // @LINE:17
    case controllers_ProductController_addProduct7_route(params@_) =>
      call { 
        controllers_ProductController_addProduct7_invoker.call(ProductController_9.addProduct)
      }
  
    // @LINE:18
    case controllers_ProductController_addProductHandle8_route(params@_) =>
      call { 
        controllers_ProductController_addProductHandle8_invoker.call(ProductController_9.addProductHandle)
      }
  
    // @LINE:19
    case controllers_ProductController_updateProductHandle9_route(params@_) =>
      call { 
        controllers_ProductController_updateProductHandle9_invoker.call(ProductController_9.updateProductHandle)
      }
  
    // @LINE:20
    case controllers_ProductController_deleteProduct10_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ProductController_deleteProduct10_invoker.call(ProductController_9.deleteProduct(id))
      }
  
    // @LINE:23
    case controllers_AddressController_addAddressApi11_route(params@_) =>
      call { 
        controllers_AddressController_addAddressApi11_invoker.call(AddressController_3.addAddressApi)
      }
  
    // @LINE:24
    case controllers_AddressController_getAddressApi12_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_AddressController_getAddressApi12_invoker.call(AddressController_3.getAddressApi(id))
      }
  
    // @LINE:25
    case controllers_AddressController_getAddressesApi13_route(params@_) =>
      call { 
        controllers_AddressController_getAddressesApi13_invoker.call(AddressController_3.getAddressesApi)
      }
  
    // @LINE:27
    case controllers_AddressController_addAddressHandle14_route(params@_) =>
      call { 
        controllers_AddressController_addAddressHandle14_invoker.call(AddressController_3.addAddressHandle())
      }
  
    // @LINE:28
    case controllers_AddressController_updateAddressHandle15_route(params@_) =>
      call { 
        controllers_AddressController_updateAddressHandle15_invoker.call(AddressController_3.updateAddressHandle())
      }
  
    // @LINE:29
    case controllers_AddressController_updateAddress16_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_AddressController_updateAddress16_invoker.call(AddressController_3.updateAddress(id))
      }
  
    // @LINE:30
    case controllers_AddressController_addAddress17_route(params@_) =>
      call { 
        controllers_AddressController_addAddress17_invoker.call(AddressController_3.addAddress())
      }
  
    // @LINE:31
    case controllers_AddressController_deleteAddress18_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_AddressController_deleteAddress18_invoker.call(AddressController_3.deleteAddress(id))
      }
  
    // @LINE:33
    case controllers_BrandController_getBrandApi19_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_BrandController_getBrandApi19_invoker.call(BrandController_6.getBrandApi(id))
      }
  
    // @LINE:34
    case controllers_BrandController_getBrandsApi20_route(params@_) =>
      call { 
        controllers_BrandController_getBrandsApi20_invoker.call(BrandController_6.getBrandsApi)
      }
  
    // @LINE:35
    case controllers_BrandController_addBrandApi21_route(params@_) =>
      call { 
        controllers_BrandController_addBrandApi21_invoker.call(BrandController_6.addBrandApi)
      }
  
    // @LINE:36
    case controllers_BrandController_updateBrandHandle22_route(params@_) =>
      call { 
        controllers_BrandController_updateBrandHandle22_invoker.call(BrandController_6.updateBrandHandle())
      }
  
    // @LINE:37
    case controllers_BrandController_addBrandHandle23_route(params@_) =>
      call { 
        controllers_BrandController_addBrandHandle23_invoker.call(BrandController_6.addBrandHandle())
      }
  
    // @LINE:38
    case controllers_BrandController_updateBrand24_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_BrandController_updateBrand24_invoker.call(BrandController_6.updateBrand(id))
      }
  
    // @LINE:39
    case controllers_BrandController_addBrand25_route(params@_) =>
      call { 
        controllers_BrandController_addBrand25_invoker.call(BrandController_6.addBrand())
      }
  
    // @LINE:40
    case controllers_BrandController_deleteBrand26_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_BrandController_deleteBrand26_invoker.call(BrandController_6.deleteBrand(id))
      }
  
    // @LINE:42
    case controllers_CustomerController_getCustomerApi27_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_CustomerController_getCustomerApi27_invoker.call(CustomerController_7.getCustomerApi(id))
      }
  
    // @LINE:43
    case controllers_CustomerController_getCustomersApi28_route(params@_) =>
      call { 
        controllers_CustomerController_getCustomersApi28_invoker.call(CustomerController_7.getCustomersApi)
      }
  
    // @LINE:44
    case controllers_CustomerController_addCustomerApi29_route(params@_) =>
      call { 
        controllers_CustomerController_addCustomerApi29_invoker.call(CustomerController_7.addCustomerApi)
      }
  
    // @LINE:45
    case controllers_CustomerController_updateCustomerHandle30_route(params@_) =>
      call { 
        controllers_CustomerController_updateCustomerHandle30_invoker.call(CustomerController_7.updateCustomerHandle())
      }
  
    // @LINE:46
    case controllers_CustomerController_addCustomerHandle31_route(params@_) =>
      call { 
        controllers_CustomerController_addCustomerHandle31_invoker.call(CustomerController_7.addCustomerHandle())
      }
  
    // @LINE:47
    case controllers_CustomerController_updateCustomer32_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_CustomerController_updateCustomer32_invoker.call(CustomerController_7.updateCustomer(id))
      }
  
    // @LINE:48
    case controllers_CustomerController_addCustomer33_route(params@_) =>
      call { 
        controllers_CustomerController_addCustomer33_invoker.call(CustomerController_7.addCustomer())
      }
  
    // @LINE:49
    case controllers_CustomerController_deleteCustomer34_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_CustomerController_deleteCustomer34_invoker.call(CustomerController_7.deleteCustomer(id))
      }
  
    // @LINE:51
    case controllers_DiscountController_getDiscountApi35_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_DiscountController_getDiscountApi35_invoker.call(DiscountController_13.getDiscountApi(id))
      }
  
    // @LINE:52
    case controllers_DiscountController_getDiscountsApi36_route(params@_) =>
      call { 
        controllers_DiscountController_getDiscountsApi36_invoker.call(DiscountController_13.getDiscountsApi)
      }
  
    // @LINE:53
    case controllers_DiscountController_addDiscountApi37_route(params@_) =>
      call { 
        controllers_DiscountController_addDiscountApi37_invoker.call(DiscountController_13.addDiscountApi)
      }
  
    // @LINE:54
    case controllers_DiscountController_updateDiscountHandle38_route(params@_) =>
      call { 
        controllers_DiscountController_updateDiscountHandle38_invoker.call(DiscountController_13.updateDiscountHandle())
      }
  
    // @LINE:55
    case controllers_DiscountController_addDiscountHandle39_route(params@_) =>
      call { 
        controllers_DiscountController_addDiscountHandle39_invoker.call(DiscountController_13.addDiscountHandle())
      }
  
    // @LINE:56
    case controllers_DiscountController_updateDiscount40_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_DiscountController_updateDiscount40_invoker.call(DiscountController_13.updateDiscount(id))
      }
  
    // @LINE:57
    case controllers_DiscountController_addDiscount41_route(params@_) =>
      call { 
        controllers_DiscountController_addDiscount41_invoker.call(DiscountController_13.addDiscount())
      }
  
    // @LINE:58
    case controllers_DiscountController_deleteDiscount42_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_DiscountController_deleteDiscount42_invoker.call(DiscountController_13.deleteDiscount(id))
      }
  
    // @LINE:60
    case controllers_OrderController_getOrderApi43_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_OrderController_getOrderApi43_invoker.call(OrderController_1.getOrderApi(id))
      }
  
    // @LINE:61
    case controllers_OrderController_getOrdersApi44_route(params@_) =>
      call { 
        controllers_OrderController_getOrdersApi44_invoker.call(OrderController_1.getOrdersApi())
      }
  
    // @LINE:62
    case controllers_OrderController_addOrderApi45_route(params@_) =>
      call { 
        controllers_OrderController_addOrderApi45_invoker.call(OrderController_1.addOrderApi())
      }
  
    // @LINE:63
    case controllers_OrderController_deleteOrder46_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_OrderController_deleteOrder46_invoker.call(OrderController_1.deleteOrder(id))
      }
  
    // @LINE:65
    case controllers_ShipperController_getShipperApi47_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_ShipperController_getShipperApi47_invoker.call(ShipperController_8.getShipperApi(id))
      }
  
    // @LINE:66
    case controllers_ShipperController_getShippersApi48_route(params@_) =>
      call { 
        controllers_ShipperController_getShippersApi48_invoker.call(ShipperController_8.getShippersApi())
      }
  
    // @LINE:67
    case controllers_ShipperController_addShipperApi49_route(params@_) =>
      call { 
        controllers_ShipperController_addShipperApi49_invoker.call(ShipperController_8.addShipperApi())
      }
  
    // @LINE:68
    case controllers_ShipperController_updateShipperHandle50_route(params@_) =>
      call { 
        controllers_ShipperController_updateShipperHandle50_invoker.call(ShipperController_8.updateShipperHandle())
      }
  
    // @LINE:69
    case controllers_ShipperController_addShipperHandle51_route(params@_) =>
      call { 
        controllers_ShipperController_addShipperHandle51_invoker.call(ShipperController_8.addShipperHandle())
      }
  
    // @LINE:70
    case controllers_ShipperController_updateShipper52_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_ShipperController_updateShipper52_invoker.call(ShipperController_8.updateShipper(id))
      }
  
    // @LINE:71
    case controllers_ShipperController_addShipper53_route(params@_) =>
      call { 
        controllers_ShipperController_addShipper53_invoker.call(ShipperController_8.addShipper())
      }
  
    // @LINE:72
    case controllers_ShipperController_deleteShipper54_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_ShipperController_deleteShipper54_invoker.call(ShipperController_8.deleteShipper(id))
      }
  
    // @LINE:74
    case controllers_PaymentController_getPaymentApi55_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_PaymentController_getPaymentApi55_invoker.call(PaymentController_5.getPaymentApi(id))
      }
  
    // @LINE:75
    case controllers_PaymentController_getPaymentsApi56_route(params@_) =>
      call { 
        controllers_PaymentController_getPaymentsApi56_invoker.call(PaymentController_5.getPaymentsApi)
      }
  
    // @LINE:76
    case controllers_PaymentController_addPaymentApi57_route(params@_) =>
      call { 
        controllers_PaymentController_addPaymentApi57_invoker.call(PaymentController_5.addPaymentApi())
      }
  
    // @LINE:77
    case controllers_PaymentController_deletePayment58_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_PaymentController_deletePayment58_invoker.call(PaymentController_5.deletePayment(id))
      }
  
    // @LINE:79
    case controllers_EmployeeController_getEmployeeApi59_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_EmployeeController_getEmployeeApi59_invoker.call(EmployeeController_2.getEmployeeApi(id))
      }
  
    // @LINE:80
    case controllers_EmployeeController_getEmployeesApi60_route(params@_) =>
      call { 
        controllers_EmployeeController_getEmployeesApi60_invoker.call(EmployeeController_2.getEmployeesApi)
      }
  
    // @LINE:81
    case controllers_EmployeeController_addEmployeeApi61_route(params@_) =>
      call { 
        controllers_EmployeeController_addEmployeeApi61_invoker.call(EmployeeController_2.addEmployeeApi)
      }
  
    // @LINE:82
    case controllers_EmployeeController_updateEmployeeHandle62_route(params@_) =>
      call { 
        controllers_EmployeeController_updateEmployeeHandle62_invoker.call(EmployeeController_2.updateEmployeeHandle())
      }
  
    // @LINE:83
    case controllers_EmployeeController_addEmployeeHandle63_route(params@_) =>
      call { 
        controllers_EmployeeController_addEmployeeHandle63_invoker.call(EmployeeController_2.addEmployeeHandle())
      }
  
    // @LINE:84
    case controllers_EmployeeController_updateEmployee64_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_EmployeeController_updateEmployee64_invoker.call(EmployeeController_2.updateEmployee(id))
      }
  
    // @LINE:85
    case controllers_EmployeeController_addEmployee65_route(params@_) =>
      call { 
        controllers_EmployeeController_addEmployee65_invoker.call(EmployeeController_2.addEmployee())
      }
  
    // @LINE:86
    case controllers_EmployeeController_deleteEmployee66_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_EmployeeController_deleteEmployee66_invoker.call(EmployeeController_2.deleteEmployee(id))
      }
  
    // @LINE:89
    case controllers_ProductCategoryController_addProductCategoryApi67_route(params@_) =>
      call { 
        controllers_ProductCategoryController_addProductCategoryApi67_invoker.call(ProductCategoryController_0.addProductCategoryApi)
      }
  
    // @LINE:90
    case controllers_ProductCategoryController_getProductCategoryApi68_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_ProductCategoryController_getProductCategoryApi68_invoker.call(ProductCategoryController_0.getProductCategoryApi(id))
      }
  
    // @LINE:91
    case controllers_ProductCategoryController_getProductCategoriesApi69_route(params@_) =>
      call { 
        controllers_ProductCategoryController_getProductCategoriesApi69_invoker.call(ProductCategoryController_0.getProductCategoriesApi)
      }
  
    // @LINE:93
    case controllers_ProductCategoryController_getProductCategory70_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_ProductCategoryController_getProductCategory70_invoker.call(ProductCategoryController_0.getProductCategory(id))
      }
  
    // @LINE:94
    case controllers_ProductCategoryController_getProductCategories71_route(params@_) =>
      call { 
        controllers_ProductCategoryController_getProductCategories71_invoker.call(ProductCategoryController_0.getProductCategories())
      }
  
    // @LINE:95
    case controllers_ProductCategoryController_updateProductCategory72_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_ProductCategoryController_updateProductCategory72_invoker.call(ProductCategoryController_0.updateProductCategory(id))
      }
  
    // @LINE:96
    case controllers_ProductCategoryController_addProductCategoryHandle73_route(params@_) =>
      call { 
        controllers_ProductCategoryController_addProductCategoryHandle73_invoker.call(ProductCategoryController_0.addProductCategoryHandle())
      }
  
    // @LINE:97
    case controllers_ProductCategoryController_addProductCategory74_route(params@_) =>
      call { 
        controllers_ProductCategoryController_addProductCategory74_invoker.call(ProductCategoryController_0.addProductCategory())
      }
  
    // @LINE:98
    case controllers_ProductCategoryController_updateProductCategoryHandle75_route(params@_) =>
      call { 
        controllers_ProductCategoryController_updateProductCategoryHandle75_invoker.call(ProductCategoryController_0.updateProductCategoryHandle())
      }
  
    // @LINE:99
    case controllers_ProductCategoryController_deleteProductCategory76_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_ProductCategoryController_deleteProductCategory76_invoker.call(ProductCategoryController_0.deleteProductCategory(id))
      }
  
    // @LINE:101
    case controllers_CountController_count77_route(params@_) =>
      call { 
        controllers_CountController_count77_invoker.call(CountController_4.count)
      }
  
    // @LINE:103
    case controllers_AsyncController_message78_route(params@_) =>
      call { 
        controllers_AsyncController_message78_invoker.call(AsyncController_11.message)
      }
  
    // @LINE:106
    case controllers_Assets_versioned79_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned79_invoker.call(Assets_10.versioned(path, file))
      }
  }
}
