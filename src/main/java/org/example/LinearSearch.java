package org.example;

public class LinearSearch {

    public static int search(int arr[] ,int N, int x) {

        for (int i = 0; i < N; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int arr[] = {1,2,33,22,44,55};

        int x = 22;
        int result = search(arr,arr.length,x);

        if (result==-1){
            System.out.println("element not found");
        }
        else {
            System.out.println("element found at index "+result);
        }

    }
}
