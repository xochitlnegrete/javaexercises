package com.org.xochitl.streams;

import java.util.*;
import java.util.stream.Collectors;

public class StreamsIntegerExamples {

    public static void main(String[] args) {
        //filter:
        // Use filter to select elements based on a condition.
        List<String> names = Arrays.asList("Xochitl", "del", "Rocio", "Negrete", "Eufracio");
        List<String> result = names.stream()
                .filter(name -> name.startsWith("R"))
                .toList();
        System.out.println(result);
        //[Rocio]

        //map:
        // Use map to transform each element.
        List<Integer> lengths = names.stream()
                .map(String::length)
                .toList();
        System.out.println(lengths);
        //[7, 3, 5, 7, 8]

        //flatMap:
        // Use flatMap to flatten nested collections.//unir
        List<List<Integer>> numbers2 = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4));
        List<Integer> flattened = numbers2.stream()
                .flatMap(List::stream)
                .toList();
        System.out.println(flattened);
        //[1, 2, 3, 4]

        //sorted:
        // Use sorted to sort elements.
        List<String> sortedNames = names.stream()
                .sorted()
                .toList();
        System.out.println(sortedNames);
        //[Eufracio, Negrete, Rocio, Xochitl, del]

        //collect:
        // Use collect to accumulate elements into a collection.
        Set<String> nameSet = names.stream()
                .filter(name -> name.startsWith("R"))
                .collect(Collectors.toSet());
        System.out.println(nameSet);
        //[Rocio]

        //reduce:
        // Use reduce to perform a reduction on the elements.
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.println(sum);
        //15

        //limit & ski:
        //limit:
        // Use limit to reduce the size of the stream
        List<Integer> limited = numbers.stream()
                .limit(3)
                .toList();

        // skip:
        // to bypass elements.
        List<Integer> skipped = numbers.stream()
                .skip(2)
                .toList();

        System.out.println(limited);
        //[1, 2, 3]
        System.out.println(skipped);
        //[3, 4, 5]

        //matching
        //anyMatch:
        // This method checks if at least one element in the stream matches the specified condition.
        boolean anyGreaterThanThree = numbers.stream().anyMatch(n -> n > 3);
        System.out.println(anyGreaterThanThree);
        //true
        //allMatch:
        // This method checks if all elements in the stream match the specified condition.
        boolean allGreaterThanZero = numbers.stream().allMatch(n -> n > 0);
        System.out.println(allGreaterThanZero);
        //true
        //noneMatch:
        // This method checks if none of the elements in the stream match the specified condition.
        boolean noneGreaterThanFive = numbers.stream().noneMatch(n -> n > 5);
        System.out.println(noneGreaterThanFive);
        //true

        //groupingBy:
        // Use it when you want to group elements based on a more general characteristic, and you expect multiple
        // elements to share the same key.
        // &
        // partioningBy: Use it when you want to split elements into two groups based on a boolean condition, and you
        // only need two groups (true or false).
        Map<Integer, List<String>> groupedByLength = names.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(groupedByLength);
        //{3=[del], 5=[Rocio], 7=[Xochitl, Negrete], 8=[Eufracio]}

        Map<Boolean, List<String>> partitionedByLength = names.stream()
                .collect(Collectors.partitioningBy(name -> name.length() > 3));
        System.out.println(partitionedByLength);
        //{false=[del], true=[Xochitl, Rocio, Negrete, Eufracio]}

        //distinct:
        // It ensures that each element appears only once in the output stream.
        List<Integer> numbers3 = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        List<Integer> uniqueNumbers = numbers3.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(uniqueNumbers);
        //[1, 2, 3, 4, 5]

        //min & max:
        // These operations require a comparator to determine the order of elements.
        List<Integer> numbers4 = Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6, 5);

        Optional<Integer> min = numbers4.stream()
                .min(Integer::compareTo);

        System.out.println(min.orElse(-1));
        // 1

        Optional<Integer> max = numbers4.stream()
                .max(Integer::compareTo);

        System.out.println(max.orElse(-1));
        // 9

        //count:
        // The count operation returns the number of elements in a stream.
        long count = names.stream()
                .count();

        System.out.println(count);
        // 5

        //findFirst & findAny:
        // It's important to note that findAny is often used in parallel streams where order is not
        // guaranteed, while findFirst is more deterministic in a sequential stream.
        Optional<String> first = names.stream()
                .findFirst();

        System.out.println(first.orElse("None"));
        // Xochitl

        Optional<String> any = names.stream()
                .findAny();

        System.out.println(any.orElse("None"));
        // Xochitl (may vary)
    }
}
