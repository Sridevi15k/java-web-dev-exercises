package org.launchcode.java.studios.controlflowandcollections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacterFromInput {
    public static void main(String[] args) {

        HashMap<Character, Integer> letterCount = new HashMap<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word: ");
        String word = input.nextLine();
        String myWord = word.toLowerCase();
        String wordWithoutSpace = myWord.replace(" ", "")
                .replace(".", "")
                .replace("'", "")
                .replace(",", "");
        char[] letterInWord = wordWithoutSpace.toCharArray();

        for (char letter : letterInWord) {
            if (letterCount.containsKey(letter)) {
                letterCount.put(letter, letterCount.get(letter) + 1);
            } else {
                letterCount.put(letter, 1);
            }
        }
        input.close();
        System.out.println("letter : count");
        for (
                Map.Entry<Character, Integer> letter : letterCount.entrySet()) {
            System.out.println(letter.getKey() + " : " + letter.getValue());

        }
    }
}
