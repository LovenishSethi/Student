package com.student.Student.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.student.Student.entity.Student;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;



public class StudentResponse extends BaseResponse{
	
	public Student getData() {
		return data;
	}

	public void setData(Student data) {
		this.data = data;
	}

	@JsonProperty("Data")
	Student data;

	public StudentResponse(int statusCode, String message, Student data) {
		super(statusCode, message);
		this.data = data;
	}

	public StudentResponse(int i, String string) {
		super(i,string);
	}
}
