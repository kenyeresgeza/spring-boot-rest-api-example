package com.example.demo;

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
            Student maria = new Student(1L, "Maria", LocalDate.of(1987, 10, 3), "maria.jamal@gmail.com");
            Student joseph = new Student(2L, "Joseph", LocalDate.of(1981, 1, 23), "joseph@gmail.com");
            Student huanita = new Student(3L, "Huanita", LocalDate.of(1997, 11, 12), "huanita@gmail.com");

            studentRepository.saveAll(List.of(maria, joseph, huanita));
        };

    }

}
