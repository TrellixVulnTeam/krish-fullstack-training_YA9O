package com.upulie.rentacycle.demoapplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.upulie.rentacycle.demoapplication.model.Student;
import com.upulie.rentacycle.demoapplication.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	StudentRepository studentRepository;
	
	@Override
	public Student save(Student student) {
		//comes from the controller, to the service, goes to the repository
		return studentRepository.save(student);
	}
	
}
