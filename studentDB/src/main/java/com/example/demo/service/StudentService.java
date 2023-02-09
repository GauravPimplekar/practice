package com.example.demo.service;

import com.example.demo.entity.Student;

public interface StudentService {

	public Student addStudent(Student student);
	
	public Student removeStudent(Integer roll);
	
	public Student updateStudent(Student student);
	
	
	public Student findStudent(Integer roll);
}
