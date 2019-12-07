package com.assignment;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class WriteData {

	public static void main(String[] args)throws IOException {
		File f = new File("abc.txt");
		FileWriter fw = new FileWriter(f);
		fw.write("Java is secure language and it is platform independent...");
		fw.write("Java is secure language and it is platform independent");

		fw.flush();
		fw.close();
	}

}
