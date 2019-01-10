package com.example.demo;

/**
 * @author leon on 07/01/2019.
 */
public interface Teacher {
    void teach(Learner learner, Double numberOfHours);
    void lecture(Iterable<? extends Learner> learners, Double numberOfHours);
}
