package org.example;

public class ReverseDigitNumber {

    public static void main(String[] args) {

        ReverseDigitNumber reverseDigitNumber = new ReverseDigitNumber();
        System.out.println(reverseDigitNumber.reverseNumber(123456));

    }

    public int reverseNumber(int number) {

        if (number < 0) {
            return -1;
        }
        if (number == 0) {
            return 0;
        }
        int temp = 0;
        while (number > 0) {
            int digit = number % 10;
            temp = temp * 10 + digit;
            number = number / 10;
        }

        return temp;
    }
}
