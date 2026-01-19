package com.darshan.javapracticeprogram;

import java.util.Scanner;

public class ATM_Application {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int atmPin = 1234;
		int attempts= 0;
		double balance = 1000;
		while(attempts < 3) {
			System.out.println("Welcome to ATM Application.");
			System.out.println("Enter Your Pin :");
			int userPin = sc.nextInt();
			
			if(userPin == atmPin) {
				System.out.println("Pin Verified...✅");
				System.out.println("Welcome to ATM Application.");
				
				System.out.println("1.Check Balance");
				System.out.println("2.Deposite");
				System.out.println("3.Withdraw");
				System.out.println("4.Exite");
				
				System.out.println("Enter Your Choice :");
				int choice = sc.nextInt();
				
				if(choice == 1) {
					System.out.println("Your Balance :"+balance);
				}else if(choice == 2) {
					System.out.println("Enter The Deposite Amount :");
					int amount = sc.nextInt();
					
					if(amount > 0) {
						balance += amount;
						System.out.println("Deposite Successflly.. After Deposite Balance Rs:"+balance);
					}
				}else if(choice== 3) {
					System.out.println("Enter the Withdraw Amount :");
					int amount = sc.nextInt();
					
					if(amount > 0) {
						balance -=amount;
						System.out.println("Withdraw Sucessfully..Balance After Withdraw :"+balance);
					}else {
						System.out.println("Insufficient Balances");
					}
				}else if(choice ==4) {
					System.out.println("Thank you for using our App");
				}else {
					System.out.println("Invalide Choices");
				}
				
				break;  // Stop the Loop
			}else {
				attempts++;
				System.out.println("Incorrect Pin  ..Attempts Left :"+(3-attempts));
				if(attempts==3) {
					System.out.println("Account Locked due to Multiple Incoreect Attempts");
				}
			}
		}
	}

}
