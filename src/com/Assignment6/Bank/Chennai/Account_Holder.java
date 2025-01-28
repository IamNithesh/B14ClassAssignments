package com.Assignment6.Bank.Chennai;

public class Account_Holder {
	
	public static void main(String[] args) {
		//SBI class- Object.
		SBI sbi= new SBI();
		
		//Account_Holder- Instance of the class/ Object.
		Account_Holder bank= new Account_Holder();
		
		//Outside class method calling here.
		sbi.get_loan(100000);
		sbi.create_account();
		
		//Outside Class Non-static variables declaration
		String Name = sbi.empName ="NitheshKumar";
		String Id= sbi.empId ="8M516";
		
		System.out.println(Name);
		System.out.println(Id);
		
		System.out.println(SBI.branch_name);
	}

}
