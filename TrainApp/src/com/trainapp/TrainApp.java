package com.trainapp;
/**
 * MAIN CLASS-UC1TrainApp
 * 
 * UC1 : Initialize Train and Display Consist Summary
 * 
 * Description:
 * This class represents the entry point of the
 * train consist management app.
 * 
 * At this stage, the application:
 * - Creates an empty train consist
 * - Uses a dynamic list to store bogies
 * - displays initial bogie count
 * - prints the current state of the train
 * 
 * This use case introduces collection initialization
 * and basic program startup flow.
 * 
 * @author Tulsee Agrawal
 * @version 1.0
 */
import java.util.*;
public class TrainApp {
	public static void main(String[] args) {
		System.out.println("==== Train Consist Management App ====");
		List<String> trainConsist = new ArrayList<>();
		System.out.println("Train initialized successfully..");
		System.out.println("Initial Bogie Count : "+ trainConsist.size());
		System.out.println("Current Train consist : "+trainConsist);
		System.out.println("\nSystem ready for operations...");
		
	}

}
