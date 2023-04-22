package ExceptionAndFileHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionHandlingDemo {

	/*
	 * Exception:
	 * unwanted event or unexpected event which may cause failure of code
	 * 
	 * try - any risky code goes here
	 * catch - what to do if exception happens or occurs
	 * finally - what to if exception happens or not
	 * 
	 */
	
	public static void main(String[] args) {
		
		System.out.println("Trying to connect to DB");
		System.out.println("Connected to DB");
		String filePath = "./src/ExceptionAndFileHandling/Test";
		
		try {
			FileReader reader = new FileReader(filePath);
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found, please check the file again!!!");
		}finally {
			System.out.println("Closing DB Connection");
		}
	}
}
