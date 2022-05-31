package com.spring.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Request {
	
	private String name;
	private String job;
	@JsonCreator
	public Request(@JsonProperty("name") String name,@JsonProperty("job") String job) {
		super();
		this.name = name;
		this.job = job;
	}
	public Request() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	@Override
	public String toString() {
		return "Model [name=" + name + ", job=" + job + "]";
	}
	
	

}
