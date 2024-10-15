package org.example;

public class GetRightmostDigit {

    public static void main(String[] args) {
        GetRightmostDigit getRightmostDigit = new GetRightmostDigit();
        System.out.println(getRightmostDigit.rightmostDigit("hi how 4 are you 6 dsds"));
    }

    public int rightmostDigit(String str) {

        if (str.isEmpty()) {
            return -1;
        }
        for (int i = str.length() - 1; i >= 0; i--) {

            char isChar = str.charAt(i);

            if (Character.isDigit(isChar)) {
                int s = Character.getNumericValue(isChar);
                return s;
            }
        }
        return -1;
    }
}
