package com.balaji.tutorials.nullpointer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Example {

	public static void main(String[] args) {
		
		SpringApplication.run(Example.class, args);
		
		System.out.println("###### Java 14 null pointer enhancement demo ######");
		System.out.println("###################################################");

		// Create an employee object without "Address" attribute
		Employee emp1 = new Employee();
		emp1.setEmpId(100);
		emp1.setEmpName("Alex");
		
		Address addr1 = new Address();
		addr1.setDoorNo("301");
//		
//		
//		Details details1 = new Details();
//		details1.setPinCode(100100);
//		details1.setStreet("Ville road");
//		addr1.setDetails(details1);
//		
//		
		emp1.setAddress(addr1);
		
		// Read a property under Address where "address" itself is null 
		System.out.println("Pincode: " + emp1.getAddress().getDetails().getPinCode());
	}
}