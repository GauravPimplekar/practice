package com.StudentReport.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;

import com.StudentReport.Entity.Student;
import com.StudentReport.Exception.StudentException;
import com.StudentReport.Repo.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	StudentRepo sRepo;

	@Override
	public Student addStudent(Student student) throws StudentException {
		// TODO Auto-generated method stub
		
		if(student != null) {
			Student student2 = sRepo.save(student);
			
			return student2;
		}
		else {
			throw new StudentException("Student not be null");
		}
		
		
	}

	@Override
	public Student addMarksOfStudent(int roll, int semester, int marks, String subject) throws StudentException {
		// TODO Auto-generated method stub
		
		Student student = sRepo.findById(roll).orElseThrow(() -> new StudentException("Student not found with roll ="+roll));
		
		if(student.getSemester() != semester) {
			throw new StudentException("please enter the valide semester details");
		}
		
		if(subject.equals("english")) {
			student.setEnglishMarks(marks);
		}
		else if(subject.equals("math")) {
			student.setMathMarks(marks);
		}
		else if(subject.equals("science")){
			student.setScienceMarks(marks);
		}
		else {
			throw new StudentException("please enter valide subject");
		}
		
		sRepo.save(student);
		return student;
	}

	@Override
	public double averagePercentageOfSemeter(int semester) throws StudentException {
		// TODO Auto-generated method stub
		
		List<Student> studentList = sRepo.findBySemester(semester);
		
		System.out.println(studentList);
		
		if(studentList.size() == 0) {
			throw new StudentException("students is not available in semester = "+semester);
		}
		
		int totalClassMarks =0;
		int totalSubjectMarks = studentList.size()*300;
		for(int i=0; i<studentList.size(); i++) {
			totalClassMarks += studentList.get(i).getEnglishMarks();
			totalClassMarks += studentList.get(i).getMathMarks();
			totalClassMarks += studentList.get(i).getScienceMarks();
		}
		
		int total = (totalClassMarks*100);
		
		double percentage = total/totalSubjectMarks;
		
		return percentage;
	}

	@Override
	public double averageMarkOfStudent(int semester, String subject) throws StudentException {
		// TODO Auto-generated method stub
		
		List<Student> studentList = sRepo.findBySemester(semester);
		
		if(studentList.size() == 0) {
			throw new StudentException("students is not available in semester = "+semester);
		}
		
		int totalClassMarks =0;
		
		for(int i=0; i<studentList.size(); i++) {
			
			if(subject.equals("english")) {
				totalClassMarks += studentList.get(i).getEnglishMarks();
			}
			else if(subject.equals("math")) {
				totalClassMarks += studentList.get(i).getMathMarks();
			}
			else if(subject.equals("science")) {
				totalClassMarks += studentList.get(i).getScienceMarks();
			}
			else {
				throw new StudentException("please enter valide subject");
			}
		}
		
		double percentage = totalClassMarks/studentList.size();
		
		return percentage;
	}

	@Override
	public List<Student> topTwoStudent() {
		// TODO Auto-generated method stub
		return null;
	}

}
