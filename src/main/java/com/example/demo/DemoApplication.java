package com.example.demo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.student.Student;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/")
	public List<Student> hello() {
		return List.of(
			new Student(1L, "Amy", "amy@gmail.com", LocalDate.of(1990, 2, 13), 22), 
			new Student(2L, "Bob", "bob@gmail.com", LocalDate.of(1990, 5, 22), 22)
			);
	}
}
