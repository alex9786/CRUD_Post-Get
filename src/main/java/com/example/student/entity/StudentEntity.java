package com.example.student.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student_details")
public class StudentEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="student_id")
	private int no;
	@Column(name="student_name")
	private String name;
	@Column(name="student_info")
	private String address;
	
	public StudentEntity(int no, String name, String address) {
		super();
		this.no = no;
		this.name = name;
		this.address = address;
	}
	
	public StudentEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	
	
}
