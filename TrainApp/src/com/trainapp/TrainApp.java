package com.trainapp;
/**
 * MAIN CLASS-UC4TrainApp
 * 
 * UC4 : Maintain Ordered Bogie Consist
 * 
 * Description:
 * This class models the physical chaining of train bogies 
 * using LinkedList for ordered operations.
 * 
 * At this stage, the application:
 * - Adds bogies in sequence
 * - Inserts bogies at specific position
 * - Removes bogies from front and rear
 * - Displays updated train structure
 * 
 * This maps positional operations using LinkedList.
 * 
 * @author Tulsee Agrawal
 * @version 4.0
 */
import java.util.*;
public class TrainApp {
	public static void main(String[] args) {
		System.out.println("==== UC4 - Maintain Ordered Bogie Consist ====");
		
		// Create a LinkedList
		// LinkedList maintains inserstion order and allows fast inserts
		List<String> trainConsist = new LinkedList<>();
		
		//adding 
		trainConsist.add("Engine");
		trainConsist.add("Sleeper");
		trainConsist.add("AC");
		trainConsist.add("Cargo");
		trainConsist.add("Guard");
		
		System.out.println("\nInitial Train Consist : ");
		System.out.println(trainConsist);
		
		//inserting at position 2
		trainConsist.add(2,"Pantry Car");
		System.out.println("\n After Inserting 'Pantry Car' at position 2: ");
		System.out.println(trainConsist);
		
		//removing from first and last 
		trainConsist.removeFirst();
		trainConsist.removeLast();
		
		System.out.println("\n After removing first and last bogie: \n "+trainConsist);
		System.out.println("\nUC4 ordered consist operations completed...");
		
		
	}

}
