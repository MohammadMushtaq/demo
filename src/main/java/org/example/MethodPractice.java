package org.example;

public class MethodPractice {

    public static void main(String[] args) {

        System.out.println(threeNum(1,2,3));

        System.out.println(threeAngle(60,60));
    }

    static int threeNum(int a, int b, int c){
        return  a+b+c;
    }

    static int threeAngle(int angle1,int angle2){
        return 180-(angle1+angle2);
    }
}
