package org.example;

import java.util.ArrayList;
import java.util.List;

public class DetermineMultiples {

    public static void main(String[] args) {

        DetermineMultiples determineMultiples = new DetermineMultiples();
        System.out.println(determineMultiples.determineMultiples(3, 20));

    }

    public List<Integer> determineMultiples(int number, int limit) {

        ArrayList<Integer> multiple = new ArrayList<>();

        if (limit <= 0 || number <= 0) {
            return multiple;
        }


        for (int i = 1; number * i < limit; i++) {
            multiple.add(number * i);
        }
        return multiple;
    }
}
