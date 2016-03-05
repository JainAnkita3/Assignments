package com.test.sessions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TestFile {

	public static void main(String[] args) {

		// To create Folder and than file inside it
		File f = new File("temp1.txt");
		File f1 = new File("temp.txt");

		/*
		 * f.mkdir(); System.out.println(f.getAbsolutePath()); try { if
		 * (!f1.exists()) { f1.createNewFile(); System.out.println(
		 * "File created succesfully"); //f. } else { System.out.println(
		 * "File already exist"); }
		 * 
		 * } catch (IOException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 */
		// First delete the file always before deleting folder
		// f1.delete();
		// f.delete();

		/*
		 * File files[] = f.listFiles(); // for(int i= 0; i< files.length; i++)
		 * // Enhanced for loop for (File file : files) {
		 * System.out.println(file + "is a File : " + file.isDirectory()); }
		 */

	}

}
