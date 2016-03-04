package com.test.jaxb;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * This class represents a Student.
 * 
 * @author ank
 */

// @XmlRootElement annotation, so Student will be the root element of the xml
@XmlRootElement
public class Student {
	private String name;
	private String rollNo;
	private String className;
	private int age;
	private int id;

	// Default constructor
	public Student() {

	}

	// Parameterised constructor
	public Student(String name, String rollNo, String className, int age, int id) {
		this.name = name;
		this.rollNo = rollNo;
		this.className = className;
		this.age = age;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	// @XmlElement annotation, so these properties will be the elements of xml.
	@XmlElement
	public void setName(String name) {
		this.name = name;
	}

	public String getClassName() {
		return className;
	}

	@XmlElement
	public void setClassName(String className) {
		this.className = className;
	}

	public String getRollNo() {
		return rollNo;
	}

	@XmlElement
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public int getAge() {
		return age;
	}

	// @XmlTransient annotation, so it will not be included in xml
	@XmlTransient
	public void setAge(int age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}

	// @XmlAttribute,So it will be attribute of the root element in xml file
	@XmlAttribute
	public void setId(int id) {
		this.id = id;
	}
}