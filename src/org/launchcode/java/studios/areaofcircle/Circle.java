package org.launchcode.java.studios.areaofcircle;

public class Circle {
    public static Double getArea(Double radius) {
        if (!(radius >= 0) ) {
            System.err.println("ERROR!");
        }
        else {
            return 3.14 * radius * radius;
        }
        return radius;
    }

}
