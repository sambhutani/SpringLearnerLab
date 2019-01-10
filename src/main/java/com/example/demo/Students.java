package com.example.demo;

/**
 * @author leon on 07/01/2019.
 */
public class Students extends People<Student> {
    public Students(Student... students) {
        super(students);
    }
}
