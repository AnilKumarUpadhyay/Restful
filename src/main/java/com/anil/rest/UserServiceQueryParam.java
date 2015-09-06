package com.anil.rest;

import java.util.List;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("/usersQuery")
public class UserServiceQueryParam {
	
	// url : RESTfulExample/usersQuery/query?from=100&to=200&orderBy=name
	@GET
	@Path("/query")
	public Response getUsers(@QueryParam("from") int from,
							 @QueryParam("to") int to,
							 @QueryParam("orderBy") List<String> orderBy){
		return Response.status(200).entity("<h1>getUsers is called, from :</h1> " + from + ", to : " + to
				+ ", orderBy" + orderBy.toString()).build();
	}
	
	
	@GET
	@Path("/defaultQuery")
	public Response getUsersWithDefaultValues(@DefaultValue("100") @QueryParam("from") int from,
							 @DefaultValue("200") @QueryParam("to") int to,
							 @DefaultValue("name") @QueryParam("orderBy") List<String> orderBy){
		
		return Response.status(200).entity("<h1>getUsers is called, from :</h1> " + from + ", to : " + to
				+ ", orderBy" + orderBy.toString()).build();
		
	}
}
