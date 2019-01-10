package com.example.demo;

/**
 * @author leon on 07/01/2019.
 */
public class Instructor extends Person implements Teacher {
    public Instructor() {
        this(null, null);
    }

    public Instructor(Long id, String name) {
        super(id, name);
    }

    @Override
    public void teach(Learner learner, Double numberOfHours) {
        learner.learn(numberOfHours);
    }

    @Override
    public void lecture(Iterable<? extends Learner> learners, Double numberOfHours) {
        for (Learner learner : learners) {
            learner.learn(numberOfHours);
        }
    }
}
