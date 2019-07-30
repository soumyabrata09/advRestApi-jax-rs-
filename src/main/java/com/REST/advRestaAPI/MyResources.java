/**
 * 
 */
package com.REST.advRestaAPI;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.REST.advRestaAPI.services.wordCounter;

/**
 * @author Sam
 *
 */
@Path("/test")
//@Path("{pathPar}/test")
public class MyResources {

	//wordCounter wc;
	//@PathParam("pathPar") private String pathParam;
	@QueryParam("word") private String queryParam_1;
	@QueryParam("string1") private String queryParam_2;
	@QueryParam("string2") private String queryParam_3;
	
	
//	public String testMethod() {
//		
//		return "Rest API Demo : PathaParam = $" + pathParam +" used ; QueryParam = $"+ queryParam +" used";
//	}
	@GET
	@Path("/wc")
	@Produces(MediaType.TEXT_PLAIN)
	public String testWordCounter() {
		
		return wordCounter.printFrequencyOfLetter(queryParam_1);
	}
	
	@GET
	@Path("/isAnagram")
	@Produces(MediaType.TEXT_PLAIN)
	public String testAnagram() {
		return com.REST.advRestaAPI.services.testAnagram.isAnagram(queryParam_2, queryParam_3);
	}
	
//public String testMethod() {
//		return "RestAPI Demo : Test Successfully ";
//		//return "Rest API Demo : PathaParam = $" + pathParam +" used ; QueryParam = $"+ queryParam +" used";
//	}
}
