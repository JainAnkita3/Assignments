package com.test.fileSystem;

import java.io.File;
import java.io.IOException;

/**
 * This class is responsible for searching gives file at given location, Using
 * IO packages
 * 
 * @author ank
 *
 */

public class FileSearchInDir {

	String fileNm = "aa.txt";
	String location = "//Users//rinkeshshah//Documents//Ankee//workspace//Assignments//src//com//test//fileSystem//";
	File[] files;
	String output;

	/**
	 * Constructor
	 */
	public FileSearchInDir() {
		System.out.println("Searching.......'" + fileNm + "'");
		try {
			output = searchOperation(fileNm, location);
			if (output != null) {
				System.out.println("Location of File : " + output.substring(0, output.indexOf(fileNm)));

			} else {
				System.out.println("\n****************************************\n"
						+ "    No File found at given location	" + "\n****************************************\n");
			}
		} catch (IOException e) {
			System.out.println("Search somewhere else");
			e.printStackTrace();
		}
	}

	/**
	 * This method will perform search operation inside given directory
	 * 
	 * @param fileNm
	 * @param location
	 * @return
	 * @throws IOException
	 */
	private String searchOperation(String fileNm, String location) throws IOException {
		File dir = new File(location);
		files = dir.listFiles();
		for (File file : files) {
			if (!file.isDirectory() && output == null) {
				if (fileNm.equalsIgnoreCase(file.getName())) {
					System.out.println("\n****************************************\n"
							+ "   File found, Stopping search here	" + "\n****************************************\n");
					// file.getCanonicalPath();
					output = file.getCanonicalPath();
					break;
				}
			} else if (output == null) {
				if (output == null) {
					searchOperation(fileNm, file.getAbsolutePath());
				}
			}

		}
		return output;

	}

	public static void main(String[] args) {
		FileSearchInDir s = new FileSearchInDir();
	}

}
