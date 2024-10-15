package org.example;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        boolean ana = isAnagram("anagram", "gramana");

        System.out.println(ana);

        boolean sil = areAnagrams("silent", "listen");
        System.out.println(sil);

    }

    public static boolean isAnagram(String s, String t) {

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        return Arrays.equals(sArray, tArray);
    }

    public static boolean areAnagrams(String str1, String str2) {

        if (str1 != null && str2 != null) {
            if (str1.length() == str2.length()) {
                String lowerStr1 = str1.toLowerCase();
                String lowerStr2 = str2.toLowerCase();
                char[] s1 = lowerStr1.toCharArray();
                char[] s2 = lowerStr2.toCharArray();

                Arrays.sort(s1);
                Arrays.sort(s2);
                return Arrays.equals(s1, s2);
            }
        }
        return false;
    }
}
