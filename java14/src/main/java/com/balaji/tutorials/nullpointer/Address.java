package com.balaji.tutorials.nullpointer;

/**
 * @author Balaji K Ravindran
 * 
 * Address POJO
 */
public class Address {
	private String doorNo;
	private Details details;
	
	public String getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}
	public Details getDetails() {
		return details;
	}
	public void setDetails(Details details) {
		this.details = details;
	}
}