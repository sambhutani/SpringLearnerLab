package com.example.demo;

/**
 * @author leon on 07/01/2019.
 */
public class Student extends Person implements Learner {
    Double totalStudyTime;

    public Student() {
        this(null, null);
    }

    public Student(Long id, String name) {
        super(id, name);
    }

    @Override
    public void learn(Double numberOfHours) {
        totalStudyTime += numberOfHours;
    }

    public Double getTotalStudyTime() {
        return totalStudyTime;
    }
}
