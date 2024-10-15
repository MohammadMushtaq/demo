package org.example;

public class PrintWeekdays {

    public static void main(String[] args) {

        String[] weekdays = {"sunday", "monday", "tuesday", "wednesday", "thrusday", "friday", "saturday"};

        String daywithMostChar = "";
        for (String days : weekdays) {
            if (days.length() > daywithMostChar.length()) {
                daywithMostChar = days;
            }
            System.out.print(days);
        }
        System.out.println();
        System.out.println(daywithMostChar);
        System.out.println();

//-------------------------------------------------------------
        for (int i = 0; i < weekdays.length; i++) {
            System.out.println(weekdays[i]);
        }
//---------------------------------------------------
        System.out.println();

        for (int i = weekdays.length - 1; i >= 0; i--) {
            System.out.println(weekdays[i]);
        }
        System.out.println();
//-------------------------------------------------------------
        String sentence = "hi howw arewww youwwww";

        String[] arrWord = sentence.split("");
        for (String a : arrWord) {
            System.out.print(a);
        }
        System.out.println();
//---------------------------------------------------------------------
        String sent = "A quick brown fox jumps over the lazy dog elephant";

        String[] words = sent.split(" ");


        String longestWord = "";
        int maxLength = 0;

        for (String word : words) {
            if (word.length() > maxLength) {
                longestWord = word;
                maxLength = word.length();
            }
        }
        System.out.println(longestWord);
    }
}
