package com.trainapp;
/**
 * MAIN CLASS - UC9TrainApp
 *
 * UC9 : Group Bogies by Type (groupingBy)
 *
 * Description:
 * This class groups similar bogies together using
 * Java Stream Collectors.groupingBy().
 *
 * At this stage, the application:
 * - Creates a list of bogies
 * - Streams the list
 * - Groups bogies by name
 * - Stores grouped data in a Map
 * - Displays grouped structure
 *
 * This maps classification logic using groupingBy.
 *
 * @author TulseeAgrawal
 * @version 9.0
 */
import java.util.*;
import java.util.stream.*;

public class TrainApp {

    // Reusing Bogie model from UC7/UC8
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("======UC9 - Group Bogies by Type====== ");
        // Create list of bogies (includes repeated types)
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Sleeper", 70));
        bogies.add(new Bogie("AC Chair", 60));

        // Display input bogies
        System.out.println("\nAll Bogies:");
        for (Bogie b : bogies) {
            System.out.println(b.name + " -> " + b.capacity);
        }

        // USING COLLECTORS.GROUPINGBY
        Map<String, List<Bogie>> groupedBogies = bogies.stream()
                .collect(Collectors.groupingBy(b -> b.name));

        // Display grouped structure
        System.out.println("\nGrouped Bogies:");
        for (Map.Entry<String, List<Bogie>> entry : groupedBogies.entrySet()) {
            List<Bogie> list = entry.getValue();

            System.out.println("\nBogie Type: " + entry.getKey());
            for (Bogie b : list) {
                System.out.println("  Capacity -> " + b.capacity);
            }
        }

        System.out.println("\nUC9 grouping completed...");
    }
}