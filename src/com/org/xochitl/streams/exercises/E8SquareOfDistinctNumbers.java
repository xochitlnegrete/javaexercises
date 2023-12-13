/*
* Given a list of numbers, use Java Streams to obtain a list of the squares of distinct numbers.
* */

package com.org.xochitl.streams.exercises;

import java.util.Arrays;
import java.util.List;

public class E8SquareOfDistinctNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 1, 5, 6, 3, 8, 2, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        squareDistinctNumbers(numbers);
    }

    private static void squareDistinctNumbers(List<Integer> numbers) {
        numbers.stream()
                .distinct()
                .map(number -> number * number)
                .forEach(System.out::println);
    }
}
