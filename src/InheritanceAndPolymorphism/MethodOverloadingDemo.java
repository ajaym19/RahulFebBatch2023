package InheritanceAndPolymorphism;

public class MethodOverloadingDemo {

	/*
	 * Method Overloading
	 * same method name with different signature
	 * --no of parameters
	 * --data types
	 */
	
	public void add(int a, int b) {
		System.out.println("Adding 2 int numbers");
	}

	public void add(float a, float b) {
		System.out.println("Adding 2 float numbers");
	}
	
	public void add(int a, int b , int c) {
		System.out.println("Adding 3 int numbers");
	}
	
	public static void main(String[] args) {
		MethodOverloadingDemo obj = new MethodOverloadingDemo();
		
		obj.add(1, 12, 13);
		obj.add(11, 21, 31);
		obj.add(10, 20);
		obj.add(23.5f, 45.6f);
		
	}
}
