package com.StudentReport.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.StudentReport.Entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

	
	public List<Student> findBySemester(int semester);
}
