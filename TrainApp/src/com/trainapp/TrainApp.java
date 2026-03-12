package com.trainapp;

/**
 * MAIN CLASS - UC14TrainApp
 *
 * UC14 : Handle Invalid Bogie Capacity (Custom Exception)
 *
 * Description:
 * Prevents creation of passenger bogies with invalid seating capacity
 * using a custom checked exception.
 *
 * At this stage, the application:
 * - Defines a custom exception
 * - Validates capacity inside constructor
 * - Throws exception if capacity <= 0
 * - Prevents invalid bogie creation
 * - Continues execution safely
 *
 * This maps fail-fast validation using checked exceptions.
 *
 * @author TulseeAgrawal
 * @version 14.0
 */
public class TrainApp {

    // ---- CUSTOM EXCEPTION ----
    static class InvalidCapacityException extends Exception {
        public InvalidCapacityException(String message) { super(message); }
    }

    // ---- Passenger Bogie model with validation ----
    static class PassengerBogie {
        String type;
        int capacity;

        public PassengerBogie(String type, int capacity) throws InvalidCapacityException {
            if (capacity <= 0) {
                throw new InvalidCapacityException("Capacity must be greater than zero");
            }
            this.type = type;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return type + " -> " + capacity;
        }
    }

    public static void main(String[] args) {
        System.out.println("UC14 - Handle Invalid Bogie Capacity");

        try {
            // Valid bogie
            PassengerBogie b1 = new PassengerBogie("Sleeper", 72);
            System.out.println("\nCreated Bogie: " + b1);

            // Invalid bogie 
            PassengerBogie b2 = new PassengerBogie("AC Chair", 0);
            System.out.println("\nCreated Bogie: " + b2);

        } catch (InvalidCapacityException e) {
            System.out.println("\nError: " + e.getMessage());
        }

        System.out.println("\nUC14 exception handling completed...");
    }
}
