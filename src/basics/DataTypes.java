package basics;

public class DataTypes {
	
	/*
	 * Data Types:
	 * Variables: contains some data
	 * 
	 * In Java, whenever we declare a variable, it is compulsory to define the data type
	 * 
	 * Data Types:
	 * 1. Primitive:
	 * 	Integer: byte, short, int, long
	 * 	Decimal: float, double
	 * 	character: char
	 * 	yes/no: boolean
	 * 
	 * 2. Non Primitive: String, Array, ArrayList, INterfaces
	 * 
	 * 
	 * Variable:
	 * 1. Declaration
	 * 2. Initialization
	 * 
	 */

	
	public static void main(String[] args) {
		int id;
		id = 5;
		System.out.println(id);
		System.out.println("id");
		
		int a = 45;
		System.out.println(a);
		
		//container: 10 kg
		//salt? 25kg
		//1, 100, 10000000
		
		byte b = 45; //-128 to 127
		System.out.println(b);
		
		short s = 4500; //-32767 to 32768
		
		int i = 454545; //-2^31 to 2^31
		
		long l = 4543434343l;
		
		
		
		//decimal
		float f = 45.34455f;
		System.out.println(f);
		
		double d = 4545.65465465;
		System.out.println(d);
		
		
		//character: stores only character
		//a, 4, &
		//with character we should use single quotes
		
		char c = 'a';
		System.out.println(c);
		char c1 = '%';
		System.out.println(c1);
		
		//yes, no
		boolean bool = false;
		System.out.println(bool);
		
	}
	
	
	
}
