package com.techbeesolutions.stringmanipulation;

public class Palindrome {

    static boolean palindromeCheck(String input) {

        System.out.println("Palindrome: "+ input);

        for (int i = 0; i<input.length(); i++) {
            if (input.charAt(i) == input.charAt(input.length()-1-i)) {
            }
            else {
                System.out.println("False");
                return false;
            }

        }

        System.out.println("True");
        return true;
    }

    public static void main(String[] args){
        palindromeCheck("gog");
        palindromeCheck("agg");
    }
}
