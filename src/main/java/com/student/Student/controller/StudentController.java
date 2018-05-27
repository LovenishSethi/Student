package com.student.Student.controller;

import java.util.Optional;

import lombok.extern.slf4j.Slf4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.Student.entity.Student;
import com.student.Student.exception.StudentException;
import com.student.Student.request.StudentRequest;
import com.student.Student.response.BaseResponse;
import com.student.Student.response.StudentResponse;
import com.student.Student.service.IStudentService;

@Slf4j
@RestController
public class StudentController {

	@Autowired
	IStudentService studentService;
	Logger log = LogManager.getLogger(StudentController.class);
	@PostMapping(path="/student/add")
	public ResponseEntity<StudentResponse> create(@RequestBody StudentRequest studentRequest)
	{
		log.error("action=\"create\",description =\"creating student\",studentRequest " + studentRequest);
		StudentResponse studentResponse = null;
		
		try
		{
			studentService.create(studentRequest);	
			studentResponse = new StudentResponse(200,"Successfully added");
			
		}catch(Exception exe)
		{ log.error("action=\"create\",description =\"INTERNAL_SERVER_ERROR\"",exe);
			 studentResponse = new StudentResponse(500,"Student not added");
		}
		
		
       return new ResponseEntity<StudentResponse>(studentResponse,HttpStatus.OK);
		
	}
	
	@GetMapping(path="/student/retrieve")
	public Iterable<Student> retrieveAll()
	{
		return studentService.retrieveAll();
	}
	
	@GetMapping(path="/student/retrieveStudent/{rollNo}")
	public Optional<Student> retrieveStudent(@PathVariable int rollNo) throws StudentException
	{
		return studentService.retrieveStudent(rollNo);
	}
	
	@GetMapping(path="/student/update/{rollNo}")
	public void update(@PathVariable int rollNo)
	{
		studentService.update(rollNo);
	}
	
	@GetMapping(path="/student/delete/{rollNo}")
	public void delete(@PathVariable int rollNo)
	{
		log.info("ROllno is ",+rollNo);
		studentService.delete(rollNo);
	}
}
