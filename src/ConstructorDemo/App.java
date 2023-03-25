package ConstructorDemo;

public class App {

	public static void main(String[] args) {
		Students s1 = new Students(1, "Ajay");
		System.out.println(s1.sid); 
		System.out.println(s1.name);
		Students s2 = new Students(2, "Pooja");
		// System.out.println(Students.counter);
		System.out.println(s2.sid); // 0
		System.out.println(s2.name);
		
		Students s3 = new Students(3, "Aarti", 8);
		
	}
}
