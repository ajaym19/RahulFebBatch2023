package InheritanceAndPolymorphism;

public class App {

	public static void main(String[] args) {
		Students s1 = new Students();
		s1.markAttendance();
		s1.attendSession();
		Teachers t1 = new Teachers();
		t1.markAttendance();
		t1.deliverSession();
		
		Staff stf1 = new Staff();
		stf1.markAttendance();
		s1.lunchBreak();
		t1.lunchBreak();
		stf1.lunchBreak();
		
	}
}
