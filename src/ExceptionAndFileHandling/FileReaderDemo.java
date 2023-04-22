package ExceptionAndFileHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderDemo {

	/*
	 * FileReader
	 * class in java
	 * 
	 * reads only one character at a time
	 * it return the ascii value 
	 */
	
	public static void main(String[] args) throws IOException {
		read();
		write();
	}
	
	public static void read() throws IOException {
		String filePath = "./src/ExceptionAndFileHandling/Test";
		FileReader reader = new FileReader(filePath);
//		System.out.println((char)reader.read());
//		System.out.println((char)reader.read());
//		System.out.println((char)reader.read());
//		System.out.println((char)reader.read());
//		
		int i = 0;
		while((i = reader.read()) != -1) {
			System.out.print((char)i);
		}	
	}
	
	public static void write() throws IOException {
		String filePath = "./src/ExceptionAndFileHandling/Test2";
		FileWriter writer = new FileWriter(filePath);
		writer.write("Hello World");
		writer.close();
	}
}
