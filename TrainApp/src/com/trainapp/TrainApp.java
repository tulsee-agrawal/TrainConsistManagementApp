package com.trainapp;

/**
 * MAIN CLASS - UC20TrainApp
 *
 * Use Case 20: Exception Handling During Search Operations
 *
 * Description:
 * Prevents searching when no bogies exist by applying
 * fail-fast validation using a runtime exception.
 *
 * At this stage, the application:
 * - Creates bogie collection
 * - Validates system state
 * - Throws exception if empty
 * - Stops invalid search operation
 * - Displays meaningful message
 *
 * This maps defensive programming using runtime exceptions.
 *
 * @author TulseeAgrawal
 * @version 20.0
 */
public class TrainApp {

    public static void main(String[] args) {
        System.out.println(" UC20 - Exception Handling During Search");


        String[] bogieIds = {};  //empty - failfast

        // Search key
        String searchId = "BG101";

        // FAIL-FAST VALIDATION
        if (bogieIds.length == 0) {
            throw new IllegalStateException("No bogies available in train. Cannot perform search.");
        }

        //SEARCH LOGIC 
        boolean found = false;
        for (String id : bogieIds) {
            if (id.equals(searchId)) {
                found = true;
                break;
            }
        }

        
        if (found) {
            System.out.println("Bogie " + searchId + " found in train consist.");
        } else {
            System.out.println("Bogie " + searchId + " not found in train consist.");
        }

        System.out.println("\nUC20 execution completed...");
    }
}