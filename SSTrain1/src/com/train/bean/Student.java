package com.train.bean;

public class Student {

	private String stuName;
	private String stuInfo;
	private String stuGender;
	private Teacher teacher;
	
	public Student() {
		
	}
	
	public Student(Teacher teacher) {
		this.teacher = teacher;
	}
	
	public void start() {
		teacher.play();
	}
	
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getStuInfo() {
		return stuInfo;
	}
	public void setStuInfo(String stuInfo) {
		this.stuInfo = stuInfo;
	}
	public String getStuGender() {
		return stuGender;
	}
	public void setStuGender(String stuGender) {
		this.stuGender = stuGender;
	}
	
}
