package com.trainapp;
/**
 * MAIN CLASS-UC6TrainApp
 * 
 * UC6: Map Bogie to Capacity (HashMap)
 * 
 * Description:
 * This class associates each bogie with its seating or
 * load capacity using a key-value mapping structure.
 * 
 * At this stage, the application:
 * - Creates a HashMap for bogie-capacity mapping
 * - Inserts capacity values for each bogie
 * - Iterates through map entries
 * - Displays bogie and capacity information.
 * 
 * This maps lookup-based access using HashMap.
 * 
 * @author TulseeAgrawal
 * @version 6.0
 */
import java.util.*;
public class TrainApp {
	public static void main(String[] args) {
		System.out.println("==== UC6 - Map Bogie to Capacity (HashMap) ====");
		
		Map<String,Integer> capacityMap= new HashMap<>();
		
		capacityMap.put("First Class",24);
		capacityMap.put("Cargo",120);
		capacityMap.put("Sleeper",72);
		capacityMap.put("AC Chair",56);
		System.out.println("\n Boogie Capacity Details : ");
		for(Map.Entry<String, Integer> e : capacityMap.entrySet()) {
			System.out.println(e.getKey()+" -> "+e.getValue());
			
		}

		System.out.println("\n UC6 bogie-capacity mapping completed... ");
		
	}

}
