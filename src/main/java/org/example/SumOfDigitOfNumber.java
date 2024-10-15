package org.example;

public class SumOfDigitOfNumber {

    public static void main(String[] args) {
        SumOfDigitOfNumber sumOfDigitOfNumber = new SumOfDigitOfNumber();
        int a = sumOfDigitOfNumber.getSumOfDigits(12345);
        System.out.println(a);
    }

    public int getSumOfDigits(int number) {
        if (number < 0) {
            return -1;
        }
        if (number == 0) {
            return 0;
        }

        int temp = 0;
        while (number > 0) {
            int digit = number % 10;
            temp = digit + temp;
            number = number / 10;
        }

        return temp;
    }
}
