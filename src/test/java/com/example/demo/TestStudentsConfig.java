package com.example.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

/**
 * @author leon on 07/01/2019.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestStudentsConfig {
    @Autowired
    @Qualifier("previousStudents")
    private Students previousStudents;

    @Autowired
    @Qualifier("students")
    private Students currentStudents;

    @Test
    public void testCurrentStudents() {
        List<String> names = Arrays.asList("Lauren Nate X Jae etc.".split(" "));
        for (Student student : currentStudents) {
            String name = student.getName();
            boolean outcome = names.contains(name);
            Assert.assertTrue(outcome);
        }
    }
}
