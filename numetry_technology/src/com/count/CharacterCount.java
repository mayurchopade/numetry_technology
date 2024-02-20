package com.count;

public class CharacterCount {
    public static void main(String[] args) {
        String inputString = "Hello! My Name Is Mayur. 123 how are you ?";
        countCharacters(inputString);
    }

    public static void countCharacters(String inputString) {
        int alphabets = 0;
        int digits = 0;
        int specialSymbols = 0;

        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
            if (Character.isLetter(ch)) {
                alphabets++;
            } else if (Character.isDigit(ch)) {
                digits++;       
            } else if (!Character.isSpace(ch)){
                specialSymbols++;
            }
        }

        System.out.println("Alphabets: " + alphabets);
        System.out.println("Digits: " + digits);
        System.out.println("Special Symbols: " + specialSymbols);
    }
}
