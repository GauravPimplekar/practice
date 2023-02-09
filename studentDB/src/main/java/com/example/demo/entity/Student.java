package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {

	private String name;
	
	@Id
	private Integer roll;
	private int marks;
	private String address;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, Integer roll, int marks, String address) {
		super();
		this.name = name;
		this.roll = roll;
		this.marks = marks;
		this.address = address;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(Integer roll) {
		this.roll = roll;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
