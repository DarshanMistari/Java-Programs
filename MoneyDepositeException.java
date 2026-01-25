package com.darshan.javapracticeprogram;

import java.util.Scanner;

public class MoneyDepositeException {
	
	double balance = 100;
	
	
	void deposite() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Deposited Amount :");
		double amount = sc.nextDouble();
		if(amount > 0) {
			balance += amount;
			System.out.println("After Deposite Money,Total Available Balance :"+balance);
		}else {
			throw new InvalideAmountException("Amount should be greater than 0.");
		}
	}
	
	public static void main(String[] args) {
		MoneyDepositeException dep =	new MoneyDepositeException();
		
		try {
		dep.deposite();
		}catch(InvalideAmountException e) {
			System.out.println(e.getMessage());
		}
	}

}
