package EncapsulationDemo;

public class App {

	public static void main(String[] args) {
		Students s1 = new Students();
//		s1.sid = 1;
//		s1.name = "Nonsense";
//		System.out.println(s1.sid);
//		System.out.println(s1.name);
//		s1.schoolName = "A Bad School";
//		System.out.println(s1.schoolName);
		
		System.out.println(s1.getSid());
		//Ajay, Ajy//
		//Rithik, Hrithik
		//Sumit, Sumeet
		
		s1.setName("AJay");
		System.out.println(s1.getName());
	}
}
