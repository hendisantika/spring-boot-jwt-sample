package com.hendisantika.springbootjwtsample;

import com.hendisantika.springbootjwtsample.domain.Student;
import com.hendisantika.springbootjwtsample.domain.StudentRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootJwtSampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootJwtSampleApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(StudentRepo repository) {
        return (args) -> {
            Student s1 = new Student("Uzumaki", "Naruto", "naruto@mail.com");
            Student s2 = new Student("Uchiha", "Sasuke", "sasuke@mail.com");
            Student s3 = new Student("Haruno", "Sakura", "sakura@mail.com");

            repository.save(s1);
            repository.save(s2);
            repository.save(s3);
        };
    }
}
