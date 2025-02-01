package com.practice.springboot.learn_spring_boot;

public class Dto {

	private int id;
	private String name;
	private String job;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public Dto(int id, String name, String job) {
		super();
		this.id = id;
		this.name = name;
		this.job = job;
	}
	public Dto() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Dto [id=" + id + ", name=" + name + ", job=" + job + "]";
	}
	
	
}
