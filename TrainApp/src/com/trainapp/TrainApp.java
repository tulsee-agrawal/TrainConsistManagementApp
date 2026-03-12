package com.trainapp;

import java.util.Arrays;

/**
 * MAIN CLASS - UC19TrainApp
 *
 * Use Case 19: Binary Search for Bogie ID
 *
 * Description:
 * This class demonstrates searching for a specific bogie ID
 * using the Binary Search algorithm on sorted data.
 *
 * At this stage, the application:
 * - Creates sorted bogie ID array
 * - Defines search key
 * - Applies binary search logic
 * - Narrows search range each iteration
 * - Displays result
 *
 * This maps optimized searching logic using divide-and-conquer.
 *
 * @author TulseeAgrawal
 * @version 19.0
 */
public class TrainApp {

    public static void main(String[] args) {
      
        System.out.println(" UC19 - Binary Search for Bogie ID");
       
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        Arrays.sort(bogieIds);

        String key = "BG309";

        System.out.println("Sorted Bogie IDs:");
        for (String id : bogieIds) {
            System.out.println(id);
        }
        System.out.println();

        int left = 0;
        int right = bogieIds.length - 1;
        boolean found = false;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int cmp = bogieIds[mid].compareTo(key);

            if (cmp == 0) {
                found = true;
                break;               
            } else if (cmp < 0) {
                left = mid + 1;      
            } else {
                right = mid - 1;    
            }
        }

        if (found) {
            System.out.println("Bogie " + key + " found using Binary Search.");
        } else {
            System.out.println("Bogie " + key + " not found using Binary Search.");
        }

        System.out.println("\nUC19 search completed...");
    }
}