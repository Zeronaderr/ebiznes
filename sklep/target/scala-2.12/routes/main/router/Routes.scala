// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/zeron/IdeaProjects/sklep/conf/routes
// @DATE:Thu Apr 23 19:12:48 CEST 2020

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:7
  HomeController_12: controllers.HomeController,
  // @LINE:9
  ProductController_9: controllers.ProductController,
  // @LINE:15
  AddressController_3: controllers.AddressController,
  // @LINE:21
  BrandController_6: controllers.BrandController,
  // @LINE:27
  CustomerController_7: controllers.CustomerController,
  // @LINE:33
  DiscountController_13: controllers.DiscountController,
  // @LINE:39
  OrderController_1: controllers.OrderController,
  // @LINE:45
  ShipperController_8: controllers.ShipperController,
  // @LINE:51
  PaymentController_5: controllers.PaymentController,
  // @LINE:57
  EmployeeController_2: controllers.EmployeeController,
  // @LINE:63
  ProductCategoryController_0: controllers.ProductCategoryController,
  // @LINE:69
  CountController_4: controllers.CountController,
  // @LINE:71
  AsyncController_11: controllers.AsyncController,
  // @LINE:74
  Assets_10: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
    HomeController_12: controllers.HomeController,
    // @LINE:9
    ProductController_9: controllers.ProductController,
    // @LINE:15
    AddressController_3: controllers.AddressController,
    // @LINE:21
    BrandController_6: controllers.BrandController,
    // @LINE:27
    CustomerController_7: controllers.CustomerController,
    // @LINE:33
    DiscountController_13: controllers.DiscountController,
    // @LINE:39
    OrderController_1: controllers.OrderController,
    // @LINE:45
    ShipperController_8: controllers.ShipperController,
    // @LINE:51
    PaymentController_5: controllers.PaymentController,
    // @LINE:57
    EmployeeController_2: controllers.EmployeeController,
    // @LINE:63
    ProductCategoryController_0: controllers.ProductCategoryController,
    // @LINE:69
    CountController_4: controllers.CountController,
    // @LINE:71
    AsyncController_11: controllers.AsyncController,
    // @LINE:74
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """product/""" + "$" + """id<[^/]+>""", """controllers.ProductController.getProduct(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """products""", """controllers.ProductController.getProducts()"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateproduct/""" + "$" + """id<[^/]+>""", """controllers.ProductController.updateProduct(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addproduct""", """controllers.ProductController.addProduct()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteproduct/""" + "$" + """id<[^/]+>""", """controllers.ProductController.deleteProduct(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """address/""" + "$" + """id<[^/]+>""", """controllers.AddressController.getAddress(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addresses""", """controllers.AddressController.getAddresses()"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateaddres/""" + "$" + """id<[^/]+>""", """controllers.AddressController.updateAddress(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addaddress""", """controllers.AddressController.addAddress()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteaddress/""" + "$" + """id<[^/]+>""", """controllers.AddressController.deleteAddress(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """brand/""" + "$" + """id<[^/]+>""", """controllers.BrandController.getBrand(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """brands""", """controllers.BrandController.getBrands()"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateaddress/""" + "$" + """id<[^/]+>""", """controllers.BrandController.updateBrand(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addbrand""", """controllers.BrandController.addBrand()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deletebrand/""" + "$" + """id<[^/]+>""", """controllers.BrandController.deleteBrand(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """customer/""" + "$" + """id<[^/]+>""", """controllers.CustomerController.getCustomer(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """customers""", """controllers.CustomerController.getCustomers()"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updatecustomer/""" + "$" + """id<[^/]+>""", """controllers.CustomerController.updateCustomer(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addcustomer""", """controllers.CustomerController.addCustomer()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deletecustomer/""" + "$" + """id<[^/]+>""", """controllers.CustomerController.deleteCustomer(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """discount/""" + "$" + """id<[^/]+>""", """controllers.DiscountController.getDiscount(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """discounts""", """controllers.DiscountController.getDiscounts()"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updatediscount/""" + "$" + """id<[^/]+>""", """controllers.DiscountController.updateDiscount(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """adddiscount""", """controllers.DiscountController.addDiscount()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deletediscount/""" + "$" + """id<[^/]+>""", """controllers.DiscountController.deleteDiscount(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """order/""" + "$" + """id<[^/]+>""", """controllers.OrderController.getOrder(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """orders""", """controllers.OrderController.getOrders()"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateorder/""" + "$" + """id<[^/]+>""", """controllers.OrderController.updateOrder(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addorder""", """controllers.OrderController.addOrder()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteorder/""" + "$" + """id<[^/]+>""", """controllers.OrderController.deleteOrder(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """shipper/""" + "$" + """id<[^/]+>""", """controllers.ShipperController.getShipper(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """shippers""", """controllers.ShipperController.getShippers()"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateshipper/""" + "$" + """id<[^/]+>""", """controllers.ShipperController.updateShipper(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addshipper""", """controllers.ShipperController.addShipper()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteshipper/""" + "$" + """id<[^/]+>""", """controllers.ShipperController.deleteShipper(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """payment/""" + "$" + """id<[^/]+>""", """controllers.PaymentController.getPayment(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """payments""", """controllers.PaymentController.getPayments()"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updatepayment/""" + "$" + """id<[^/]+>""", """controllers.PaymentController.updatePayment(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addpayment""", """controllers.PaymentController.addPayment()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deletepayment/""" + "$" + """id<[^/]+>""", """controllers.PaymentController.deletePayment(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """employee/""" + "$" + """id<[^/]+>""", """controllers.EmployeeController.getEmployee(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """employees""", """controllers.EmployeeController.getEmployees()"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateemployee/""" + "$" + """id<[^/]+>""", """controllers.EmployeeController.updateEmployee(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addemployee""", """controllers.EmployeeController.addEmployee()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteemployee/""" + "$" + """id<[^/]+>""", """controllers.EmployeeController.deleteEmployee(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """productcategory/""" + "$" + """id<[^/]+>""", """controllers.ProductCategoryController.getProductCategory(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """productscategories""", """controllers.ProductCategoryController.getProductCategories()"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateproductcategory/""" + "$" + """id<[^/]+>""", """controllers.ProductCategoryController.updateProductCategory(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addproductcategory""", """controllers.ProductCategoryController.addProductCategory()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteproductcategory/""" + "$" + """id<[^/]+>""", """controllers.ProductCategoryController.deleteProductCategory(id:Long)"""),
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

  // @LINE:9
  private[this] lazy val controllers_ProductController_getProduct1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("product/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProductController_getProduct1_invoker = createInvoker(
    ProductController_9.getProduct(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductController",
      "getProduct",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """product/""" + "$" + """id<[^/]+>""",
      """ PRODUCTS""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_ProductController_getProducts2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("products")))
  )
  private[this] lazy val controllers_ProductController_getProducts2_invoker = createInvoker(
    ProductController_9.getProducts(),
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

  // @LINE:11
  private[this] lazy val controllers_ProductController_updateProduct3_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateproduct/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProductController_updateProduct3_invoker = createInvoker(
    ProductController_9.updateProduct(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductController",
      "updateProduct",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """updateproduct/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_ProductController_addProduct4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addproduct")))
  )
  private[this] lazy val controllers_ProductController_addProduct4_invoker = createInvoker(
    ProductController_9.addProduct(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductController",
      "addProduct",
      Nil,
      "POST",
      this.prefix + """addproduct""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_ProductController_deleteProduct5_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteproduct/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProductController_deleteProduct5_invoker = createInvoker(
    ProductController_9.deleteProduct(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductController",
      "deleteProduct",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """deleteproduct/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_AddressController_getAddress6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("address/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AddressController_getAddress6_invoker = createInvoker(
    AddressController_3.getAddress(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AddressController",
      "getAddress",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """address/""" + "$" + """id<[^/]+>""",
      """ addresses""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_AddressController_getAddresses7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addresses")))
  )
  private[this] lazy val controllers_AddressController_getAddresses7_invoker = createInvoker(
    AddressController_3.getAddresses(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AddressController",
      "getAddresses",
      Nil,
      "GET",
      this.prefix + """addresses""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_AddressController_updateAddress8_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateaddres/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AddressController_updateAddress8_invoker = createInvoker(
    AddressController_3.updateAddress(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AddressController",
      "updateAddress",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """updateaddres/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_AddressController_addAddress9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addaddress")))
  )
  private[this] lazy val controllers_AddressController_addAddress9_invoker = createInvoker(
    AddressController_3.addAddress(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AddressController",
      "addAddress",
      Nil,
      "POST",
      this.prefix + """addaddress""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_AddressController_deleteAddress10_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteaddress/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AddressController_deleteAddress10_invoker = createInvoker(
    AddressController_3.deleteAddress(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AddressController",
      "deleteAddress",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """deleteaddress/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_BrandController_getBrand11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("brand/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BrandController_getBrand11_invoker = createInvoker(
    BrandController_6.getBrand(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BrandController",
      "getBrand",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """brand/""" + "$" + """id<[^/]+>""",
      """ brands""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_BrandController_getBrands12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("brands")))
  )
  private[this] lazy val controllers_BrandController_getBrands12_invoker = createInvoker(
    BrandController_6.getBrands(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BrandController",
      "getBrands",
      Nil,
      "GET",
      this.prefix + """brands""",
      """""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val controllers_BrandController_updateBrand13_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateaddress/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BrandController_updateBrand13_invoker = createInvoker(
    BrandController_6.updateBrand(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BrandController",
      "updateBrand",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """updateaddress/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_BrandController_addBrand14_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addbrand")))
  )
  private[this] lazy val controllers_BrandController_addBrand14_invoker = createInvoker(
    BrandController_6.addBrand(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BrandController",
      "addBrand",
      Nil,
      "POST",
      this.prefix + """addbrand""",
      """""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_BrandController_deleteBrand15_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deletebrand/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BrandController_deleteBrand15_invoker = createInvoker(
    BrandController_6.deleteBrand(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BrandController",
      "deleteBrand",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """deletebrand/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:27
  private[this] lazy val controllers_CustomerController_getCustomer16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("customer/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CustomerController_getCustomer16_invoker = createInvoker(
    CustomerController_7.getCustomer(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CustomerController",
      "getCustomer",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """customer/""" + "$" + """id<[^/]+>""",
      """ customers""",
      Seq()
    )
  )

  // @LINE:28
  private[this] lazy val controllers_CustomerController_getCustomers17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("customers")))
  )
  private[this] lazy val controllers_CustomerController_getCustomers17_invoker = createInvoker(
    CustomerController_7.getCustomers(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CustomerController",
      "getCustomers",
      Nil,
      "GET",
      this.prefix + """customers""",
      """""",
      Seq()
    )
  )

  // @LINE:29
  private[this] lazy val controllers_CustomerController_updateCustomer18_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updatecustomer/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CustomerController_updateCustomer18_invoker = createInvoker(
    CustomerController_7.updateCustomer(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CustomerController",
      "updateCustomer",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """updatecustomer/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:30
  private[this] lazy val controllers_CustomerController_addCustomer19_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addcustomer")))
  )
  private[this] lazy val controllers_CustomerController_addCustomer19_invoker = createInvoker(
    CustomerController_7.addCustomer(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CustomerController",
      "addCustomer",
      Nil,
      "POST",
      this.prefix + """addcustomer""",
      """""",
      Seq()
    )
  )

  // @LINE:31
  private[this] lazy val controllers_CustomerController_deleteCustomer20_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deletecustomer/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CustomerController_deleteCustomer20_invoker = createInvoker(
    CustomerController_7.deleteCustomer(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CustomerController",
      "deleteCustomer",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """deletecustomer/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:33
  private[this] lazy val controllers_DiscountController_getDiscount21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("discount/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_DiscountController_getDiscount21_invoker = createInvoker(
    DiscountController_13.getDiscount(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DiscountController",
      "getDiscount",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """discount/""" + "$" + """id<[^/]+>""",
      """ discounts""",
      Seq()
    )
  )

  // @LINE:34
  private[this] lazy val controllers_DiscountController_getDiscounts22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("discounts")))
  )
  private[this] lazy val controllers_DiscountController_getDiscounts22_invoker = createInvoker(
    DiscountController_13.getDiscounts(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DiscountController",
      "getDiscounts",
      Nil,
      "GET",
      this.prefix + """discounts""",
      """""",
      Seq()
    )
  )

  // @LINE:35
  private[this] lazy val controllers_DiscountController_updateDiscount23_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updatediscount/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_DiscountController_updateDiscount23_invoker = createInvoker(
    DiscountController_13.updateDiscount(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DiscountController",
      "updateDiscount",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """updatediscount/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:36
  private[this] lazy val controllers_DiscountController_addDiscount24_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("adddiscount")))
  )
  private[this] lazy val controllers_DiscountController_addDiscount24_invoker = createInvoker(
    DiscountController_13.addDiscount(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DiscountController",
      "addDiscount",
      Nil,
      "POST",
      this.prefix + """adddiscount""",
      """""",
      Seq()
    )
  )

  // @LINE:37
  private[this] lazy val controllers_DiscountController_deleteDiscount25_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deletediscount/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_DiscountController_deleteDiscount25_invoker = createInvoker(
    DiscountController_13.deleteDiscount(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DiscountController",
      "deleteDiscount",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """deletediscount/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:39
  private[this] lazy val controllers_OrderController_getOrder26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("order/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_OrderController_getOrder26_invoker = createInvoker(
    OrderController_1.getOrder(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrderController",
      "getOrder",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """order/""" + "$" + """id<[^/]+>""",
      """ orders""",
      Seq()
    )
  )

  // @LINE:40
  private[this] lazy val controllers_OrderController_getOrders27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("orders")))
  )
  private[this] lazy val controllers_OrderController_getOrders27_invoker = createInvoker(
    OrderController_1.getOrders(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrderController",
      "getOrders",
      Nil,
      "GET",
      this.prefix + """orders""",
      """""",
      Seq()
    )
  )

  // @LINE:41
  private[this] lazy val controllers_OrderController_updateOrder28_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateorder/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_OrderController_updateOrder28_invoker = createInvoker(
    OrderController_1.updateOrder(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrderController",
      "updateOrder",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """updateorder/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:42
  private[this] lazy val controllers_OrderController_addOrder29_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addorder")))
  )
  private[this] lazy val controllers_OrderController_addOrder29_invoker = createInvoker(
    OrderController_1.addOrder(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrderController",
      "addOrder",
      Nil,
      "POST",
      this.prefix + """addorder""",
      """""",
      Seq()
    )
  )

  // @LINE:43
  private[this] lazy val controllers_OrderController_deleteOrder30_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteorder/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_OrderController_deleteOrder30_invoker = createInvoker(
    OrderController_1.deleteOrder(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrderController",
      "deleteOrder",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """deleteorder/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:45
  private[this] lazy val controllers_ShipperController_getShipper31_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("shipper/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShipperController_getShipper31_invoker = createInvoker(
    ShipperController_8.getShipper(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShipperController",
      "getShipper",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """shipper/""" + "$" + """id<[^/]+>""",
      """ shippers""",
      Seq()
    )
  )

  // @LINE:46
  private[this] lazy val controllers_ShipperController_getShippers32_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("shippers")))
  )
  private[this] lazy val controllers_ShipperController_getShippers32_invoker = createInvoker(
    ShipperController_8.getShippers(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShipperController",
      "getShippers",
      Nil,
      "GET",
      this.prefix + """shippers""",
      """""",
      Seq()
    )
  )

  // @LINE:47
  private[this] lazy val controllers_ShipperController_updateShipper33_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateshipper/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShipperController_updateShipper33_invoker = createInvoker(
    ShipperController_8.updateShipper(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShipperController",
      "updateShipper",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """updateshipper/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:48
  private[this] lazy val controllers_ShipperController_addShipper34_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addshipper")))
  )
  private[this] lazy val controllers_ShipperController_addShipper34_invoker = createInvoker(
    ShipperController_8.addShipper(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShipperController",
      "addShipper",
      Nil,
      "POST",
      this.prefix + """addshipper""",
      """""",
      Seq()
    )
  )

  // @LINE:49
  private[this] lazy val controllers_ShipperController_deleteShipper35_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteshipper/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShipperController_deleteShipper35_invoker = createInvoker(
    ShipperController_8.deleteShipper(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShipperController",
      "deleteShipper",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """deleteshipper/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:51
  private[this] lazy val controllers_PaymentController_getPayment36_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("payment/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PaymentController_getPayment36_invoker = createInvoker(
    PaymentController_5.getPayment(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PaymentController",
      "getPayment",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """payment/""" + "$" + """id<[^/]+>""",
      """ payments""",
      Seq()
    )
  )

  // @LINE:52
  private[this] lazy val controllers_PaymentController_getPayments37_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("payments")))
  )
  private[this] lazy val controllers_PaymentController_getPayments37_invoker = createInvoker(
    PaymentController_5.getPayments(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PaymentController",
      "getPayments",
      Nil,
      "GET",
      this.prefix + """payments""",
      """""",
      Seq()
    )
  )

  // @LINE:53
  private[this] lazy val controllers_PaymentController_updatePayment38_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updatepayment/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PaymentController_updatePayment38_invoker = createInvoker(
    PaymentController_5.updatePayment(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PaymentController",
      "updatePayment",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """updatepayment/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:54
  private[this] lazy val controllers_PaymentController_addPayment39_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addpayment")))
  )
  private[this] lazy val controllers_PaymentController_addPayment39_invoker = createInvoker(
    PaymentController_5.addPayment(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PaymentController",
      "addPayment",
      Nil,
      "POST",
      this.prefix + """addpayment""",
      """""",
      Seq()
    )
  )

  // @LINE:55
  private[this] lazy val controllers_PaymentController_deletePayment40_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deletepayment/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PaymentController_deletePayment40_invoker = createInvoker(
    PaymentController_5.deletePayment(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PaymentController",
      "deletePayment",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """deletepayment/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:57
  private[this] lazy val controllers_EmployeeController_getEmployee41_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("employee/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_EmployeeController_getEmployee41_invoker = createInvoker(
    EmployeeController_2.getEmployee(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EmployeeController",
      "getEmployee",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """employee/""" + "$" + """id<[^/]+>""",
      """ employees""",
      Seq()
    )
  )

  // @LINE:58
  private[this] lazy val controllers_EmployeeController_getEmployees42_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("employees")))
  )
  private[this] lazy val controllers_EmployeeController_getEmployees42_invoker = createInvoker(
    EmployeeController_2.getEmployees(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EmployeeController",
      "getEmployees",
      Nil,
      "GET",
      this.prefix + """employees""",
      """""",
      Seq()
    )
  )

  // @LINE:59
  private[this] lazy val controllers_EmployeeController_updateEmployee43_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateemployee/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_EmployeeController_updateEmployee43_invoker = createInvoker(
    EmployeeController_2.updateEmployee(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EmployeeController",
      "updateEmployee",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """updateemployee/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:60
  private[this] lazy val controllers_EmployeeController_addEmployee44_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addemployee")))
  )
  private[this] lazy val controllers_EmployeeController_addEmployee44_invoker = createInvoker(
    EmployeeController_2.addEmployee(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EmployeeController",
      "addEmployee",
      Nil,
      "POST",
      this.prefix + """addemployee""",
      """""",
      Seq()
    )
  )

  // @LINE:61
  private[this] lazy val controllers_EmployeeController_deleteEmployee45_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteemployee/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_EmployeeController_deleteEmployee45_invoker = createInvoker(
    EmployeeController_2.deleteEmployee(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EmployeeController",
      "deleteEmployee",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """deleteemployee/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:63
  private[this] lazy val controllers_ProductCategoryController_getProductCategory46_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("productcategory/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProductCategoryController_getProductCategory46_invoker = createInvoker(
    ProductCategoryController_0.getProductCategory(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductCategoryController",
      "getProductCategory",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """productcategory/""" + "$" + """id<[^/]+>""",
      """ PRODUCT CATEGORIES""",
      Seq()
    )
  )

  // @LINE:64
  private[this] lazy val controllers_ProductCategoryController_getProductCategories47_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("productscategories")))
  )
  private[this] lazy val controllers_ProductCategoryController_getProductCategories47_invoker = createInvoker(
    ProductCategoryController_0.getProductCategories(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductCategoryController",
      "getProductCategories",
      Nil,
      "GET",
      this.prefix + """productscategories""",
      """""",
      Seq()
    )
  )

  // @LINE:65
  private[this] lazy val controllers_ProductCategoryController_updateProductCategory48_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateproductcategory/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProductCategoryController_updateProductCategory48_invoker = createInvoker(
    ProductCategoryController_0.updateProductCategory(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductCategoryController",
      "updateProductCategory",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """updateproductcategory/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:66
  private[this] lazy val controllers_ProductCategoryController_addProductCategory49_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addproductcategory")))
  )
  private[this] lazy val controllers_ProductCategoryController_addProductCategory49_invoker = createInvoker(
    ProductCategoryController_0.addProductCategory(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductCategoryController",
      "addProductCategory",
      Nil,
      "POST",
      this.prefix + """addproductcategory""",
      """""",
      Seq()
    )
  )

  // @LINE:67
  private[this] lazy val controllers_ProductCategoryController_deleteProductCategory50_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteproductcategory/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProductCategoryController_deleteProductCategory50_invoker = createInvoker(
    ProductCategoryController_0.deleteProductCategory(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductCategoryController",
      "deleteProductCategory",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """deleteproductcategory/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:69
  private[this] lazy val controllers_CountController_count51_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count51_invoker = createInvoker(
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

  // @LINE:71
  private[this] lazy val controllers_AsyncController_message52_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message52_invoker = createInvoker(
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

  // @LINE:74
  private[this] lazy val controllers_Assets_versioned53_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned53_invoker = createInvoker(
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
  
    // @LINE:9
    case controllers_ProductController_getProduct1_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ProductController_getProduct1_invoker.call(ProductController_9.getProduct(id))
      }
  
    // @LINE:10
    case controllers_ProductController_getProducts2_route(params@_) =>
      call { 
        controllers_ProductController_getProducts2_invoker.call(ProductController_9.getProducts())
      }
  
    // @LINE:11
    case controllers_ProductController_updateProduct3_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ProductController_updateProduct3_invoker.call(ProductController_9.updateProduct(id))
      }
  
    // @LINE:12
    case controllers_ProductController_addProduct4_route(params@_) =>
      call { 
        controllers_ProductController_addProduct4_invoker.call(ProductController_9.addProduct())
      }
  
    // @LINE:13
    case controllers_ProductController_deleteProduct5_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ProductController_deleteProduct5_invoker.call(ProductController_9.deleteProduct(id))
      }
  
    // @LINE:15
    case controllers_AddressController_getAddress6_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_AddressController_getAddress6_invoker.call(AddressController_3.getAddress(id))
      }
  
    // @LINE:16
    case controllers_AddressController_getAddresses7_route(params@_) =>
      call { 
        controllers_AddressController_getAddresses7_invoker.call(AddressController_3.getAddresses())
      }
  
    // @LINE:17
    case controllers_AddressController_updateAddress8_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_AddressController_updateAddress8_invoker.call(AddressController_3.updateAddress(id))
      }
  
    // @LINE:18
    case controllers_AddressController_addAddress9_route(params@_) =>
      call { 
        controllers_AddressController_addAddress9_invoker.call(AddressController_3.addAddress())
      }
  
    // @LINE:19
    case controllers_AddressController_deleteAddress10_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_AddressController_deleteAddress10_invoker.call(AddressController_3.deleteAddress(id))
      }
  
    // @LINE:21
    case controllers_BrandController_getBrand11_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_BrandController_getBrand11_invoker.call(BrandController_6.getBrand(id))
      }
  
    // @LINE:22
    case controllers_BrandController_getBrands12_route(params@_) =>
      call { 
        controllers_BrandController_getBrands12_invoker.call(BrandController_6.getBrands())
      }
  
    // @LINE:23
    case controllers_BrandController_updateBrand13_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_BrandController_updateBrand13_invoker.call(BrandController_6.updateBrand(id))
      }
  
    // @LINE:24
    case controllers_BrandController_addBrand14_route(params@_) =>
      call { 
        controllers_BrandController_addBrand14_invoker.call(BrandController_6.addBrand())
      }
  
    // @LINE:25
    case controllers_BrandController_deleteBrand15_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_BrandController_deleteBrand15_invoker.call(BrandController_6.deleteBrand(id))
      }
  
    // @LINE:27
    case controllers_CustomerController_getCustomer16_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CustomerController_getCustomer16_invoker.call(CustomerController_7.getCustomer(id))
      }
  
    // @LINE:28
    case controllers_CustomerController_getCustomers17_route(params@_) =>
      call { 
        controllers_CustomerController_getCustomers17_invoker.call(CustomerController_7.getCustomers())
      }
  
    // @LINE:29
    case controllers_CustomerController_updateCustomer18_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CustomerController_updateCustomer18_invoker.call(CustomerController_7.updateCustomer(id))
      }
  
    // @LINE:30
    case controllers_CustomerController_addCustomer19_route(params@_) =>
      call { 
        controllers_CustomerController_addCustomer19_invoker.call(CustomerController_7.addCustomer())
      }
  
    // @LINE:31
    case controllers_CustomerController_deleteCustomer20_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CustomerController_deleteCustomer20_invoker.call(CustomerController_7.deleteCustomer(id))
      }
  
    // @LINE:33
    case controllers_DiscountController_getDiscount21_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_DiscountController_getDiscount21_invoker.call(DiscountController_13.getDiscount(id))
      }
  
    // @LINE:34
    case controllers_DiscountController_getDiscounts22_route(params@_) =>
      call { 
        controllers_DiscountController_getDiscounts22_invoker.call(DiscountController_13.getDiscounts())
      }
  
    // @LINE:35
    case controllers_DiscountController_updateDiscount23_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_DiscountController_updateDiscount23_invoker.call(DiscountController_13.updateDiscount(id))
      }
  
    // @LINE:36
    case controllers_DiscountController_addDiscount24_route(params@_) =>
      call { 
        controllers_DiscountController_addDiscount24_invoker.call(DiscountController_13.addDiscount())
      }
  
    // @LINE:37
    case controllers_DiscountController_deleteDiscount25_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_DiscountController_deleteDiscount25_invoker.call(DiscountController_13.deleteDiscount(id))
      }
  
    // @LINE:39
    case controllers_OrderController_getOrder26_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_OrderController_getOrder26_invoker.call(OrderController_1.getOrder(id))
      }
  
    // @LINE:40
    case controllers_OrderController_getOrders27_route(params@_) =>
      call { 
        controllers_OrderController_getOrders27_invoker.call(OrderController_1.getOrders())
      }
  
    // @LINE:41
    case controllers_OrderController_updateOrder28_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_OrderController_updateOrder28_invoker.call(OrderController_1.updateOrder(id))
      }
  
    // @LINE:42
    case controllers_OrderController_addOrder29_route(params@_) =>
      call { 
        controllers_OrderController_addOrder29_invoker.call(OrderController_1.addOrder())
      }
  
    // @LINE:43
    case controllers_OrderController_deleteOrder30_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_OrderController_deleteOrder30_invoker.call(OrderController_1.deleteOrder(id))
      }
  
    // @LINE:45
    case controllers_ShipperController_getShipper31_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ShipperController_getShipper31_invoker.call(ShipperController_8.getShipper(id))
      }
  
    // @LINE:46
    case controllers_ShipperController_getShippers32_route(params@_) =>
      call { 
        controllers_ShipperController_getShippers32_invoker.call(ShipperController_8.getShippers())
      }
  
    // @LINE:47
    case controllers_ShipperController_updateShipper33_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ShipperController_updateShipper33_invoker.call(ShipperController_8.updateShipper(id))
      }
  
    // @LINE:48
    case controllers_ShipperController_addShipper34_route(params@_) =>
      call { 
        controllers_ShipperController_addShipper34_invoker.call(ShipperController_8.addShipper())
      }
  
    // @LINE:49
    case controllers_ShipperController_deleteShipper35_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ShipperController_deleteShipper35_invoker.call(ShipperController_8.deleteShipper(id))
      }
  
    // @LINE:51
    case controllers_PaymentController_getPayment36_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PaymentController_getPayment36_invoker.call(PaymentController_5.getPayment(id))
      }
  
    // @LINE:52
    case controllers_PaymentController_getPayments37_route(params@_) =>
      call { 
        controllers_PaymentController_getPayments37_invoker.call(PaymentController_5.getPayments())
      }
  
    // @LINE:53
    case controllers_PaymentController_updatePayment38_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PaymentController_updatePayment38_invoker.call(PaymentController_5.updatePayment(id))
      }
  
    // @LINE:54
    case controllers_PaymentController_addPayment39_route(params@_) =>
      call { 
        controllers_PaymentController_addPayment39_invoker.call(PaymentController_5.addPayment())
      }
  
    // @LINE:55
    case controllers_PaymentController_deletePayment40_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PaymentController_deletePayment40_invoker.call(PaymentController_5.deletePayment(id))
      }
  
    // @LINE:57
    case controllers_EmployeeController_getEmployee41_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_EmployeeController_getEmployee41_invoker.call(EmployeeController_2.getEmployee(id))
      }
  
    // @LINE:58
    case controllers_EmployeeController_getEmployees42_route(params@_) =>
      call { 
        controllers_EmployeeController_getEmployees42_invoker.call(EmployeeController_2.getEmployees())
      }
  
    // @LINE:59
    case controllers_EmployeeController_updateEmployee43_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_EmployeeController_updateEmployee43_invoker.call(EmployeeController_2.updateEmployee(id))
      }
  
    // @LINE:60
    case controllers_EmployeeController_addEmployee44_route(params@_) =>
      call { 
        controllers_EmployeeController_addEmployee44_invoker.call(EmployeeController_2.addEmployee())
      }
  
    // @LINE:61
    case controllers_EmployeeController_deleteEmployee45_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_EmployeeController_deleteEmployee45_invoker.call(EmployeeController_2.deleteEmployee(id))
      }
  
    // @LINE:63
    case controllers_ProductCategoryController_getProductCategory46_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ProductCategoryController_getProductCategory46_invoker.call(ProductCategoryController_0.getProductCategory(id))
      }
  
    // @LINE:64
    case controllers_ProductCategoryController_getProductCategories47_route(params@_) =>
      call { 
        controllers_ProductCategoryController_getProductCategories47_invoker.call(ProductCategoryController_0.getProductCategories())
      }
  
    // @LINE:65
    case controllers_ProductCategoryController_updateProductCategory48_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ProductCategoryController_updateProductCategory48_invoker.call(ProductCategoryController_0.updateProductCategory(id))
      }
  
    // @LINE:66
    case controllers_ProductCategoryController_addProductCategory49_route(params@_) =>
      call { 
        controllers_ProductCategoryController_addProductCategory49_invoker.call(ProductCategoryController_0.addProductCategory())
      }
  
    // @LINE:67
    case controllers_ProductCategoryController_deleteProductCategory50_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ProductCategoryController_deleteProductCategory50_invoker.call(ProductCategoryController_0.deleteProductCategory(id))
      }
  
    // @LINE:69
    case controllers_CountController_count51_route(params@_) =>
      call { 
        controllers_CountController_count51_invoker.call(CountController_4.count)
      }
  
    // @LINE:71
    case controllers_AsyncController_message52_route(params@_) =>
      call { 
        controllers_AsyncController_message52_invoker.call(AsyncController_11.message)
      }
  
    // @LINE:74
    case controllers_Assets_versioned53_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned53_invoker.call(Assets_10.versioned(path, file))
      }
  }
}
