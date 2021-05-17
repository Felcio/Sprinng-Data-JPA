package com.dream.project.datajpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DatajpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(DatajpaApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(StudantRepository studantRepository) {
        return args -> {
            Student student = new Student(
                    "Felcio"
                    , "Vilanculos",
                    "felcioedmundo@gmail.com",
                    22);
            studantRepository.save(student);
        };
    }
}
