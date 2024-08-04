package org.example;

public class BinarySearch {

    public static int binarySearch(int arr[],int x){

        int l=0;
        int r = arr.length-1;

        while (l<=r){

            int m = l +(r-l)/2;

            if(arr[m]== x)
                return m;

            if(arr[m]<x)
                l=m+1;

           else l=m-1;
            }

        return -1;
    }

    public static void main(String[] args) {

        int arr[] = {93,94,95,96,97,98,99,100,101,102};

        int x= 95;
        int result = binarySearch(arr,x);

        if(result==-1){
            System.out.println("element is not present ");
        }else{
            System.out.println("element present "+result);
        }
    }
}
