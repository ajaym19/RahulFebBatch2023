package ExceptionAndFileHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionTypes {

	/*
	 * Exception Types
	 * 1. Checked Exception
	 * 2. Unchecked Exception
	 * 
	 */
	
	
	
	public static void main(String[] args) throws FileNotFoundException {
		String filePath = "./src/ExceptionAndFileHandling/Test";
		FileReader reader = new FileReader(filePath);
		System.out.println("Ajay");
		
		int[] id = new int[5];
		//System.out.println(id[8]);
		
		String name = null;
		//System.out.println(name.length());
		System.out.println(5/0);
		
		throw new NullPointerException();
	}
}
