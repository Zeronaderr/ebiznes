// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/zeron/IdeaProjects/sklep/conf/routes
// @DATE:Thu Apr 23 19:12:48 CEST 2020


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