package com.trainapp;
/**
 * MAIN CLASS-UC2TrainApp
 * 
 * UC2 : Add Passenger Bogies to Train
 * 
 * Description:
 * This class demonstrates how passenger bogies can be
 * managed dynamically using ArrayList operations.
 * 
 * At this stage, the application:
 * - Adds new bogies to the train
 * - Removes existing bogies
 * - Checks for bogie availability
 * - Displays the final consist 
 * 
 * This maps CRUD operations using ArrayList.
 * 
 * @author Tulsee Agrawal
 * @version 2.0
 */
import java.util.*;
public class TrainApp {
	public static void main(String[] args) {
		System.out.println("==== UC2 - Add Passenger Bogies to Train ====");
		
		//create arraylist to hold passenger bogies
		List<String> passengerBogies = new ArrayList<>();
		
		//create Add bogies
		// add() attaches a new bogie to the train
		passengerBogies.add("Sleeper");
		passengerBogies.add("AC Chair");
		passengerBogies.add("First Class");
		System.out.println("\nAfter Adding Bogies: ");
		System.out.println("Passenger Bogies : "+ passengerBogies);
		
		//removing bogies
		//remove() removes a bogie
		passengerBogies.remove("AC Chair");
		System.out.println("\nAfter Removing 'AC Chair' : ");
		System.out.println("Passenger Bogies : "+ passengerBogies);
		
		//contains() check if it is present in the list
		System.out.println("\nChecking if 'Sleeper' exists : ");
		System.out.println("Contains Sleeper ? : "+passengerBogies.contains("Sleeper"));
		
		System.out.println("\nFinal Train Passenger Consist: ");
		System.out.println(passengerBogies);
		
		System.out.println("\nUC2 operations completed successfully...");
		
		
	}

}
