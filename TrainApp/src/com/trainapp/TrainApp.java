package com.trainapp;

import java.util.*;
import java.util.regex.*;

/**
 * MAIN CLASS - UC11TrainApp
 *
 * UC11 : Validate Train ID and Cargo Code
 *
 * Description:
 * This class validates input formats using Regular Expressions.
 *
 * At this stage, the application:
 * - Accepts Train ID input
 * - Accepts Cargo Code input
 * - Applies regex validation
 * - Displays validation result
 *
 * This maps format validation logic using Pattern matching.
 *
 * @author TulseeAgrawal
 * @version 11.0
 */
public class TrainApp {

    private static final Pattern TrainID_Pattern = Pattern.compile("^TRN-\\d{4}$");
    private static final Pattern CargoCode_Pattern = Pattern.compile("^[A-Z]{3}-[A-Z]{2}$");

    public static void main(String[] args) {

        System.out.println("====== UC11 - Validate Train ID and Cargo Code ======\n");
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Enter Train ID (Format: TRN-1234): ");
        String trainId = scanner.nextLine();

        System.out.print("Enter Cargo Code (Format: PET-AB): ");
        String cargoCode = scanner.nextLine();

        boolean trainValid = isValidTrainId(trainId);
        boolean cargoValid = isValidCargoCode(cargoCode);
     
        System.out.println("\nValidation Results:");
        System.out.println("Train ID Valid  : " + trainValid);
        System.out.println("Cargo Code Valid: " + cargoValid);

        System.out.println("\nUC11 validation completed...");
        scanner.close();
    }
    private static boolean isValidTrainId(String input) {
        if (input == null) return false;
        Matcher m = TrainID_Pattern.matcher(input.trim());
        return m.matches();
    }

    private static boolean isValidCargoCode(String input) {
        if (input == null) return false;
        Matcher m = CargoCode_Pattern.matcher(input.trim());
        return m.matches();
    }
}