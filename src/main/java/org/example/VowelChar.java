package org.example;

public class VowelChar {

    char[] vowelChar = {'a', 'e', 'i', 'o', 'u'};

    public static void main(String[] args) {

        VowelChar v = new VowelChar();
        if (v.checkVowel('a')) {
            System.out.println("it is a vowel");
        } else {
            System.out.println("not a vowel");
        }

    }

    public boolean checkVowel(char a) {
        for (char vowel : vowelChar) {
            if (vowel == a) {
                return true;
            }
        }

        for (int i = 0; i < vowelChar.length; i++) {
            if (vowelChar[i] == a) {
                return true;
            }
        }
        return false;
    }

}
