package org.example;

public class GreatestCommonDivisor {
    private int number1;
    private int number2;

    public GreatestCommonDivisor(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public static void main(String[] args) {
        GreatestCommonDivisor greatestCommonDivisor = new GreatestCommonDivisor(18, 48);
        System.out.println(greatestCommonDivisor.calculateGCD());
    }

    public int getNumber1() {
        return number1;
    }

    public int getNumber2() {
        return number2;
    }

    public int calculateGCD() {
        if (number1 < 0 || number2 < 0) {
            return 1;
        }
        if (number1 == 0 || number2 == 0) {
            return 0;
        }
        int min = Math.min(number1, number2);

        for (int i = min; i > 0; i--) {
            boolean isTwoNumDiv = number1 % i == 0 && number2 % i == 0;
            if (isTwoNumDiv) {
                return i;
            }
        }

        return -1;
    }
}
