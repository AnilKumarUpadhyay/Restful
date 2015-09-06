package com.anil.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * @author Anil
 *
 * Register “com.sun.jersey.spi.container.servlet.ServletContainer“ in web.xml and
 * put jersey folder under “init-param“, “com.sun.jersey.config.property.packages“.
 */

@Path("/hello")
public class HelloWorldService {
	
	@GET
	@Path("/{param}")
	public Response getMg(@PathParam("param") String msg){
		String output = "Jersy say : " + msg;
		return Response.status(200).entity(output).build();
	}
}

/* Sample URL's
	 * 
	 * 1. projectURL/rest/hello/{any values}
	 * 2. http://localhost:8080/RESTfulExample/rest/hello/anil
	 * 
	 */

  /* 	Corresponding web.xml file  
  
   * <web-app id="WebApp_ID" version="2.4"
	xmlns="http://java.sun.com/xml/ns/j2ee" 
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://java.sun.com/xml/ns/j2ee 
	http://java.sun.com/xml/ns/j2ee/web-app_2_4.xsd">
	<display-name>Restful Web Application</display-name>

	<servlet>
		<servlet-name>jersey-serlvet</servlet-name>
		<servlet-class>
                     com.sun.jersey.spi.container.servlet.ServletContainer
                </servlet-class>
		<init-param>
		     <param-name>com.sun.jersey.config.property.packages</param-name>
		     <param-value>com.anil.rest</param-value>
		</init-param>
		<load-on-startup>1</load-on-startup>
	</servlet>

	<servlet-mapping>
		<servlet-name>jersey-serlvet</servlet-name>
		<url-pattern>/rest/*</url-pattern>
	</servlet-mapping>

</web-app>

   * */



