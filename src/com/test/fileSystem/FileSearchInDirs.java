package com.test.fileSystem;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * This class is responsible for searching gives file at given location, Using
 * IO packages
 * 
 * @author ank
 *
 */

public class FileSearchInDirs {

	private String fileNm = "aa.txt";
	private String location = "//Users//rinkeshshah//Documents//Ankee//workspace//Assignments//src//com//test//fileSystem//fileStructure//";
	private File[] files;
	private List<String> output = new ArrayList<String>();
	private int i = 0;

	/**
	 * Constructor
	 */
	public FileSearchInDirs() {
		System.out.println("Searching.......'" + fileNm + "'");
		try {
			output = searchOperation(fileNm, location);
			if (!output.isEmpty()) {
				System.out.println("\n************************************************\n" + "   File found, at\n	"
						+ output + "\n   Continue searching for more	"
						+ "\n************************************************\n");
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
	private List<String> searchOperation(String fileNm, String location) throws IOException {
		File dir = new File(location);
		files = dir.listFiles();

		for (File file : files) {
			if (!file.isDirectory()) {
				if (fileNm.equalsIgnoreCase(file.getName())) {
					file.getCanonicalPath();
					output.add(i, file.getCanonicalPath());
					System.out.println("\nFile found.....continue searching for more.....");
					i++;
				}
			} else {
				searchOperation(fileNm, file.getAbsolutePath());
			}
		}
		return output;
	}

	public static void main(String[] args) {
		FileSearchInDirs s = new FileSearchInDirs();
	}

}
