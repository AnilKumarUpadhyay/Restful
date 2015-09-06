package com.anil.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/users")
public class UserRestService {

	@GET
	@Path("{name}")
	public Response getUser(@PathParam("name") String name){
		return Response.status(200).entity("getUser is Called : "+name).build();
	}
	
	@GET
	@Path("/vip")
	public Response getVIPUser(){
		return Response.status(200).entity("getVIPUser is Called").build();
	}
	
	//url :  /users/999
	@GET
	@Path("{id: \\d+}")	//supports digit only
	public Response getUserById(@PathParam("id") int id){
		return Response.status(200).entity("getUserById is called, id : " + id).build();
	}
	
	// url : /users/username/aaa
	@GET
	@Path("/username/{username : [a-zA-Z][a-zA-Z0-9]*}") 
	public Response getUserByUserName(@PathParam("username") String username){
		return Response.status(200).entity("getUserByUserName is called, username : " + username).build();
	}
	
	// url : users/books/999
	@GET
	@Path("/books/{isbn : \\d+}")
	public Response getUserBookByISBN(@PathParam("isbn") String isbn){
		return Response.status(200).entity("getUserBookByISBN is called, isbn : " + isbn).build();
	}
	
	// url : /users/2011/06/30
	@GET
	@Path("{year}/{month}/{day}")
	public Response getUserHistory(@PathParam("year") int year,
								   @PathParam("month") int month,
								   @PathParam("day") int day){
		String date = year +"/"+month+"/"+day;
		return Response.status(200).entity("getUserHistory is called, year/month/day : " + date).build();
	}
	
}

/*	
 * URL : http://localhost:8080/ProjectURL/users
 * 1. http://localhost:8080/RESTfulExample/users ---> if @path is removed
 * 2. http://localhost:8080/RESTfulExample/users/vip
 * 3. http://localhost:8080/RESTfulExample/users/anil
 * 
 * */
