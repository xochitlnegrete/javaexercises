/*
* Given a list of words, use Java Streams to count how many words start with the letter "a".
* */

package com.org.xochitl.streams.exercises;

import java.util.Arrays;
import java.util.List;

public class E10WordsStartWithR {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Xochitl", "del", "Rocio", "Negrete", "Eufracio");

        countWordsStartWithR(strings);
    }

    private static void countWordsStartWithR(List<String> strings) {
        long counter = strings.stream()
                .filter(string -> string.startsWith("R"))
                .count();
        System.out.println(counter);
    }
}
