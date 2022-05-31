package com.spring.model;

public class ResponseModel {

	private String name;
	private String job;
	private int id;
	private String createdAt;
	public ResponseModel(String name, String job, int id, String createdAt) {
		super();
		this.name = name;
		this.job = job;
		this.id = id;
		this.createdAt = createdAt;
	}
	public ResponseModel() {
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	@Override
	public String toString() {
		return "RequestModel [name=" + name + ", job=" + job + ", id=" + id + ", createdAt=" + createdAt + "]";
	}
	
}
