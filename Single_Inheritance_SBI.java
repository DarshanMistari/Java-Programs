package com.darshan.javapracticeprogram;

public class Single_Inheritance_SBI extends Single_Inheritance_RBI {

	void deposit() {
		int age = 23;
		if(age >= 18) {
			super.deposite(1000);
		}
		else {
			System.out.println("can not Deposite");
		}
	}
	
	void withdraw(int amount) {
		if(amount >= 0) {
			balance -= amount;
			System.out.println("Withdra Rs Succesfully."+amount);
			System.out.println("After Withdraw Balance :"+balance);
		}
		else {
			System.out.println("Balance is not Avialable in your Account."+balance);
		}
	}
	public static void main(String args[]) {
		
		Single_Inheritance_SBI bank = new Single_Inheritance_SBI();
		bank.deposit();
		bank.withdraw(500);
		bank.deposit();
		
	}
}
