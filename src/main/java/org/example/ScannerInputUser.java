package org.example;

import java.util.Scanner;

public class ScannerInputUser {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entered number1 is - ");
        int number1 = scanner.nextInt();
        System.out.println("Entered number2 is - ");
        int number2 = scanner.nextInt();

        System.out.println("Choices available are");
        System.out.println("1 - Addition");
        System.out.println("2 - subtract");
        System.out.println("3 - multiply");
        System.out.println("4 - Divide");

        int choice = scanner.nextInt();

        System.out.println("selected operator is - " + choice);
        System.out.println("Number 1  - " + number1);
        System.out.println("number2 -" + number2);


        performOperationUsingSwitch(choice, number1, number2);

    }

    private static void performOperationUsingNestedIfElse(int choice, int number1, int number2) {
        if (choice == 1) {
            System.out.println("result = " + (number1 + number2));
        } else if (choice == 2) {
            System.out.println("result = " + (number1 - number2));
        } else if (choice == 3) {
            System.out.println("result = " + (number1 * number2));
        } else if (choice == 4) {
            System.out.println("result = " + (number1 / number2));
        } else {
            System.out.println("invalid operator");
        }
    }

    private static void performOperationUsingSwitch(int choice, int number1, int number2) {
        switch (choice) {
            case 1:
                System.out.println("result = " + (number1 + number2));
                break;
            case 2:
                System.out.println("result = " + (number1 - number2));
                break;
            case 3:
                System.out.println("result = " + (number1 * number2));
                break;
            case 4:
                System.out.println("result = " + (number1 / number2));
                break;
            default:
                System.out.println("invalid operator");
                break;
        }
    }
}
