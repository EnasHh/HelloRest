package net.codejava;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/bonjour")
public class HelloResource {

	
	  @GET
	    @Produces(MediaType.TEXT_PLAIN)
	    public String direBonjour() {
	        return "Bonjour, tout le monde!";
	    }
	  
	  @GET
	  @Produces(MediaType.APPLICATION_JSON)
	  public String sayJsonHello() {
	      return "{\"name\":\"greeting\", \"message\":\"Bonjour tout le monde!\"}";
	  }
	  
	  @POST
	  @Consumes(MediaType.APPLICATION_JSON)
	  public Response hi(Rest s) {
		  String name =s.getName();
		  System.out.println(name);
		  return Response.status(200).build();}
	}
