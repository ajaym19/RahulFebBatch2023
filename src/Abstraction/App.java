package Abstraction;

public class App {

	public static void main(String[] args) {
		HDFCBank hdfc = new HDFCBank();
		hdfc.depositMoney();
		hdfc.giveInterest();
		hdfc.longTermTrading();
		
		ICICIBank icici = new ICICIBank();
		icici.giveInterest();
		
		//create object of Interface or Abstract class
		IRBI obj = new HDFCBank();
		//you can only call the methods
		//which are present in parent class or interface
		//obj.longTermTrading();
		
	}
}
