package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student john = new Student("John", LocalDate.of(2000, 7, 4), "test@test.fr");
            Student jane = new Student("Jane", LocalDate.of(2000, 7, 5), "test2@test.fr");
        studentRepository.saveAll(List.of(john, jane));
        };
    }
}
