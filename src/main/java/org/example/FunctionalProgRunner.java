package org.example;

import java.util.ArrayList;
import java.util.List;

public class FunctionalProgRunner {

    public static void main(String[] args) {

        List<String> list = List.of("apple", "banana", "orange", "kiwi", "apricot");
        List<Integer> listNumber = List.of(23, 32, 45, 65, 7);

        ArrayList<String> arrayList = new ArrayList<>(list);
        ArrayList<Integer> numberList = new ArrayList<>(listNumber);
        //System.out.println(arrayList);
        printWithFP(arrayList);
        printNumberWithFP(numberList);
        printbasicfilter(arrayList);
        printbasicfilterByFP(arrayList);
        System.out.println();
        listNumber.stream().filter(element -> element % 2 == 1).forEach(System.out::println);
        System.out.println();
        int sum = listNumber.stream().reduce(0, (number1, number2) -> number1 + number2);
        int sum1 = listNumber.stream().reduce(0, Integer::sum);
        System.out.println("normalsum " + sum);
        int oddSumNumber = listNumber.stream().filter(element -> element % 2 == 1).reduce(0, (number1, number2) -> number1 + number2);
        System.out.println("oddnumbersum " + oddSumNumber);

        int oddSumNumbers = listNumber.stream()
                .reduce(0, (number1, number2) -> {
                    System.out.println(number1 + " " + number2);
                    return number1 + number2;
                });
        System.out.println(oddSumNumbers);

    }

    private static void printbasic(ArrayList<String> arrayList) {
        for (String printlist : arrayList) {
            System.out.println(printlist);
        }
    }

    private static void printbasicfilter(ArrayList<String> arrayList) {
        for (String printlist : arrayList) {
            if (printlist.endsWith("le")) {
                System.out.println(printlist);
            }
        }
    }

    private static void printWithFP(ArrayList<String> arrayList) {
        arrayList.stream().forEach(
                element -> System.out.println("element printWithFP- " + element));
    }

    private static void printNumberWithFP(ArrayList<Integer> arrayList) {

        arrayList.stream().forEach(element -> System.out.println("number - " + element));
    }

    private static void printbasicfilterByFP(ArrayList<String> arrayList) {
        arrayList.stream().filter(
                        element -> element.startsWith("ap")
                )
                .forEach(
                        element -> System.out.println("element - " + element)
                );
    }
}
