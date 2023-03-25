package ConstructorDemo;

public class Students {

	int sid;
	String name;
	int std;
	char division;
	static String schoolName;

	/*
	 * Constructor: used to initialize the variables there is a default constructor
	 * available in java
	 */

	static int counter;

	public Students(int sid, String name) {
		// over here, there are 2 variables with same name
		// this is used to refer global variables
		this.sid = sid;
		this.name = name;	
	}

	public Students(int sid, String name, int std) {
		this.sid = sid;
		this.name = name;
		this.std = std;
	}
	
	

//	public Students() {
//		counter++;
//		System.out.println("I am in Constructor");
//	}

	// Parametrized constructors

}
