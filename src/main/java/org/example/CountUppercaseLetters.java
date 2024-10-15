package org.example;


public class CountUppercaseLetters {

    public static void main(String[] args) {

        CountUppercaseLetters countUppercaseLetters = new CountUppercaseLetters();
        System.out.println(countUppercaseLetters.countUppercase("HELLOwiiiii"));

        System.out.println(countUppercaseLetters.hasConsecutiveDuplicates("hello"));

    }

    public int countUppercase(String str) {

        if (str == null) {
            return -1;
        }

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                count++;
            }
        }

        return count;
    }

    public boolean hasConsecutiveDuplicates(String str) {

        for (int i = 0; i < str.length() - 1; i++) {

            char currentChar = str.charAt(i);
            char nextChar = str.charAt(i + 1);
            if (currentChar == nextChar) {
                return true;
            }
        }
        return false;
    }
}
