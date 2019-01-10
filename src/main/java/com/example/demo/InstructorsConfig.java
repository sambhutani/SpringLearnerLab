package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * @author leon on 07/01/2019.
 */
@Configuration
public class InstructorsConfig {
    @Bean
    public Instructors tcUsaInstructors() {
        return new Instructors(
                new Instructor(0L, "Wilhem"),
                new Instructor(4L, "Nhu"),
                new Instructor(5L, "Kris"));
    }

    @Bean
    public Instructors tcUkInstructors() {
        return new Instructors(
                new Instructor(1L, "Leon"),
                new Instructor(2L, "Dolio"),
                new Instructor(3L, "Froilan"));
    }

    @Bean
    @Primary
    public Instructors instructors() {
        Instructors instructors = tcUkInstructors();
        instructors.addAll(tcUsaInstructors());
        return instructors;
    }
}
