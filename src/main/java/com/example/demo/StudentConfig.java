package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author leon on 07/01/2019.
 */
@Configuration
public class StudentConfig {
    @Bean(name = "students")
    public Students currentStudents() {
        return new Students(
                new Student(0L, "Lauren"),
                new Student(1L, "Nate"),
                new Student(2L, "X"),
                new Student(3L, "Jae"),
                new Student(4L, "etc."));
    }

    @Bean
    public Students previousStudents() {
        return new Students(
                new Student(0L, "The old Lauren"),
                new Student(1L, "The old Nate"),
                new Student(2L, "The old X"),
                new Student(3L, "The old Jae"),
                new Student(4L, "The old etc."));
    }
}
