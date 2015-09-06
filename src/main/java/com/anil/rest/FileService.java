package com.anil.rest;

import java.io.File;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

@Path("/file")
public class FileService {
	
//	private static final String fileLocation = "H:\\Files\\file.log";
	//private static final String fileLocation = "\\WEB-INF\\file.log";
	String filePath = new File(System.getProperty("catalina.base"))+ "/file.log";
	// url : file/get
	@GET
	@Path("/get")
	@Produces("text/plain")
	public Response getFile(){
		
		File file = new File(filePath);
		ResponseBuilder response = Response.ok((File)file);
		response.header("Content-Disposition","attachment; filename=\"file_from_server.log\"");
		return response.build();
	}
}
