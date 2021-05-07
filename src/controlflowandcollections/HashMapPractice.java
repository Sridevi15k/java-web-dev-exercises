package controlflowandcollections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        int newStudentId;
        String newStudent = null;
        System.out.println("Enter student ID: (or ENTER to finish): ");

        do {
            newStudent = null;
            System.out.print("ID: ");
            newStudentId = input.nextInt();

            if (!students.containsKey(newStudentId)) {
                System.out.print("Student Name: ");
                input.nextLine();
                newStudent = input.nextLine();
                students.put(newStudentId, newStudent);
            }
        } while (newStudent != null);

        System.out.println("\n Class roster: ");
        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getKey() + " (" + student.getValue() + ")");

        }


        System.out.println("Student ID: " + newStudentId);
        System.out.println("Student name: " + newStudent);

    }
}
