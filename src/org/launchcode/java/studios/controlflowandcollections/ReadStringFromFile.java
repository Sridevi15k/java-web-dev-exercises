package org.launchcode.java.studios.controlflowandcollections;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadStringFromFile {
    public static void main(String[] args) throws FileNotFoundException {

        {
            File file = new File("C:\\Users\\sanka\\LaunchCode\\readfile.txt");
            Scanner line = new Scanner(file);

            while(line.hasNextLine())
            System.out.println(line.nextLine());
        }
    }
}
