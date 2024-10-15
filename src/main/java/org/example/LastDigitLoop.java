package org.example;

public class LastDigitLoop {

    public static void main(String[] args) {
        LastDigitLoop lastDigitLoop = new LastDigitLoop();
        int R = lastDigitLoop.getLastDigit(0);
        System.out.println(R);
    }

    public int getLastDigit(int number) {
        if (number < 0) {
            return -1;
        }

        return number % 10;
    }
}
