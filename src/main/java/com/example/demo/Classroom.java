package com.example.demo;

/**
 * @author leon on 07/01/2019.
 */
public class Classroom {
    private Instructors instructors;
    private Students students;

    public Classroom(Instructors instructors, Students students) {
        this.instructors = instructors;
        this.students = students;
    }

    public void hostLecture(Teacher teacher, double numberOfHours) {
        teacher.lecture(students, numberOfHours);
    }
}
