package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

/**
 * @author leon on 07/01/2019.
 */
@Configuration
public class ClassroomConfig {
    @Bean
    @DependsOn({"instructors", "students"})
    public Classroom currentCohort(Instructors instructors, Students students) {
        return new Classroom(instructors, students);
    }

    @Bean
    @DependsOn({"instructors", "previousStudents"})
    public Classroom previousCohort(Instructors instructors, Students students) {
        return new Classroom(instructors, students);
    }
}
