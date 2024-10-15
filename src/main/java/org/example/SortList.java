package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortList {

    public static void main(String[] args) {

        List<Integer> number = List.of(44, 33, 55, 22, 79);

        ArrayList<Integer> integers = new ArrayList<>(number);
        Collections.sort(integers);
        System.out.println(integers);

        
    }
}
