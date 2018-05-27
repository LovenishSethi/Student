package com.student.Student.request;

public class StudentRequest {

	String name;
	int rollNo;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "StudentRequest [name=" + name + ", rollNo=" + rollNo + "]";
	}
	
	
}
