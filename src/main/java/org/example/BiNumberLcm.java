package org.example;

public class BiNumberLcm {

    private int number1;
    private int number2;


    public BiNumberLcm(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public static void main(String[] args) {
        BiNumberLcm biNumber = new BiNumberLcm(5, 10);
        System.out.println(biNumber.calculateLCM());
    }

    public int getNumber1() {
        return number1;
    }

    public int getNumber2() {
        return number2;
    }

    public int calculateLCM() {
        if (number1 < 0 || number2 < 0) {
            return -1;
        }
        if (number1 == 0 || number2 == 0) {
            return 0;
        }

        int max = Math.max(number1, number2);
        int lcm = max;
        while (true) {
            boolean isLcm = lcm % number1 == 0 && lcm % number2 == 0;

            if (isLcm) {
                return lcm;
            }
            lcm = lcm + max;
        }
    }
}