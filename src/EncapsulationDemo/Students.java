package EncapsulationDemo;

public class Students {

	/*
	 * Encapsulation
	 * hiding the data
	 * 
	 * Access Modifiers
	 * private: can be accessed only within the class
	 * default: can be accessed only within the package
	 * protected: can be accessed within the package + by child class outside the package
	 * public: can be accessed throughout the project
	 * 
	 * 
	 * Use Getters and Setters
	 * 
	 */

	private int sid; //r
	private String name; //r, w
	private byte grade; //r
	private char division; //r
	private static String schoolName = "W2A"; //r
	private int mobileNO; //r, w
	protected int a;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMobileNO() {
		return mobileNO;
	}

	public void setMobileNO(int mobileNO) {
		this.mobileNO = mobileNO;
	}

	public int getSid() {
		return sid;
	}

	public byte getGrade() {
		return grade;
	}

	public char getDivision() {
		return division;
	}

	public static String getSchoolName() {
		return schoolName;
	}

	
	
}
