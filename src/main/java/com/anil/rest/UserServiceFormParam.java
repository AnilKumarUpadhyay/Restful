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



/*	
 * 
 * <web-app id="WebApp_ID" version="2.4"
	xmlns="http://java.sun.com/xml/ns/j2ee" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://java.sun.com/xml/ns/j2ee 
	http://java.sun.com/xml/ns/j2ee/web-app_2_4.xsd">
	<display-name>Restful Web Application</display-name>

	<context-param>
		<param-name>resteasy.scan</param-name>
		<param-value>true</param-value>
	</context-param>

	<context-param>
		<param-name>resteasy.servlet.mapping.prefix</param-name>
		<param-value>/rest</param-value>
	</context-param>

	<listener>
		<listener-class>
			org.jboss.resteasy.plugins.server.servlet.ResteasyBootstrap</listener-class>
	</listener>
	<servlet>
		<servlet-name>resteasy-servlet</servlet-name>
		<servlet-class>
			org.jboss.resteasy.plugins.server.servlet.HttpServletDispatcher</servlet-class>
	</servlet>

	<servlet-mapping>
		<servlet-name>resteasy-servlet</servlet-name>
		<url-pattern>/rest/*</url-pattern>
	</servlet-mapping>

</web-app>
 * 
 * 
 */