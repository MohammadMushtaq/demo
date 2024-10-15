package org.example;

public class calculateSumOfSquares {

    public static void main(String[] args) {
        System.out.println(num(5));
    }

    public static int num(int n) {

        if (n < 0) {
            return -1;
        }

        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum = i * i + sum;
        }
        return sum;

    }

}
