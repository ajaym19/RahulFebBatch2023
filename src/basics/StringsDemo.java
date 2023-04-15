package basics;

public class StringsDemo {

	/*
	 * String
	 * is a class
	 * final - keyword as assignment (3places)
	 * 
	 * Ways:
	 * 1. String Literal
	 * 2. new keyword
	 * 
	 * Rules
	 * 1. String objects are immutable in Java in any case
	 * 
	 */
	public static void main(String[] args) {
		//String literal
		String name = "Ajay";
		String msg;
		System.out.println(name);
		msg = name.concat("Trainer");
		System.out.println(name); //
		System.out.println(msg);
		String s1 = "Hello";
		System.out.println(s1);
		String s2 = "Java";
		System.out.println(s2);
		String s3 = "Hello";
		
	
		//new keyword
		String sn1 = new String("Python");
		System.out.println(sn1);
		sn1.concat("Language");
		System.out.println(sn1);
		
		String sn3 = new String("Apple");
		String sn4 = new String("Apple");
		
		System.out.println(name.charAt(1));
		System.out.println(name.toLowerCase());
		
		//Mutable representatin of String class
		//String buffer
		
		StringBuffer sb1 = new StringBuffer("Welcome to ");
		System.out.println(sb1);
		sb1.append("India");
		System.out.println(sb1); //
		
		//reverse a string
		String str = "Reverse Me!";
		StringBuffer opt = new StringBuffer(str);
		System.out.println(opt.reverse());
		
		//reverse a string without using inbuilt methods
		//
	}
}
