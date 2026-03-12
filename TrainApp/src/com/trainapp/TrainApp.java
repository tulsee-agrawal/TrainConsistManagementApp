package com.trainapp;

import java.util.ArrayList;
import java.util.List;

/**
 * MAIN CLASS - UC12TrainApp
 *
 * UC12 : Safety Compliance Check for Goods Bogies
 *
 * Description:
 * Validates goods bogie formation using Streams and allMatch().
 * Business Rule enforced:
 *   - Cylindrical -> only Petroleum allowed.
 *
 * Steps:
 * - Create goods bogie list
 * - Convert to stream()
 * - Use allMatch() with a predicate (lambda)
 * - Store boolean result
 * - Display SAFE / NOT SAFE status
 *
 * Key Concepts:
 * - Streams API
 * - allMatch() terminal operation
 * - Lambda expressions
 * - Short-circuit evaluation
 * - Business rule modeling in code
 *
 * Author: TulseeAgrawal
 * @version 12.0
 */
public class TrainApp {

    static class GoodsBogie {
        String type;   
        String cargo;  

        GoodsBogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }
    }

    public static void main(String[] args) {
        System.out.println("======UC12 - Safety Compliance Check for Goods Bogies======");

        List<GoodsBogie> goodsBogies = new ArrayList<>();
        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsBogies.add(new GoodsBogie("Open",        "Coal"));
        goodsBogies.add(new GoodsBogie("Box",         "Grain"));
        goodsBogies.add(new GoodsBogie("Cylindrical", "Coal")); //violates

        System.out.println("\nGoods Bogies in Train:");
        for (GoodsBogie gb : goodsBogies) {
            System.out.println(gb.type + " -> " + gb.cargo);
        }

        boolean isCompliant = goodsBogies.stream()
                .allMatch(gb -> {
                    String type  = gb.type  == null ? "" : gb.type.trim();
                    String cargo = gb.cargo == null ? "" : gb.cargo.trim();

                    if ("Cylindrical".equals(type)) {
                        return "Petroleum".equals(cargo);
                    }
                    else if("Open".equals(type)) {
                    	return "Coal".equals(cargo);
                    }
                    else if("Box".equals(type)) {
                    	return "Grain".equals(cargo);
                    }
                    
                    return true;
                });

        System.out.println("\nSafety Compliance Status: " + isCompliant);
        if (isCompliant) {
            System.out.println("Train formation is SAFE.");
        } else {
            System.out.println("Train formation is NOT SAFE.");
        }

        System.out.println("\nUC12 safety validation completed...");
    }
}
