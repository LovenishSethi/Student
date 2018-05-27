package com.student.Student.service;

import java.util.Optional;

import com.student.Student.entity.Student;
import com.student.Student.exception.StudentException;
import com.student.Student.request.StudentRequest;

public interface IStudentService {

	public void create(StudentRequest student);
	public Iterable<Student> retrieveAll();
	public  Optional<Student> retrieveStudent(int rollNo) throws StudentException;
	public void delete(int rollNo);
	public void update(int rollNo);
	
	
}
