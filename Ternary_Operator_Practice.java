package com.darshan.javapracticeprogram;

import java.util.Scanner;

public class Ternary_Operator_Practice {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Age :");
		int age = sc.nextInt();
		
		String license = (age >= 18) ? "You are Allow for Driving License" : "You are not Allow for Driving License";
		
		System.out.println(license);
	}

}
