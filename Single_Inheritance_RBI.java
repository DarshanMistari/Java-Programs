package com.darshan.javapracticeprogram;

public class Single_Inheritance_RBI {
//	RBI Bank
	
	double balance;
	
	void deposite(double amount) {
		if(amount > 0) {
			balance += amount;
			System.out.println("Deposited succesfully. After Deposited Balance :"+balance);		}
	}

}
