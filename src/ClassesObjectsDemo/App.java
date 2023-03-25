package ClassesObjectsDemo;

public class App {

	public static void main(String[] args) {
		
		int id  = 5;
		int a;
		a = 5;
		//create object
		//class_name ref_var_name = new_keyword constructor_call();
		Students s1;
		s1 = new Students();
		s1.sid = 1;
		s1.name = "Anita";
		s1.schoolName = "W2A";
		
		System.out.println(s1.sid);
		System.out.println(s1.name);
		//System.out.println(s1.schoolName);
		System.out.println(Students.schoolName);
		s1.attendLectures();
		
		Students s2 = new Students();
		s2.sid = 2;
		s2.name = "Karthik";
		s2.schoolName = "W2A";
		System.out.println(s2.sid);
		System.out.println(s2.name);
		System.out.println(Students.schoolName);
	}
}
