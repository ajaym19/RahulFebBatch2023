package basics;

public class HelloWorld {

	// CTRL+SPACE for shortcuts
	// CTRL+SHIFT+F for Format

	final int id = 6;
	
	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println(1);
		System.out.println("Ajay");
		HelloWorld obj = new HelloWorld();
		obj.m1();
	}
	
	public void m1() {
		//id = 5;
		System.out.println(id);
	}

}
