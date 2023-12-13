/*
* Given a list of numbers, use Java Streams to find the sum of the squares of the even numbers.
* */

package com.org.xochitl.streams.exercises;

import java.util.Arrays;
import java.util.List;

public class E1SumOfSquaresOfEvenNumbers {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> list = Arrays.stream(numbers)
                .boxed()
                .toList();


        addSqrt(list);
    }

    private static void addSqrt(List<Integer> numbers) {
        int sum = numbers.stream()
                .filter(number -> number%2 == 0)
                .map(number -> number * number)
                .reduce(0, Integer::sum);
        System.out.println(sum);
    }
}
