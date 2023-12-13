package com.org.xochitl.streams.exercises;

import java.util.Arrays;
import java.util.List;

public class E3ConvertToUppercase {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Xochitl", "del", "Rocio", "Negrete", "Eufracio");

        convertToUppercase(strings);
    }

    private static void convertToUppercase(List<String> strings) {
        strings.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
