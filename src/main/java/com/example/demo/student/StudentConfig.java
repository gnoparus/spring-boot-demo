package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
    
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student amy= new Student("Amy", "amy11@gmail.com", LocalDate.of(1981, Month.JANUARY, 1));
            Student bobby = new Student("Bobby", "bobby22@gmail.com", LocalDate.of(1982, Month.FEBRUARY, 2));

            repository.saveAll(List.of(amy, bobby));
        };
    }
}
