package com.org.xochitl.collections;/*
*
* // Write a program that will count the frequency of the words in the String.
// Example: I think coding is fun... fun Fun fun!
// Output
// I - 1
// think - 1
// coding - 1
// fun - 3
// Fun - 1
* */

import java.util.*;

public class PracticeMaps {
    public static void main(String[] args) {
        String string = "I think coding is fun... fun Fun fun!";

        countWords(string);
    }

    private static void countWords(String string) {
        String[] split = string.split("[ !.]");
        Map<String, Integer> map = new LinkedHashMap<>();

        for (String s : split) {
            map.merge(s, 1, Integer::sum);
        }

        map.remove("");

        map.forEach((key, value) -> System.out.println((key + ": " + value)));
    }
}