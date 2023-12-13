/*
* Given a list of students, use Java Streams to obtain the average age of the students.
* */

package com.org.xochitl.streams.exercises;

import java.util.Arrays;
import java.util.List;

public class E9AverageAges {
    public record Student(String name, int age){
    }
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Xochitl", 27),
                new Student("Roberto", 22),
                new Student("Rodrigo", 27),
                new Student("Jose", 37),
                new Student("Mario", 31)
        );

        avgAges(students);
    }

    private static void avgAges(List<Student> ages) {
        double avgAge = ages.stream()
                .mapToDouble(students -> students.age)
                .average()
                .orElse(0.0);
        System.out.println(avgAge);

    }
}
