package Abstraction;

public class ICICIBank implements IRBI{

	@Override
	public void depositMoney() {
		System.out.println("ICICI Bank Depositing Money");
		
	}

	@Override
	public void withdrawMoney() {
		System.out.println("ICICI Bank Withdrawing Money");
		
	}

	@Override
	public void balanceCheck() {
		System.out.println("ICICI Bank Checking Balance");
		
	}

	@Override
	public void giveInterest() {
		System.out.println("ICICI Bank Interest Rate is 4% pa");
		
	}

}
