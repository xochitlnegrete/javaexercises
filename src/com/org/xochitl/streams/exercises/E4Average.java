package com.org.xochitl.streams.exercises;

import java.util.Arrays;
import java.util.List;

public class E4Average {
    public static void main(String[] args) {
        List<Double> numbers = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);

        getAverage(numbers);
    }

    private static void getAverage(List<Double> numbers) {
        double avg = numbers.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);
        System.out.println(avg);
        double sum = numbers.stream()
                .mapToDouble(Double::doubleValue)
                .sum();
        System.out.println(sum);
    }
}
