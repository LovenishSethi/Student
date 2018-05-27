package com.student.Student.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.student.Student.entity.Student;

@Repository
public interface IStudentRepository extends CrudRepository<Student,Integer> {

	 Optional<Student> findByRollNo(int rollNo);
	 void deleteByRollNo(int rollNo);
}
