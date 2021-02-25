package com.techbeesolutions.stringmanipulation;

public class LastLetterCount {
    public static void main(String[] args) {
        String sentence = "This is used for any tool and technology";
        int sCount = 0;
        int yCount = 0;
        boolean s = true;
        boolean y = true;
        int firstS = 0;
        int firstY = 0;
        String[] newSentence = sentence.split(" ");
        for (int i = 0; i< newSentence.length; i++){
            String word = newSentence[i];
            if(newSentence[i].charAt(word.length()-1) == 's') {
                while (s) {
                    firstS = i;
                    s = false;
                }
                sCount++;
            } else if(newSentence[i].charAt(word.length()-1) == 'y') {
                while (y) {
                    firstY = i;
                    y = false;
                }
                yCount++;
            }
        }

        String temp = newSentence[firstS];
        newSentence[firstS] = newSentence[firstY];
        newSentence[firstY] = temp;

        System.out.println(String.join(" ", newSentence));
        System.out.println(sCount);
        System.out.println(yCount);
    }
}
