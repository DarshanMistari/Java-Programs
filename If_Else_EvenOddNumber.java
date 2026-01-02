package com.darshan.javapracticeprogram;

import java.util.Scanner;

public class If_Else_EvenOddNumber {

	public static void main(String args[]) {
		
		Scanner sc =new Scanner(System.in);
		
		int num = 0;
		System.out.print("Enter the Number :");
		num = sc.nextInt();
		
		if(num%2==0) {
			System.out.println(num+" is Even Number");
		}
		else {
			System.out.println(num+" is Odd Number");
		}
	}
}
