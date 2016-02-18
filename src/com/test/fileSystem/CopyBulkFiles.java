package com.test.fileSystem;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class CopyBulkFiles {

	private String sourceFolderPath = "//Users//rinkeshshah//Documents//Ankee//workspace//Assignments//src//com//test//fileSystem//source";
	private String targetFolderPath = "//Users//rinkeshshah//Documents//Ankee//workspace//Assignments//src//com//test//fileSystem//target";
	private File[] sourceList;
	private int n;

	public CopyBulkFiles() throws IOException {
		File sourceFolder = new File(sourceFolderPath);
		File targetFolder = new File(targetFolderPath);

		n = copyFiles(sourceFolder, targetFolder);
		System.out.println("Total Files copied : " + n);
	}

	private int copyFiles(File sourceFolder, File targetFolder) throws IOException {
		System.out.println("Source : '" + sourceFolder.getName() + "'");
		System.out.println("Target : '" + targetFolder.getName() + "'");

		if (sourceFolder.isDirectory()) {
			// If Target folder doesn't exist, creating it
			targetFolder.mkdir();
			sourceList = sourceFolder.listFiles();
			n = sourceList.length;
			System.out.println("No of Files in Source folder to be copied : " + sourceList.length);

			for (File sourceFile : sourceList) {
				System.out.println("File found : " + sourceFile.getName());
				File targetFile = new File(targetFolder, sourceFile.getName());
				copyFiles(sourceFile, targetFile);
			}
		}
		// If source isn't Directory, copy the source file into Destination
		// files
		else {
			if (n == 0) {
				n = 1;
			}
			System.out.println("Copying files");
			FileChannel in = new FileInputStream(sourceFolder).getChannel();
			FileChannel out = new FileOutputStream(targetFolder).getChannel();
			System.out.println("Input channel Size : " + in.size());
			System.out.println("Out channel Size :  " + out.size());

			if (out != null && in != null) {
				out.transferFrom(in, 0, in.size());
			}
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
			if (in.isOpen() || out.isOpen()) {
				System.out.println("In/Out is not closed properly");

			}
		}
		return n;

	}

	public static void main(String[] args) {
		try {
			CopyBulkFiles c = new CopyBulkFiles();
		} catch (IOException e) {
			System.out.println("Folder/File not found");
			e.printStackTrace();
		}
	}

}
