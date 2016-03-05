package com.test.fileSystem;

import java.io.File;
import java.io.FilenameFilter;

/**
 * This class is responsible for searching gives file at given location Using IO
 * packages
 * 
 * @author ank
 *
 */
public class SearchFileInDirDoubt {

	String fileNm = "d.txt";
	String location = "//Users//rinkeshshah//Documents//Ankee//workspace//Assignments//src//com//test//fileSystem//source//";
	File[] files;

	public SearchFileInDirDoubt() {
		System.out.println("Searching file at given location : "  + fileNm);
		searchOperation(fileNm, location);
	}

	private void searchOperation(String fileNm, String location) {
		System.out.println("Inside searchOperation  :  " + fileNm);
		File dir = new File(location);

		FilenameFilter filter = new FilenameFilter() {
			@Override
			public boolean accept(File dir, String fileNm) {
				System.out.println("Inside accept  :  " + fileNm);

				// To get the list of all files/dir present in dir
				//files = dir.listFiles();
				//System.out.println("dir : " + dir.getName());
				// Iterating FileList to match with the given file
				//for (File file : files) {
					//System.out.println("Input File : " + fileNm);
					//System.out.println("Found file :" + file.getName());
					if (fileNm.equalsIgnoreCase("d.txt")) {
						System.out.println("aya");
						return true;
					}
					//break;
				//}
				return false;
			}
		};
		files = dir.listFiles(filter);
		for (File f : files){
			System.out.println(f.getAbsolutePath());

		}

	}

	public static void main(String[] args) {
		SearchFileInDirDoubt s = new SearchFileInDirDoubt();
	}

}
