package org.example;

public class ReverseSentence {

    public static void main(String[] args) {
        String sentence = reverseWordsInSentence("hello my name is mushtaq");
        System.out.println(sentence);
    }

    public static String reverseWordsInSentence(String sentence) {

        if (sentence == null) {
            return "INVALID";
        }
        if (sentence.equals("")) {
            return "";
        }

        StringBuilder reversedString = new StringBuilder();

        for (String word : sentence.split(" ")) {
            StringBuilder reversedWord = new StringBuilder(word).reverse();
            reversedString.append(reversedWord).append(" ");
        }

        return reversedString.toString().trim();
    }

}
