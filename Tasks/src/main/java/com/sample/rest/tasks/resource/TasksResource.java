package com.sample.rest.tasks.resource;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/tasks")
public class TasksResource {
	@GET
	@Path("/get")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public Map<String,String> getTask() {
		System.out.println("getTask executed..");
		Map<String,String> taskResponse=new HashMap<String,String>();
		taskResponse.put("name", "Reading java always!");
		taskResponse.put("percentage", "100%");
		return taskResponse;
	}
}
