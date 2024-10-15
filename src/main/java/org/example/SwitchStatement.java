package org.example;

public class SwitchStatement {

    public static void main(String[] args) {
        System.out.println(isWeekDay(3));

    }

    public static boolean isWeekDay(int day) {

        boolean result = false;
        switch (day) {
            case 0:
            case 6:
                return false;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return true;

        }
        return false;
    }

}
