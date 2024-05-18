package com.example.student.controller;

import com.example.student.entity.StudentEntity;
import com.example.student.service.StudentServiceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	StudentServiceImpl studentServiceimp;
	
	@PostMapping("/details")
	public StudentEntity studentEntity(@RequestBody StudentEntity student) {
		studentServiceimp.studentEntity(student);
		return student;
	}	
		
	@GetMapping("/getdetails/{id}")	 
    public Optional<StudentEntity> getstudent(@PathVariable ("id") int id){
		return studentServiceimp.getstudent(id);
		 
		}
		
	
	
	

}
