package ExceptionAndFileHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException {
		String filePath = "./src/ExceptionAndFileHandling/Test";
		FileReader reader = new FileReader(filePath);
		BufferedReader br = new BufferedReader(reader);
	//	System.out.println(br.readLine());
		
		String line = null;
		while ((line = br.readLine())!=null) {
			System.out.println(line);
		}
		
	}
}
