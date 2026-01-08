package com.darshan.javapracticeprogram;

import java.util.Scanner;

public class Ternary_Oprator {
	
	public static void main(String ares[]) {
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter the Age :");
		int age = obj.nextInt();
		
		String result = (age >=18) ? "You are Allow for Voting" : "You are not Allow for Voting";
		System.out.println(result);
	}

}
