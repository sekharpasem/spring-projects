package com.sample.rest.tasks.config;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.sample.rest.tasks.resource.TasksResource;

@ApplicationPath("/rest")
public class ApplicationConfig extends Application {
	@SuppressWarnings("unchecked")
	public Set<Class<?>> getClasses() {
		System.out.println("called ApplicationConfig");
		return new HashSet<Class<?>>(Arrays.asList(TasksResource.class));
	}
}
