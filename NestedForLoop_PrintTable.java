package com.darshan.javapracticeprogram;

import java.util.Scanner;

public class NestedForLoop_PrintTable {
	
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter Table Number :");
		int num = sc.nextInt();
		
		int i=1;
		
		for(i=1; i<=10; i++) {
			
			System.out.println(num * i);
		}
		System.out.println(" ");
	}
}
