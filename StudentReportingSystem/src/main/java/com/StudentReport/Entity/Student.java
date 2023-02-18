package com.StudentReport.Entity;

import org.springframework.validation.annotation.Validated;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Validated
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int roll;
	String name;
	
	@Max(value = 2)
	int semester;
	int englishMarks;
	int mathMarks;
	int scienceMarks;
	
}
