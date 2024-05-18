package com.example.student.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.student.entity.StudentEntity;
import com.example.student.repository.StudentRepository;

@Service
public class StudentService implements  StudentServiceImpl  {
	@Autowired
	StudentRepository studentRepository;

	@Override
	public void studentEntity(StudentEntity student) {
		studentRepository.save(student);
	}

	@Override
	public Optional<StudentEntity> getstudent(int id) {
		return studentRepository.findById(id);
	}
	
	
}
