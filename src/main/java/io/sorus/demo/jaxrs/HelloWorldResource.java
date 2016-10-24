package io.sorus.demo.jaxrs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("hello")
public class HelloWorldResource {

    @GET
    public String greet() {
        return "Hello, world";
    }
}
