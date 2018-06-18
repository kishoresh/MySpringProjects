package com.spring.first;

import org.springframework.stereotype.Component;

//@Component
public class Class {
	private Integer classid;
	private String name;
	private String teacher;
	
	public Class() {
		// TODO Auto-generated constructor stub
	}
	
	public Class(Integer id, String name, String teacher) {
	    this.classid = id;
	    this.name = name;
	    this.teacher = teacher;
	}
	
	public Integer getclassid() {
		return classid;
	}
	public void setclassid(Integer classid) {
		this.classid = classid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

	@Override
	public String toString() {
		return getclassid() + " , " + getName()  + " , " + getTeacher();
	}

}
