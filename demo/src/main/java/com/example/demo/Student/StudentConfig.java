package com.example.demo.Student;

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
            Student mariam = new Student(
                    "Mariam",
                    "mariam@gmail.com",
                    LocalDate.of(2000, Month.AUGUST, 3));
            Student alex = new Student(
                    "alex",
                    "alex@gmail.com",
                    LocalDate.of(2006, Month.AUGUST, 3));
            // repository.saveAll(
            // List.of(mariam, alex));
        };
    }
}
