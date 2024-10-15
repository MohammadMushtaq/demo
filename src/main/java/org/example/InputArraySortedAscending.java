package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class InputArraySortedAscending {
    public static void main(String[] args) {

        InputArraySortedAscending i = new InputArraySortedAscending();
        System.out.println(i.isSorted(new int[]{1, 5, 9, 11, 77, 5}));
        System.out.println(Arrays.toString(i.reverseArray(new int[]{33, 44, 55, 66, 78})));

        Integer[] arr = {1, 2, 3, 4, 5}; // Use Integer[] for Collections
        reverseArray(arr);
        System.out.println("Reversed array: " + Arrays.toString(arr));

        int[] arr1 = {1, 2, 3, 4, 5};
        arr1 = reverseArrayStream(arr1);
        System.out.println("Reversed array: " + Arrays.toString(arr1));
    }

    public static void reverseArray(Integer[] arr) {
        List<Integer> list = Arrays.asList(arr);
        Collections.reverse(list);
    }

    public static int[] reverseArrayStream(int[] arr) {
        List<Integer> list = Arrays.stream(arr) // Convert to stream
                .boxed() // Convert to Integer
                .collect(Collectors.toList()); // Collect to list
        Collections.reverse(list); // Reverse the list
        return list.stream().mapToInt(Integer::intValue).toArray(); // Convert back to int array
    }

    public boolean isSorted(int[] array) {

        if (array.length <= 1) {
            return true;
        }
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] < array[i]) {
                return false;
            }
        }
        return true;
    }

    public int[] reverseArray(int[] array) {


        if (array.length <= 1) {
            return array;
        }

        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            start++;
            end--;
        }
        return array;
    }
}
