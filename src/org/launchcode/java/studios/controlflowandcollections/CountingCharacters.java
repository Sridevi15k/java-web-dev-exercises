package org.launchcode.java.studios.controlflowandcollections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {
    public static void main(String[] args) {
        HashMap<Character, Integer> characterCount = new HashMap<>();
        String sentence = "If the product of two terms is zero then common sense " +
                "says at least one of the two terms has to be zero to start with. " +
                "So if you move all the terms over to one side, you can put the " +
                "quadratics into a form that can be factored allowing that side " +
                "of the equation to equal zero. Once you've done that, it's pretty" +
                "straightforward from there.";
        //int count = 0;
        char[] charactersInString = sentence.toUpperCase().replace(" ", "")
                .replace(".", "")
                .replace("'", "")
                .replace(",", "")
                .toCharArray();

        for (char character : charactersInString) {
            if (characterCount.containsKey(character)) {
                characterCount.put(character, characterCount.get(character) + 1);
            } else {
                characterCount.put(character, 1);
            }
        }

        System.out.println("letter : count");
        for (Map.Entry<Character, Integer> character : characterCount.entrySet()) {
            System.out.println(character.getKey() + " : " + character.getValue());

        }
    }
}
