package com.assignment;

import java.nio.file.Paths;
import java.io.IOException;
import java.nio.file.Files;
//import java.nio.file.StandardCopyOption;
import java.io.File;
import java.nio.file.Path;

public class FileDemo {

	public static void main(String args[]) throws IOException {
		File f = new File("abc.txt");
		System.out.println("Exists=" + f.exists());
		if (!f.exists()) {
			boolean creation = f.createNewFile();
			System.out.println("Created =" + creation);

		}
		System.out.println("Path = " + f.getAbsolutePath());
		System.out.println("Directory = " + f.isDirectory());
		Path directory = Paths.get("G:\\Eclips_Workspace\\BasicProgram\\abc.txt");
		System.out.println(Files.isDirectory(directory));

	}
}
