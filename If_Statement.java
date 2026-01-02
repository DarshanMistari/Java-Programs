package com.darshan.javapracticeprogram;

import java.util.Scanner;

public class If_Statement {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		String password;
		
		System.out.println("Enter Password :");
		password = sc.next();
		
		if(password.equals("Darshan")) {
			
			System.out.println("Password is Correct");
			return;
		}
		System.out.println("Password is invalide");
		
	}
}
