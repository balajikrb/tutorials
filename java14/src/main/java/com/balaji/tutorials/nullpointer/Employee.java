package com.balaji.tutorials.nullpointer;

/**
 * @author Balaji K Ravindran
 * 
 * Employee POJO
 */
public class Employee {
	private String empName;
	private Integer empId;
	private Address address;
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
}