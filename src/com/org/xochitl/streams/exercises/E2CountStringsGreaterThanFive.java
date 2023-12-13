package com.org.xochitl.streams.exercises;

import java.util.Arrays;
import java.util.List;

public class E2CountStringsGreaterThanFive {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Xochitl", "del", "Rocio", "Negrete", "Eufracio");

        countStringGreaterThanFive(strings);

    }

    private static void countStringGreaterThanFive(List<String> strings) {
        long counter = strings.stream()
                .filter(string -> string.length() > 5)
                .count();
        System.out.println(counter);
    }
}
