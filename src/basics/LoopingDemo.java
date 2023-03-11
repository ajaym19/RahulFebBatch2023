package basics;

public class LoopingDemo {

	public static void main(String[] args) {

		// for loop
		System.out.println("Learning for loop");
		// initialization, condition, increment/decrement
		// = and ==
		int counter = 5;
		// counter++;
		// counter = counter+1;
		// System.out.println(counter);
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
			// System.out.println("Ajay");
		}

		int count = 15;

		// first the condition is checked and then statement is executed
		while (count < 11) {
			System.out.println("Ajay"); // 1 or 10
			count++;
		}

		// first statement is executed and then condition is checked
		int tracker = 15;
		do {
			System.out.println("Tracker Value is " + tracker);
			tracker++;
		} while (tracker < 11);

		// conditonal statements

		int age = 44;
		if (age >= 18) {
			System.out.println("Allowed to Vote");
		} else {
			System.out.println("Not allowed to vote");
		}

		int marks = 233;
		// 0 to 35: Fail
		// 35 to 60: Second Class
		// 60 to 75: First CLass
		// 75+ : Distinction

		if (marks <= 35) {
			System.out.println("Failed");
		} else if (marks > 35 && marks <= 60) {
			System.out.println("Second Class");
		} else if (marks > 60 && marks <= 75) {
			System.out.println("First Class");
		} else if (marks > 75 && marks <= 100) {
			System.out.println("Distinction");
		} else {
			System.out.println("Please provide a value less than 100");
		}

		// conditional in loops
		// print 1 to 10;
		// if you find 5, dont print 5 just stop

		for (int i = 1; i < 11; i++) {
			if (i == 5) {
				break;
			}
			System.out.println(i);
		}

		// int day =1 ;
		// print the dayname based on the day value
		// 1 = Monday...
		int day = 22;
		if (day == 1) {
			System.out.println("Monday");
		} else if (day == 2) {
			System.out.println("Tuesday");
		} else if (day == 3) {
			System.out.println("Wednesday");
		} else if (day == 4) {
			System.out.println("Thursday");
		} else if (day == 5) {
			System.out.println("Friday");
		} else if (day == 6) {
			System.out.println("Saturday");
		} else if (day == 7) {
			System.out.println("Sunday");
		} else {
			System.out.println("Please provide a number from 1 to 7");
		}

		System.out.println("Learning Switch");

		switch (day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Please provide a number from 1 to 7");
			break;
	
		}
		
		//switch for months
		
		
		

	}
}
