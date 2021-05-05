package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter no. of miles: ");
        double miles = input.nextDouble();
        System.out.println("Enter no. of gallons: ");
        double gallons = input.nextDouble();
        input.close();

        double milespergallon = miles / gallons;
        System.out.println("You have travelled at the rate of " + milespergallon + " miles per gallon.");
    }
}
