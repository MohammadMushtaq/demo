package org.example;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        boolean ana = isAnagram("anagram", "gramana");

        System.out.println(ana);

        boolean sil = areAnagrams("silent", "listen");
        System.out.println(sil);

/*        String abcd = "AAABCDFRA";

        String a = abcd.substring(0, 2);
        String b = abcd.substring(2);
        System.out.println(a);
        System.out.println(b);

        String a1 = abcd.replaceAll("A", "") + b;
        String a2 = abcd.replace("A", "") + b;
        System.out.println(a1);
        System.out.println(a2);*/

   /*     int arr[] = {12, 23, 4};
        for (int i = 0; i < 1000; i++) {   //4
            arr[0] = i;                   //[4 4 23] // [5,4,23]
            Arrays.sort(arr);             //[4,4,23] // []
            System.out.println(Arrays.toString(arr));}*/

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
