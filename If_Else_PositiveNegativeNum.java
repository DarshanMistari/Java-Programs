package com.darshan.javapracticeprogram;

import java.util.Scanner;

public class If_Else_PositiveNegativeNum {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int num =0;
		System.out.print("Enter the Number :");
		num = sc.nextInt();
		
		if(num > 0) {
			System.out.println(num+" is Positive Number");
		} 
		else {
			System.out.println(num+" is Negative Number");
		}
	}

}
