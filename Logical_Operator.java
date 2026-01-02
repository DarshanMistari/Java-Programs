package com.darshan.javapracticeprogram;

import java.util.Scanner;

public class Logical_Operator {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int numOne = 0;
		int numTwo = 0;
		
		System.out.println("Enter the First Number :");
		numOne = sc.nextInt();
		
		System.out.println("Enter the Second Number :");
		numTwo = sc.nextInt();
		
		System.out.println("Logical AND && Operators ");

		if(numOne >= numTwo && numOne != numTwo) {
			System.out.println("Both Condition are True,Return True :");
			System.out.print(numOne >= numTwo && numOne != numTwo);
		}
		else {
			System.out.println("Both Conditon are not True, Return False :");
			System.out.print(numOne >= numTwo && numOne != numTwo);
		}
		
		System.out.println("\n\nLogical OR || Operators ");
		if(numOne <= numTwo || numOne >= numTwo ) {
			System.out.println("\nOnly one Condition are True, Return True :");
			System.out.print(numOne <= numTwo || numOne >= numTwo);
		}
		else {
			System.out.println("Both Conditon are False,Return False :");
			System.out.print(numOne <= numTwo || numOne >= numTwo);
		}
		
	}

}
