package com.trainapp;
/**
 * MAIN CLASS - UC7TrainApp
 * 
 * UC7 : Sort Bogies by Capacity (Comparator)
 * 
 * Description:
 * This class sorts passenger bogies based on seating
 * capacity using a custom Comparator.
 * 
 * At this stage, the application:
 * - Creates bogie objects
 * - Stores them in a List
 * - Displays unsorted data
 * - Sorts using Comparator logic
 * - Displays sorted result
 * 
 * This maps custom ordering using Comparator.
 * 
 * @author TulseeAgrawal
 * @version 7.0
 */
import java.util.*;

public class TrainApp {

    // Inner Bogie class to model passenger bogies
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {

       
        System.out.println("======UC7 - Sort Bogies by Capacity (Comparator)====== ");

        // Create list of passenger bogies
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("General", 90));

        // Before sorting
        System.out.println("\nBefore Sorting:");
        for (Bogie b : bogies) {
            System.out.println(b.name + " -> " + b.capacity);
        }

        // Sort using Comparator
        bogies.sort((b1, b2) -> Integer.compare(b1.capacity, b2.capacity));

        // After sorting
        System.out.println("\nAfter Sorting by Capacity:");
        for (Bogie b : bogies) {
            System.out.println(b.name + " -> " + b.capacity);
        }

        System.out.println("\nUC7 sorting completed...");
    }
}