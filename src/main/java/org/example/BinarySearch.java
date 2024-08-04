    package org.example;

    public class BinarySearch {

        public static int binarySearch(int arr[], int x) {

            int l = 0;
            int r = arr.length-1;  // Incorrectly set to one past the last valid index

            while (l <= r) {

                int m = l + (r - l) / 2;

                if (arr[m] == x)
                    return m;

                if (arr[m] < x)
                    l = m + 1;
                else
                    r = m - 1;
            }

            return -1;
        }

        public static void main(String[] args) {

            int arr[] = {93, 94, 95, 96, 97, 98, 99, 100, 101, 102};

            int x = 94;
            int result = binarySearch(arr, x);

            if (result == -1) {
                System.out.println("element is not present");
            } else {
                System.out.println("element present at index " + result);
            }
        }
    }
