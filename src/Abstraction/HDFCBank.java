package Abstraction;

public class HDFCBank extends ABstractClassDemo implements IRBI, ISEBI {

	@Override
	public void depositMoney() {
		System.out.println("HDFC Bank Depositing Money");

	}

	@Override
	public void withdrawMoney() {
		System.out.println("HDFC Bank Withdrawing Money");

	}

	@Override
	public void balanceCheck() {
		System.out.println("HDFC Bank Checking Balance");

	}

	@Override
	public void giveInterest() {
		System.out.println("ICICI Bank Interest Rate is 5% pa");

	}

	@Override
	public void intraDayTrading() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void longTermTrading() {
		System.out.println("Long Term Trading Options");
		
	}

	@Override
	public void notificationSupport() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ab1() {
		// TODO Auto-generated method stub
		
	}

}
