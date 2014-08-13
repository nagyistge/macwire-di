// @SOURCE:/Users/sgarg/development/code/sameer/learning-scala/scala-dependency-injection/macwire-di/conf/routes
// @HASH:09028b7c1a5ca3343e300f74ced5050e3931426f
// @DATE:Wed Aug 13 10:26:31 BST 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset

import Router.queryString


// @LINE:13
// @LINE:7
package controllers {

// @LINE:7
class ReverseGreeterController {


// @LINE:7
def greet(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "greetings")
}
                        

}
                          

// @LINE:13
class ReverseAssets {


// @LINE:13
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          
}
                  


// @LINE:13
// @LINE:7
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:7
class ReverseGreeterController {


// @LINE:7
def greet : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.GreeterController.greet",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "greetings"})
      }
   """
)
                        

}
              

// @LINE:13
class ReverseAssets {


// @LINE:13
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              
}
        


// @LINE:13
// @LINE:7
package controllers.ref {


// @LINE:7
class ReverseGreeterController {


// @LINE:7
def greet(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.GreeterController]).greet(), HandlerDef(this.getClass.getClassLoader, "", "controllers.GreeterController", "greet", Seq(), "GET", """""", _prefix + """greetings""")
)
                      

}
                          

// @LINE:13
class ReverseAssets {


// @LINE:13
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          
}
        
    