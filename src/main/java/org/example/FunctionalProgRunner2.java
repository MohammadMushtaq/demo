package org.example;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FunctionalProgRunner2 {

    public static void main(String[] args) {

        List<Integer> list = List.of(12, 43, 56, 76, 23, 12, 4, 4);

        list.stream().distinct().sorted().forEach(element -> System.out.print(element + " "));
        System.out.println();
        list.stream().distinct().map(e -> e * e).forEach(element -> System.out.print(element + " "));
        System.out.println();
        IntStream.range(0, 11).forEach(element -> System.out.print(element + " "));
        System.out.println();
        IntStream.range(1, 10).map(e -> e * e).forEach(element -> System.out.print("elementSqaure - " + element + " "));
        System.out.println();
        List<String> words = List.of("Apple", "banana", "grapes", "kiwi");
        words.stream().map(e -> e.toLowerCase()).forEach(e -> System.out.print(e + " "));
        System.out.println();
        words.stream().map(e -> e.length()).forEach(e -> System.out.print(e + " "));
        System.out.println();
        int sum2 = IntStream.range(1, 11).reduce(0, (num1, num2) -> num1 + num2);
        System.out.println(sum2);
        Integer sampleMax = Stream.of(34, 44, 64, 73, 846, 988).max(Integer::compare).get();
        Integer max = List.of(3, 43, 54, 23, 546, 7888).stream().max((n1, n2) -> Integer.compare(n1, n2)).get();
        System.out.println(max);
        System.out.println(sampleMax);

        List.of(3, 43, 54, 23, 546, 7888).stream().filter(element -> element % 2 == 1).forEach(e -> System.out.print(e + " "));
        List<Integer> list11 = List.of(3, 43, 54, 23, 546, 7888).stream().filter(element -> element % 2 == 1).collect(Collectors.toList());
        System.out.println();
        System.out.println(list11);

        System.out.println(IntStream.range(1, 11).map(e -> e * e).boxed().collect(Collectors.toList()));
        System.out.println(List.of(23, 37, 42, 91).stream().filter(e -> e % 2 == 0).max((n1, n2) -> Integer.compare(n1, n2)).orElse(0));
        System.out.println(List.of(23, 37, 42, 91).stream().filter(e -> e % 2 == 0).max(Integer::compare).orElse(0));

        System.out.println();
        System.out.println(List.of(1, 2, 3).stream().mapToLong(e -> e * e).reduce(0, (number1, number2) -> number1 + number2));
        System.out.println(List.of(1, 2, 3).stream().mapToLong(e -> e * e).sum());
    }
}
