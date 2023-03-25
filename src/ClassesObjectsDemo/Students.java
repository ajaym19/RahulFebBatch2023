package ClassesObjectsDemo;

public class Students {

	// should contain student objects
	// class contain variables and methods

	int sid;
	int age;
	String name;
	long mobileNo;
	int std;
	String address;
	char section;
	static String schoolName = "W2A";

	public void attendLectures() {
		System.out.println("Students are attending lectures");
	}

	public void doExercise() {
		System.out.println("Students are doing exercise");
	}

	public void printSId() {
		System.out.println(sid);
		System.out.println(schoolName);
	}

	public static void printSchoolName() {
		System.out.println(schoolName);
		// System.out.println(sid);
		// PI
		System.out.println(Math.PI);
	}

	public static void printInfo() {
		System.out.println("Printing general information");
	}

	public static void main(String[] args) {
		//System.out.println(sid); create an object
	}

}
