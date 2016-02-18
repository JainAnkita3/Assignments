package com.test.fileSystem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.channels.FileChannel;

/**
 * This Class is responsible to Copy Bulk Files from 1 to another location If
 * target doesn't exist it should get created first Using IO & NIO packages
 * 
 * @author ank
 *
 */
public class CopyBulkFiles {

	private String sourceFolderPath = "//Users//rinkeshshah//Documents//Ankee//workspace//Assignments//src//com//test//fileSystem//source.txt";
	private String targetFolderPath = "//Users//rinkeshshah//Documents//Ankee//workspace//Assignments//src//com//test//fileSystem//target.txt";
	private File[] sourceList;
	private int n;

	public CopyBulkFiles() throws IOException {
		File sourceFolder = new File(sourceFolderPath);
		File targetFolder = new File(targetFolderPath);

		n = copyFilesIO(sourceFolder, targetFolder);
		System.out.println("Total Files copied : " + n);
	}

	/**
	 * This method will copies the folder and files
	 * 
	 * @param sourceFolder
	 * @param targetFolder
	 * @return
	 * @throws IOException
	 */
	private int copyFilesIO(File sourceFolder, File targetFolder) throws IOException {
		System.out.println("Source : '" + sourceFolder.getName() + "'");
		System.out.println("Target : '" + targetFolder.getName() + "'");
		BufferedWriter bw = null;

		if (sourceFolder.isDirectory()) {
			System.out.println("Is Directory");
			// If Target folder doesn't exist, create it
			targetFolder.mkdir();
			sourceList = sourceFolder.listFiles();
			n = sourceList.length;
			System.out.println("No of Files in Source folder to be copied : " + sourceList.length);

			for (File sourceFile : sourceList) {
				System.out.println("File found : " + sourceFile.getName());
				File targetFile = new File(targetFolder, sourceFile.getName());
				copyFilesIO(sourceFile, targetFile);
			}
		}
		// If source isn't Directory,copy Source file into Destination file
		else {
			// Setting n to 1, if Only file needs to copy
			if (n == 0) {
				n = 1;
			}
			System.out.println("Copying files");
			String line = null;
			// If target file doesn't exist it will create the target file first
			FileReader fr = new FileReader(sourceFolder);
			BufferedReader br = new BufferedReader(fr);
			FileWriter fw = new FileWriter(targetFolder);

			while (((line = br.readLine()) != null) && (targetFolder.canWrite())) {
				System.out.println("Write : '" + line + "' with permission as : " + targetFolder.canWrite());
				bw = new BufferedWriter(fw);
				bw.write(line);
				// To put data in New line
				bw.newLine();
				// To avoid Overwriting of data in Target file
				bw.flush();

			}
			System.out.println("Closing the resources");
			br.close();
			bw.close();
		}
		return n;

	}

	/**
	 * Not in Use This method will copies the folder and files using NIO
	 * packages (FileChannel)
	 * 
	 * @param sourceFolder
	 * @param targetFolder
	 * @return
	 * @throws IOException
	 */
	@SuppressWarnings("unused")
	private int copyFilesNIO(File sourceFolder, File targetFolder) throws IOException {
		BufferedWriter bw = null;

		if (sourceFolder.isDirectory()) {
			// If Target folder doesn't exist, create it
			targetFolder.mkdir();
			sourceList = sourceFolder.listFiles();
			n = sourceList.length;
			System.out.println("No of Files in Source folder to be copied : " + sourceList.length);

			for (File sourceFile : sourceList) {
				System.out.println("File found : " + sourceFile.getName());
				File targetFile = new File(targetFolder, sourceFile.getName());
				copyFilesNIO(sourceFile, targetFile);
			}
		}
		// If source isn't Directory, copy source file into Destination file
		else {
			// Setting n to 1, if Only file needs to copy
			if (n == 0) {
				n = 1;
			}

			@SuppressWarnings("resource")
			FileChannel in = new FileInputStream(sourceFolder).getChannel();
			@SuppressWarnings("resource")
			FileChannel out = new FileOutputStream(targetFolder).getChannel();
			System.out.println("Input channel Size : " + in.size());
			System.out.println("Out channel Size :  " + out.size());

			// Transfers the IN data into OUT data
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
