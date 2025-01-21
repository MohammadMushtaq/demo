package org.example;

public class BinarySearch {

    public static int binarySearch(int arr[], int target) {

        int low = 0, high = arr.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;   //10, 20, 30, 40, 50, 60, 70, 80, 90, 100

            if (arr[mid] == target) {
                return mid;            // Target found
            }

            if (arr[mid] < target) {
                low = mid + 1;          // Search right
            } else {
                high = mid - 1;         // Search left
            }
        }

        return -1;  // Target not found
    }

    public static void main(String[] args) {

        int arrOfMarks[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        int marks = 75;
        int result = binarySearch(arrOfMarks, marks);

        if (result == -1) {
            System.out.println("element is not present");
        } else {
            System.out.println("element present at index " + result + " target " + marks);
        }
    }
}