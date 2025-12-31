package com.darshan.javapracticeprogram;

import java.util.Scanner;

public class Else_IF_Statement {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		String userName;
		String password;
		
		System.out.println("Enter the UserName :");
		userName = sc.next();
		
		System.out.println("Enter the Password :");
		password= sc.next();
		
		if(userName.equals("Darshan") && password.equals("2004")) {
			System.out.println("Login Succesfully! WelCome "+userName);
		}
		else if(!userName.equals("Darshan") && !password.equals("2004")) {
			System.out.println("Invalide Username and Password");
		}
		else if(!userName.equals("Darshan")) {
			System.out.println("Invalide UserName");
		}
		else if(!password.equals("2004")) {
			System.out.println("Invalide Password");
		}
	}
}
