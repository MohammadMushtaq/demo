package org.example;

import java.util.List;


public class FunctionalProgRunnerMethodRef {

    public static boolean isEven(Integer number) {
        return number % 2 == 0;
    }

    public static void print(Integer number) {
        System.out.println(number);
    }

    public static void main(String[] args) {
        List.of("Ant", "Bats", "Cat", "crocodile").stream().map(s -> s.length()).forEach(e -> System.out.print(e + " "));
        System.out.println();
        List.of("Ant", "Bats", "Cat", "crocodile").stream().map(s -> s.length()).forEach(System.out::println);
        System.out.println();
        List.of("Ant", "Bats", "Cat", "crocodile").stream().map(String::length).forEach(FunctionalProgRunnerMethodRef::print);

        System.out.println(List.of(23, 37, 42, 91).stream().filter(FunctionalProgRunnerMethodRef::isEven).max(Integer::compare).orElse(0));


    }
}
