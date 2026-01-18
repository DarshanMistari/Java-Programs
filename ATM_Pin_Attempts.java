package com.darshan.javapracticeprogram;

import java.util.Scanner;

public class ATM_Pin_Attempts {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int attempts = 0;
		int pin = 1234;
		while(attempts < 3) {
			
			System.out.println("Enter Your Pin :");
			int userPin = sc.nextInt();
			
			if(pin == userPin) {
				System.out.println("Pin VeriFied..✅");
				return;
			}
			else {
				attempts++;  //Increase the value by 1
				System.out.println("Incorrect Pin... Attempts Left:"+(3-attempts));
				if(attempts == 3) {
					System.out.println("Account is Locked due to Multiple Incorrect Attempts");
				}
			}
		}
	}

}
