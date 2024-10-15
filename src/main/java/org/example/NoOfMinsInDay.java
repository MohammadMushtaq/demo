package org.example;

public class NoOfMinsInDay {
    public static void main(String[] args) {
        int hour= 24;

        int min = 60;

        int sec = 60;

        int resultMin = hour * min;

        int resultSec = hour*min*sec;

        System.out.println("No of sec in day "+resultSec);

        System.out.println("No of min in a day "+resultMin);


    }

}
