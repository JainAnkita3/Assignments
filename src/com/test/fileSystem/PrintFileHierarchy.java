package com.test.fileSystem;

import java.io.File;

/**
 * This class will Display the hierarchy of Files.
 * 
 * @author ank
 *
 */

public class PrintFileHierarchy {

	String[] list;
	static String path = "//Users//rinkeshshah//Documents//Ankee//workspace//Assignments//src//com//test//fileSystem//fileStructure";
	String s;
	File[] fileList;

	/**
	 * This method is use to get Folder Structure of Input.
	 * This method is not in Use now
	 * 
	 * @param path
	 * @return
	 */
	private String getFileHirerachy(String path) {
		System.out.println("Input : " + path + "\n");
		File folder = new File(path);

		if (folder.listFiles().length == 0) {
			System.out.println("Directory is empty");
			System.exit(0);
		}

		if (folder.isDirectory() && (folder.listFiles().length != 0)) {
			fileList = folder.listFiles();

			for (File file : fileList) {
				if (file.isDirectory()) {
					System.out.println("Directory -- '" + file.getName() + "' \n child list");
					getChildList(file);
				} else {
					System.out.println("File -- " + file.getName());
				}
			}
		}

		return s;

	}

	/**
	 * This method is used to get the list of files inside the inner directories
	 * 
	 * @param folder
	 */
	protected void getChildList(File folder) {
		fileList = folder.listFiles();
		for (int i = 0; i < fileList.length; i++) {
			if (!fileList[i].isDirectory()) {
				System.out.println("  -- File " + fileList[i].getAbsolutePath());
			} else {
				System.out.println("-- Directory '" + fileList[i].getName() + "' \n child list");
				getChildList(fileList[i]);
			}
		}

	}

	public static void main(String[] args) {
		PrintFileHierarchy p = new PrintFileHierarchy();
		File f = new File(path);
		p.getChildList(f);
	}

}
