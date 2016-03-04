package com.test.jaxb;

import java.io.FileOutputStream;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

/**
 * This is test class for Marshalling.
 * 
 * @author ank
 */
public class JAXBTest {
	public static void main(String args[]) {
		try {
			// Create Student object
			Student student = new Student("Ank", "BE/09/05", "BE final", 25, 7);

			// create JAXB context
			JAXBContext context = JAXBContext.newInstance(Student.class);
			// Create Marshaller using JAXB context
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			// Do the marshal operation
			marshaller.marshal(student, new FileOutputStream(
					"/Users/rinkeshshah/Documents/Ankee/workspace/Assignments/src/com/test/jaxb/Student.xml"));
			System.out.println("java object converted to xml successfully.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
