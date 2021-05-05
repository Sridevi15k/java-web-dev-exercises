package org.launchcode.java.studios.areaofcircle;

import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of a circle: ");
        double radius = 0;
        while(radius <= 0) {
            try {
                radius = input.nextDouble();
            } catch (Exception e) {
                input.next();
            }
        }
        input.close();

        System.out.println("The area of the circle of radius " + radius + " is: " + Circle.getArea(radius));
    }
}
