package com.softwarelma.ers.main;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/hello")
public class ErsMainRS {

    @GET
    @Path("/{param}")
    public Response getMsg(@PathParam("param") String msg) {
        String ret = "Jersey say : " + msg;
        System.out.println(ret);
        String output = ret;
        return Response.status(200).entity(output).build();
    }

}
