package com.techbeesolutions.stringmanipulation;

public class Consonant {


    public static void main(String[] args) {
        String sentence = "Ask User to enter a sentence or create a String variable to assign a sentence to it";
        System.out.println(sentence);
        int count = 0;
        for(int i = 0; i<sentence.length();i++) {
            char x = sentence.charAt(i);
            if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u' || x == ' ') {
            } else {
                sentence = sentence.replace(sentence.charAt(i), '*');
                count++;

            }
        }
        System.out.println(sentence);
        System.out.println("Counted Consonants: "+ count);
    }

}
