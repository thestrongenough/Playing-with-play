package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public Result index() {
        return ok("Hello world");
    }

    public Result hello(String name) {
        return ok(views.html.hello.render(name));
    }




    

}
