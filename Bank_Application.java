package com.darshan.javapracticeprogram;

import java.util.Scanner;

public class Bank_Application {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int balance=1000;
		String wantToContinue=null;
		do {
			System.out.println("*** Wel Come Hasti Bank Application ***");
			System.out.println("1.Deposite");
			System.out.println("2.Withdraw");
			System.out.println("3.Check Balance");
			System.out.println("4.Exit\n");
			
			System.out.print("Select the Operation :");
			int choice = sc.nextInt();
			
			if(choice == 1) {
				System.out.println("Enter the Deposite Amount :");
				int amount = sc.nextInt();
				
				if(amount > 0) {
					balance += amount;
					System.out.println("Deposited....After Deposite Balance :"+balance);
				}
				else {
					System.out.println("Invalide Amount");
				}
				
			}
			else if(choice == 2) {
				System.out.println("Enter the Withdraw Amount :");
				int amount  = sc.nextInt();
				 
				 if(amount > 0) {
					 if( amount <= balance) {
						 balance -=amount;
						 System.out.println("Withdraw : after Withdraw Balance :"+balance);
					 }
					 else {
						 System.out.println("Insufficient Balances");
					 }
				 }
				 else {
					 System.out.println("Invalide Amount");
				 }
			}
			else if(choice == 3) {
				System.out.println("You are Current Balance is :"+balance);
			}
			else if(choice == 4) {
				System.out.println("Thank you for Using Hasti Bank Application");
				break;
			}
			else {
				System.out.println("Invalide Choice");
			}
			
			
			System.out.println("Do You want to Continue ? Yes / No");
			wantToContinue = sc.next();
			
			if(wantToContinue.equals("No")) {
				System.out.println("Thank you for Used the Bank");
				break;
			}
		}
		while(wantToContinue.equals("Yes"));
	}
;
}
