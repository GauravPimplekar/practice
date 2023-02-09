package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.DeleteExchange;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService sService;
	
	@GetMapping("/student/{roll}")
	public ResponseEntity<Student> findStudent(@PathVariable Integer roll){
		Student student = sService.findStudent(roll);
		return new ResponseEntity(student, HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("/student/{roll}")
	public ResponseEntity<Student> removeStudent(@PathVariable Integer roll){
		Student student = sService.removeStudent(roll);
		return new ResponseEntity(student, HttpStatus.ACCEPTED);
	}
	
	@PutMapping("/student")
	public ResponseEntity<Student> updateStudent(@RequestBody Student student){
		Student student2 = sService.updateStudent(student);
		return new ResponseEntity(student2, HttpStatus.ACCEPTED);
	}
	
	@PostMapping("/studenta")
	public ResponseEntity<Student> addStudent(@RequestBody Student student){
		Student student2 = sService.addStudent(student);
		return new ResponseEntity(student2, HttpStatus.ACCEPTED);
	}
}
