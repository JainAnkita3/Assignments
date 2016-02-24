package com.test.sessions;

/**
 * This class will sort the Students by ID
 * 
 * @author rinkeshshah
 *
 */
public class SortStudentByID implements Comparable<SortStudentByID> {

	private int id;
	private String name;
	private int age;

	public SortStudentByID(int id, String name, int age) {

	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

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
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(SortStudentByID o) {
		if (this.id < o.id)
			return -1;
		else if (this.id > o.id) {
			return 1;
		}
		return 0;
	}

	
	public toString (){
		return "--> Name : " +name +"age " +age +"id " +id;
		
	}
}
