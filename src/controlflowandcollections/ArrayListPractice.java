package controlflowandcollections;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        evenNumbers.add(1);
        evenNumbers.add(2);
        evenNumbers.add(3);
        evenNumbers.add(4);
        evenNumbers.add(5);
        evenNumbers.add(6);
        evenNumbers.add(7);
        evenNumbers.add(8);
        evenNumbers.add(9);
        evenNumbers.add(10);

        int sum = 0;
        for (Integer evenNumber : evenNumbers) {
            if (evenNumber % 2 == 0) {
                sum += evenNumber;

            }
        }
             System.out.println(sum);
        }
    }

