package com.Assignment6.Bank.Madurai;

import com.Assignment6.Bank.Chennai.Account_Holder;
import com.Assignment6.Bank.Chennai.SBI;

public class Account_Holder_Madurai {
	public static void main(String[] args) {

		Account_Holder bank = new Account_Holder();
		SBI sbi = new SBI();
		
		//Outside class method calling here.
		sbi.get_loan(100000);
		sbi.create_account();
		
		//Outside Class Non-static variables declaration
		String Name = sbi.empName ="NitheshKumar";// error-The field SBI.empName is not visible
		String Id= sbi.empId ="8M516";
		
		System.out.println(Name);
		System.out.println(Id);
		
		System.out.println(SBI.branch_name);//Error - The field SBI.branch_name is not visible
	}

}
