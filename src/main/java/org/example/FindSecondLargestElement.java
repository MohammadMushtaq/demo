package org.example;

public class FindSecondLargestElement {

    public static void main(String[] args) {
        FindSecondLargestElement f = new FindSecondLargestElement();
        System.out.println(f.findSecondLargestElement(new int[]{1, 2, 3, 4, 5}));
    }

    public int findSecondLargestElement(int[] array) {

        /*this belo is to test largest number in array*/
//        int number = Integer.MIN_VALUE;
//        for (int element : array) {
//            if (element > number) {
//                number = element;
//
//            }
//        }
//        return number;

        int largestElement = Integer.MIN_VALUE;
        int secondLargestElement = Integer.MIN_VALUE;
        for (int value : array) {
            if (value > largestElement) {
                // secondLargestElement = largestElement;
                largestElement = value;
            } else if (value > secondLargestElement && value != largestElement) {
                secondLargestElement = value;
            }
        }
        if (secondLargestElement == Integer.MIN_VALUE) {
            return -1;
        }
        return secondLargestElement;

    }
}
