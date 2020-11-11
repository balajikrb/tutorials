package com.balaji.tutorials;

import java.util.ArrayList;
import java.util.List;

public class InternalIteration {
	
	public static void main(String[] args) {
		
		List<Vehicle> vehicles = new ArrayList<Vehicle>();
		vehicles.add(new Vehicle("Audi","A1"));
		vehicles.add(new Vehicle("Audi","A2"));
		vehicles.add(new Vehicle("Audi","A6"));
		vehicles.add(new Vehicle("Audi","Q8"));
		vehicles.add(new Vehicle("Mercedes","X1"));
		vehicles.add(new Vehicle("Mercedes","A Class"));
		vehicles.add(new Vehicle("Jaquar","XF"));
		vehicles.add(new Vehicle("Jaquar","F-Type"));
		
		// Internal Iteration
		vehicles.
		parallelStream().
		filter(model -> model.getModel().startsWith("A")).
		filter(model -> model.getManufacturer().startsWith("A")).
		forEach(System.out::println);
	}
}
