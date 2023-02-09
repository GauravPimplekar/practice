package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repo.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService {
	
	
	@Autowired
	StudentRepo sRepo;

	@Override
	public Student addStudent(Student student) {
		// TODO Auto-generated method stub
		
		sRepo.save(student);
		return null;
	}

	@Override
	public Student removeStudent(Integer roll) {
		// TODO Auto-generated method stub
		Student student = sRepo.findById(roll).get();
		
		sRepo.deleteById(roll);
		return student;
	}

	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		
		
		return sRepo.save(student);
	}

	@Override
	public Student findStudent(Integer roll) {
		// TODO Auto-generated method stub
		return sRepo.findById(roll).get();
	}

}
