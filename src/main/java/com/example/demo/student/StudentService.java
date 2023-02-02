package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    public List<Student> getStudents() {
		return List.of(
			new Student(1L, "Amy", "amy@gmail.com", LocalDate.of(1990, Month.FEBRUARY, 13), 22), 
			new Student(2L, "Bobby", "bobby@gmail.com", LocalDate.of(1992, Month.JULY, 22), 22)
			);
	}
}
