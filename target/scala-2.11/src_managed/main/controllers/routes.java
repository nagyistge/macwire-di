// @SOURCE:/Users/sgarg/development/code/sameer/learning-scala/scala-dependency-injection/macwire-di/conf/routes
// @HASH:09028b7c1a5ca3343e300f74ced5050e3931426f
// @DATE:Wed Aug 13 10:26:31 BST 2014

package controllers;

public class routes {
public static final controllers.ReverseGreeterController GreeterController = new controllers.ReverseGreeterController();
public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets();

public static class javascript {
public static final controllers.javascript.ReverseGreeterController GreeterController = new controllers.javascript.ReverseGreeterController();
public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets();
}
          

public static class ref {
public static final controllers.ref.ReverseGreeterController GreeterController = new controllers.ref.ReverseGreeterController();
public static final controllers.ref.ReverseAssets Assets = new controllers.ref.ReverseAssets();
}
          
}
          