package com.darshan.javapracticeprogram;

import java.util.Scanner;

public class If_Else_LoginPasswordProgram {
	
	public static void main(String args[]) {
		
		Scanner sc =new Scanner(System.in);
		
		String userName;
		String password;
		
		System.out.println("Enter the username :");
		userName = sc.next();
		
		System.out.println("Enter the Password :");
		password = sc.next();
				
		if(userName.equals("Darshan") && password.equals("2004")) {
			System.out.println("Login Succesfully");
		}
		else {
			System.out.println("Invalide Username and Password");
		}
	}

}
