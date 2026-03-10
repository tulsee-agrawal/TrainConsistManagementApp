package com.trainapp;
/**
 * MAIN CLASS-UC3TrainApp
 * 
 * UC3 : Track Unique Bogie IDs
 * 
 * Description:
 * This class ensures that duplicate bogie IDs are not
 * added into the train formation using HashSet.
 * 
 * 
 * At this stage, the application:
 * - Stores bogie IDs
 * - Prevents duplicates automatically
 * - Displays unique bogie identifier 
 * 
 * This maps uniqueness validation using Set.
 * 
 * @author Tulsee Agrawal
 * @version 3.0
 */
import java.util.*;
public class TrainApp {
	public static void main(String[] args) {
		System.out.println("==== UC3 - Track Unique Bogie IDs ====");
		
		//create a set to store unique bogie IDs
		//HashSet stores only unique values
		Set<String> bogies = new HashSet<>();
		
		//Add IDs
		//add() inserts bogie IDs into the set
		bogies.add("BG101");
		bogies.add("BG102");
		bogies.add("BG103");
		bogies.add("BG104");
		
		//Duplicate entries will be ignored internally by HashSet
		bogies.add("BG101"); //Duplicate entry
		bogies.add("BG102"); //Duplicate entry
		
		System.out.println("\nBogie IDs After Insertion: ");
		System.out.println(bogies);
		
		System.out.println("\nNote: ");
		System.out.println("Duplicates are automatically ignored by HashSet.");
		
		System.out.println("\nUC3 uniqueness validation completed...");
		
		
		
		
	}

}
