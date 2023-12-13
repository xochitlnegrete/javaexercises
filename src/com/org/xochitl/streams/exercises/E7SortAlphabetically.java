/*
* Given a list of words, use Java Streams to sort them alphabetically.
* */

package com.org.xochitl.streams.exercises;

import java.util.Arrays;
import java.util.List;

public class E7SortAlphabetically {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Xochitl", "del", "Rocio", "Negrete", "Eufracio");

        sortAlphabetically(strings);
    }

    private static void sortAlphabetically(List<String> strings) {
        List<String> stringsSorted = strings.stream()
                .sorted()
                .toList();
        System.out.println(stringsSorted);
    }
}
