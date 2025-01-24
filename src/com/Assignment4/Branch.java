package com.Assignment4;

public class Branch extends Branch_Plan {
	
	@Override
    public void receive_Customers() {
        System.out.println("Receiving customers at the branch.");
    }

	public static void main(String[] args) {
		Branch branch = new Branch();

		// calling methods
		branch.accounts(1000);
		int tax = branch.pay_tax(100);
		System.out.println("Tax returned: " + tax);
		branch.do_interview();
		branch.receive_Customers();
	}

}
