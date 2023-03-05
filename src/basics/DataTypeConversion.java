package basics;

public class DataTypeConversion {
	
	/*
	 * Data Type Conversion
	 * 
	 * Bucket Theory
	 * Bucket 1: 5L
	 * Bucket 2: 3L
	 * 
	 * Task: transfer all the water from:
	 * B2 to B1: possible, no problem
	 * B1 to B2: you have a problem, chances that there might be some loss
	 * 
	 * Memory
	 * byte < short < int < long < float < double
	 * 
	 */

	public static void main(String[] args) {
		
		byte b = 23;
		short s = 45;
		System.out.println(b);
		System.out.println(s);
		
		s =b;
		System.out.println(s);
		
		byte b1;
		short s1 = 129;
		b1 = (byte) s1;
		System.out.println(b1);
		System.out.println(s1);
		
		int i = 34545;
		long l = i;
		
		
		long l1 = 3434;
		int i1 = (int)l1;
		
		int i3 = 45;
		double d = i3;
		System.out.println(i3); //45
		System.out.println(d); //45.0
		
		double d1 = 45.95;
		int i4 = (int) d1;
		System.out.println(d1); //45.05
		System.out.println(i4); //45
				
		//char to int
		char c1 = '+';
		int i6 = c1;
		System.out.println(c1); //A
		System.out.println(i6); //
		
		//int to char
		int i5 = 45;
		char c = (char) i5;
		System.out.println(i5);
		System.out.println(c);
		
		//int to String
		
		//for every primitive data type, there is a corresponding wrapper class
		//Byte, Short, Integer, Long, Float, Double, Character, Boolean
		
		int i10 = 450;
		String s2 = Integer.toString(i10);
		System.out.println(i10+10); //460
		System.out.println(s2+10); //45010
		
		
		//String to int
		String s3 = "123";
		int i11 = Integer.parseInt(s3);
		System.out.println(s3);
		System.out.println(i11); //
		
		//double to string
		//string to double
		
		
		//String concatenatin task
		
		System.out.println("Ajay");// Ajay
		System.out.println(10);// 10
		System.out.println(25 + 10);// 35
		System.out.println("AJay" + 10);// AJay10
		System.out.println("AJay" + 10 + 10);// AJay1010
		System.out.println(10 + "AJay"); // 10Ajay
		System.out.println(10 + 10 + " Ajay " + 10 + 10); // 10Ajay
		// AJay"+10+10+Trainer >> Ajay10 + 10 >> Ajay1010Trainer
		
	}
}
