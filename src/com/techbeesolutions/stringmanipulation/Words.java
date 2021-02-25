package com.techbeesolutions.stringmanipulation;

import sun.management.Sensor;

public class Words {

    public static void main(String[] args) {
        String sentence = "Ask User to enter a sentence or create a String variable to assign a sentence to it";
        String[] words = sentence.split(" ");
        int count = 0;

        for (String word:words){
            count++;
        }

        System.out.println("Counted Words: "+ count);
    }
}
