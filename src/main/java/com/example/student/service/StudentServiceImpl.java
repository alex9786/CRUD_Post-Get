package com.example.student.service;

import java.util.Optional;

import com.example.student.entity.StudentEntity;

public interface StudentServiceImpl {
	
	void studentEntity(StudentEntity student);

	Optional<StudentEntity> getstudent(int id);

}
