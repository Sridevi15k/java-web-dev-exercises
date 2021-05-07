package controlflowandcollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayListPracticeString {
    public static void main(String[] args) {
        String sentence = "I would not, could not, in a box. " +
                "I would not, could not with a fox. " +
                "I will not eat them in a house. " +
                "I will not eat them with a mouse.";
        List<String> wordFromArray = new ArrayList<String>(Arrays.asList(sentence.split(" ")));
        System.out.println(wordFromArray);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length: ");
        int length = input.nextInt();
        for (String word : wordFromArray) {
            if (word.length() == length) {
                System.out.println(word);
            }
        }
    }
    }

