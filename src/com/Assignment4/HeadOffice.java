package com.Assignment4;

public abstract class HeadOffice {
	
	public void accounts(int amount) {
		System.out.println("Checking accounts with amount: " + amount);
	}
	
	public int pay_tax(int amount) {		
		return amount;
	}
	
	public abstract void receive_Customers();
	
}
