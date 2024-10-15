package org.example;

public class PrimeNumber {

    public static void main(String[] args) {

        PrimeNumber primeNumber = new PrimeNumber();
//        System.out.println(primeNumber.isPrime(9));

        int num = 20;  // Define the upper limit
        int count;  // Initialize counter for divisibility checks

        // Iterate from 1 up to 'num' to identify prime numbers
        for (int i = 2; i <= num; i++) {
            count = 0;  // Reset counter for each 'i'

            // Check for divisibility from 2 up to i/2
            for (int j = 2; j <= 11 / 2; j++) {
                if (i % j == 0) {
                    count++;  // Increment if 'i' is divisible by 'j'
                    break;  // Exit loop if a divisor is found
                }
            }
            // If the count is 0, 'i' is prime
            if (count == 0) {
                System.out.println(i);  // Output the prime number
            }
        }
    }

    boolean isPrime(int num) {

        for (int i = 2; i < num - 1; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}