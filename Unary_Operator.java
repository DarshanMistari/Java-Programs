package com.darshan.javapracticeprogram;

import java.util.Scanner;

public class Unary_Operator {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the First Number :");
		int numOne = sc.nextInt();
		
		System.out.println("Orignal Value :"+numOne);
		System.out.println("PreIncement Statement,Firstly Increment After Print\n");
		System.out.println("PreIncrement Statement ++numOne :"+ ++numOne);
		
		System.out.println("\n\nEnter the Second Number :");
		int numTwo = sc.nextInt();
		
		System.out.println("PostIncrement Statement Firstly Print Orignal Value, After Increment the Value");
		System.out.println("numOne Orinal Value :"+ numTwo++);
		System.out.println("numOne value After Increment "+numTwo);
		
		
	}

}
