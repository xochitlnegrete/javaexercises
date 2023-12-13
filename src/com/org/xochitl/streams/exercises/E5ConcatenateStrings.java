/*
* Given a list of words, use Java Streams to obtain the concatenation of all words separated by a space.
 */

package com.org.xochitl.streams.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class E5ConcatenateStrings {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Xochitl", "del", "Rocio", "Negrete", "Eufracio");
        concatenateString(strings);
    }

    private static void concatenateString(List<String> strings) {
        String concatenation = strings.stream()
                .collect(Collectors.joining(" "));
        System.out.println(concatenation);
    }
}
