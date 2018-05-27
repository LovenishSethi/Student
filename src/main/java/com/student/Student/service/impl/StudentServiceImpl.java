package com.student.Student.service.impl;

import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.Student.controller.StudentController;
import com.student.Student.entity.Student;
import com.student.Student.exception.StudentException;
import com.student.Student.repository.IStudentRepository;
import com.student.Student.request.StudentRequest;
import com.student.Student.service.IStudentService;

@Service
public class StudentServiceImpl implements IStudentService {

	@Autowired
	IStudentRepository studentRepository;
	Logger log = LogManager.getLogger(StudentServiceImpl.class);
	
	public void create(StudentRequest studentRequest) {
		final Student student = new Student();
		student.setName(studentRequest.getName());
		student.setRollNo(studentRequest.getRollNo());
		log.info("student ================================="+student);
		studentRepository.save(student);
	}

	public Iterable<Student> retrieveAll() {
	
		Iterable<Student> students = studentRepository.findAll();
		return students;
	}

	public void delete(int rollNo) {
		log.info("ROLLNO IN IMPL "+rollNo);
		studentRepository.deleteByRollNo(rollNo);
		
	}

	
	public void update(int rollNo) {
		
	}

	public Optional<Student> retrieveStudent(int rollNo) throws StudentException {
		Optional<Student> student = studentRepository.findByRollNo(rollNo);
		if(!student.isPresent())
		{
			throw new StudentException("Invalid RollNo");
		}
		return student;
	}


}
