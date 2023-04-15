package Collections;

public class ArrayDemo {

	/*
	 * Array:
	 * used to store multiple values of similar data type
	 * 
	 * 3 parts:
	 * 1. Declaration
	 * 2. Instantiation
	 * 3. Initialization
	 * 
	 * Rules:
	 * 1. While Instantiating, it is compulsory to define the size
	 * 2. Every element is indexed and it starts from 0
	 * 3. By default all the elements are initialized to 0 or null
	 */
	public static void main(String[] args) {
		
		int[] id; //Declaration
		//int a[];

		id = new int[10]; // Instantiation
		id[0] = 22;
		id[1] = 34;
		System.out.println(id[0]);
		System.out.println(id[1]);
		System.out.println(id[4]);
		// System.out.println(id[5]);
		System.out.println("Size of the Array is "+id.length);
		System.out.println("Printing array values using for loop");
		for (int i = 0; i < id.length; i++) {
			System.out.println(id[i]);
		}
		
		
		//Decl + Instan
		int[] b = new int[5];
		
		//decl + inst + init
		int[] c = {1,23,45};
		System.out.println(c.length);
		
		/*
		 * Create an array of size 10 and assign value as 1,2,3...10
		 * Create an array of size 10 and assign value as 10,20,30...100
		 * dont use the third way
		 */
		
		int[] tar = new int[10];
		System.out.println("Learning Assginment 1");
	//	int counter = 10;
		for(int i = 0; i < tar.length; i++) {
			tar[i] = (i+1)*10;
		}
		
		for (int i = 0; i < tar.length; i++) {
			System.out.println(tar[i]);
		}
		
		
		
		
		
	}
}
