package com.anil.rest;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/formParam")
public class UserServiceFormParam {
	
	@POST
	@Path("/add")
	public Response addUser(@FormParam("name") String name,
							@FormParam("age") String age){
		return Response.status(200).entity("addUser is called, name : " + name + ", age : " + age).build();
	}
}