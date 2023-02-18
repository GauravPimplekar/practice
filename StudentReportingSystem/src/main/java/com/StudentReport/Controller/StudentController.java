package com.StudentReport.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.StudentReport.Entity.Student;
import com.StudentReport.Exception.StudentException;
import com.StudentReport.Service.StudentService;

@RestController
public class StudentController {

	
	@Autowired
	StudentService sService;
	
	
	@PostMapping("/Student")
	public Student addStudent(@RequestBody Student student) throws StudentException{
		
		return sService.addStudent(student);
	}
	
	@PutMapping("/Student/{roll}/{semester}/{marks}/{subject}")
	public Student addMarksOfStudent(@PathVariable int roll, @PathVariable int semester, @PathVariable int marks, @PathVariable String subject) throws StudentException {
		
		return sService.addMarksOfStudent(roll, semester, marks, subject);
	}
	
	@GetMapping("/AverageOfSemester/{semester}")
	public double getAverageOfSemester(@PathVariable int semester) throws StudentException {
		
		return sService.averagePercentageOfSemeter(semester);
	}
	
	@GetMapping("/AverageOfSubject/{semester}/{subject}")
	public double getAverageOfSubject(@PathVariable int semester, @PathVariable String subject) throws StudentException {
		
		return sService.averageMarkOfStudent(semester, subject);
	}
	
	
	@GetMapping("/hello")
	public double hello() throws StudentException {
		return sService.averagePercentageOfSemeter(1);
	}
}
