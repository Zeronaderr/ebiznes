// @GENERATOR:play-routes-compiler
// @SOURCE:D:/ebiznes/sklep/conf/routes
// @DATE:Sun Apr 26 18:37:46 CEST 2020


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
