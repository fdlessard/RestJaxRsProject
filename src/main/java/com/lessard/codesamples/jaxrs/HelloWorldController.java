package com.lessard.codesamples.jaxrs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Created by I832983 on 7/19/2016.
 */

@Path("/hello")
public class HelloWorldController {


//        @GET
//        @Path("/{param}")
//        public Response getMsg(@PathParam("param") String msg) {
//
//            String output = "Hello World" + msg;
//
//            return Response.status(200).entity(output).build();
//
//        }


        @GET
        public Response getHello() {

            String output = "Hello World";

            return Response.status(200).entity(output).build();

        }

    }

