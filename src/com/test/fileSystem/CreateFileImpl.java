package com.test.fileSystem;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * This class will create the file inside folder.
 * 
 * @author ank
 *
 */

public class CreateFileImpl {

	private String path = "//Users//rinkeshshah//Documents//Ankee//workspace//Assignments//src//com//test//fileSystem//tempFiles";
	private String dataToWrite = "Welcome to Java World";
	private String fileName = "temp.txt";
	private String fileName1 = "newTemp.txt";

	/**
	 * Constructor of createFileImpl class
	 */
	public CreateFileImpl() {
		File f, f1;
		f = createFile(path, fileName);
		writeInFile(f, dataToWrite);
		f1 = createFile(path, fileName1);
		renameFile(f, f1);
		System.out.println("\n Get the Folder Structure");
		PrintFileHierarchy p = new PrintFileHierarchy();
		p.getFileHirerachy(path);
	}

	/**
	 * This method will create a folder and file if not exist
	 * 
	 * @param Path
	 * @param fileName
	 * @return File
	 */
	private File createFile(String Path, String fileName) {
		File dir = new File(path);
		dir.mkdirs();
		File file = new File(dir + File.separator + fileName);
		try {
			// if file doesn't exists, then create it
			if (!file.exists()) {
				file.createNewFile();
				System.out.println("\nFile created sucessfully at location :\n " + file.getAbsolutePath());
			} else {
				System.out.println("File '" + file.getName() + "' already exists**");
			}
		} catch (IOException e) {
			System.out.println("Got exception while trying to create file");
			e.printStackTrace();
		}
		return file;
	}

	/**
	 * This method write data in a File.
	 * 
	 * @param file
	 * @param s
	 */
	private void writeInFile(File file, String s) {
		FileWriter fw;
		BufferedWriter bw = null;
		try {
			System.out.println("Writing Data in a File");
			fw = new FileWriter(file.getAbsolutePath());
			bw = new BufferedWriter(fw);
			bw.write(s);
		} catch (IOException e) {
			System.out.println("Exception occured while trying to write data in a File ");
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				System.out.println("\nClosing BufferWriter Resource");
			} catch (IOException e) {
				System.out.println("Exception occured while trying to Close BufferWriter ");
				e.printStackTrace();
			}
		}

	}

	/**
	 * This method will rename the file from source to Destination File name
	 * 
	 * @param sourcefile
	 * @param destFile
	 * @return
	 */
	private String renameFile(File sourcefile, File destFile) {
		System.out.println("Renaming File");
		sourcefile.renameTo(destFile);
		System.out.println(
				"File renamed succesfully from '" + sourcefile.getName() + "' to '" + destFile.getName() + "'");
		return dataToWrite;
	}

	public static void main(String[] args) {
		CreateFileImpl c = new CreateFileImpl();
	}

}
