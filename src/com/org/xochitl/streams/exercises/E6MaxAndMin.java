/*
* Given a list of numbers, use Java Streams to find the maximum and minimum.
* */

package com.org.xochitl.streams.exercises;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class E6MaxAndMin {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        findMaxAndMin(numbers);
    }

    private static void findMaxAndMin(List<Integer> numbers) {
        Optional<Integer> max = numbers.stream().max(Integer::compareTo);
        Optional<Integer> min = numbers.stream().min(Integer::compareTo);

        System.out.println("Max: " +max.orElse(-1));
        System.out.println("Min: " +min.orElse(-1));
    }
}
