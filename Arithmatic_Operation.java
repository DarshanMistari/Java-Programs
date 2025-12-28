
package com.darshan.javapracticeprogram;

import java.util.Scanner;

public class Arithmatic_Operation {
	
	public static void main(String args[]) {
	
		Scanner sc = new Scanner(System.in);
		
		int numOne = 0;
		int numTwo = 0;
		int total= 0;
		int operation = 0;
		System.out.println("*** Arithmatic Opration ***");
		
		System.out.println("1.Addition \n2.Substraction \n3.Multiplication \n4.Division \n5.Modules");
		
		System.out.println(" Please Select the Operation :");
		
		operation = sc.nextInt();
		
		System.out.println("Enter First Numbers:");
		numOne = sc.nextInt();
		
		System.out.println("Enter Second Numbers:");
		numTwo = sc.nextInt();
		
		
		switch(operation) {
		case 1:
			total = numOne + numTwo;
			System.out.println("Addition is :"+total);
			break;
			
		case 2:
			total = numOne - numTwo;
			System.out.println("Substraction is :"+total);
			break;
			
		case 3:
			total = numOne * numTwo;
			System.out.println("Multiplication is :"+total);
			break;
			
		case 4:
			total = numOne / numTwo;
			System.out.println("Division is "+total);
			break;
			
		case 5:
			total = numOne % numTwo;
			System.out.println("Modules is :"+total);
			break;
			
			default :
				System.out.println("You are Enter Invalide Number.\n Please Try Against.");
				break;
			
			
		}
		
	}

}
