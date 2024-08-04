package org.example;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

       boolean ana =  isAnagram("anagram","gramana");

        System.out.println(ana);
    }

    public static boolean isAnagram(String s, String t) {

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        return Arrays.equals(sArray,tArray);
    }
}
