package com.trainapp;
/**
 * MAIN CLASS-UC5TrainApp
 * 
 * UC5: Preserve Insertion Order of Bogies
 * 
 * Description:
 * This class maintains the exact attachment order of bogies
 * while also preventing duplicate entries using LinkedHashSet.
 * 
 * At this stage, the application:
 * - Attaches bogies in order
 * - Preserves insertion in order
 * - Avoids duplicate bogies
 * - Displays final train structure
 * 
 * This maps ordered uniqueness using LinkedHashset.
 * 
 * @author TulseeAgrawal
 * @version 5.0
 */
import java.util.*;
public class TrainApp {
	public static void main(String[] args) {
		System.out.println("==== UC5 - Preserve Insertion Order Of Bogies ====");
		
		// LinkedHashSet preserves order and ensures uniqueness
		Set<String> formation = new LinkedHashSet<>();
		
		// Add bogies
		formation.add("Engine");
		formation.add("Sleeper");
		formation.add("Cargo");
		formation.add("Guard");
		
		// Duplicate entries
		formation.add("Engine"); //duplicate
		formation.add("Guard"); //duplicate
		
		System.out.println("\n Final Train Formation : \n"+formation);
		
		System.out.println("\n Note: \n LinkedHashSet preserves insertion order and removes duplicates automatically.");
		System.out.println("\n UC5 formation setup completed...");
		
	}

}
