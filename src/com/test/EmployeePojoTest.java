package com.test;

/*
 * This Program will have Interface Calculator.
 * @author ank
 */

public class EmployeePojoTest {

	private String name;
	private int employee_id;
	private String address;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the employee_id
	 */
	public int getEmployee_id() {
		return employee_id;
	}

	/**
	 * @param employee_id
	 *            the employee_id to set
	 */
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	public static void main(String[] args) {

		EmployeePojoTest emp = new EmployeePojoTest();
		// Setting values
		emp.setName("Ankita");
		emp.setEmployee_id(101);
		emp.setAddress("Texas");
		// Retrieving values
		String name = emp.getName();
		int empId = emp.getEmployee_id();
		String address = emp.getAddress();
		System.out.println("Employee Details : " + name + " ," + empId + " ," + address);

	}

}
