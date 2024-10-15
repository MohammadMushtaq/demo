package org.example;

import java.util.ArrayList;
import java.util.List;

public class DetermineAllFactors {

    public static void main(String[] args) {
        DetermineAllFactors nm = new DetermineAllFactors();
        System.out.println(nm.determineAllFactors(6));  // Prints: [1, 2, 3, 6]
    }


    public List<Integer> determineAllFactors(int number) {

        List<Integer> factor = new ArrayList<>();
        if (number <= 0) {
            return factor;
        }

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {

                factor.add(i);
            }
        }
        return factor;
    }
}
