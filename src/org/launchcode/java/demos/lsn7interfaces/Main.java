package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        List<Topping> toppings = menu.getToppings();
        //Comparator comparator = new FlavorComparator();
        //flavors.sort(comparator);

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field.
        System.out.println("Order of flavor names before sorting.");
        for(Flavor flavor : flavors) {
            System.out.println(flavor.getName());
        }
        System.out.println("----------------------------------------");
        System.out.println("Order of flavor names after sorting.");
        flavors.sort(new FlavorComparator());
        for(Flavor flavor : flavors){
            System.out.println(flavor.getName());
        }
        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field.
        System.out.println("-----------------------------------------");
        System.out.println("Order of cone cost before sorting.");
        for(Cone cone : cones) {
            System.out.println(cone.getName() + ": " + "$ " + cone.getCost());
        }
        System.out.println("------------------------------------------");
        System.out.println("Sorting cones in increasing order by cost.");
        cones.sort(new ConeComparator());
        for(Cone cone : cones) {
            System.out.println(cone.getName() + ": " + "$ " + cone.getCost());
        }
        //TODO Bonus: Create a Topping class and sort them by the 'number of allergens' in each topping.
        System.out.println("-------------------------------------------");
        System.out.println("Order of number of allergens before sorting");
        for(Topping topping : toppings) {
            System.out.println(topping.getName() + ": " + topping.getAllergens().size() + " " + topping.getAllergens());
        }
        System.out.println("---------------------------------------");
        System.out.println("Order of number of allergens after sorting");
        toppings.sort(new ToppingComparator());
        for(Topping topping : toppings) {
            System.out.println(topping.getName() + ": " + topping.getAllergens().size() + " " + topping.getAllergens());
        }


    }
}
