package com.StudentReport.Service;

import java.util.List;

import com.StudentReport.Entity.Student;
import com.StudentReport.Exception.StudentException;

public interface StudentService {

	
	public Student addStudent(Student student) throws StudentException;
	
	public Student addMarksOfStudent(int roll, int semester, int Marks, String Subject) throws StudentException;
	
	public double averagePercentageOfSemeter(int semester) throws StudentException;
	
	public double averageMarkOfStudent(int semester, String subject) throws StudentException;
	
	public List<Student> topTwoStudent() throws StudentException;
	
}
