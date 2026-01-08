package com.darshan.javapracticeprogram;

public class SquarePattern {

	public static void main(String args[]) {
		
		for(int i=1; i<=5; i++) {		   //Outer for loop print the Row
			
			for(int j=1; j<=5; j++) {		//Inner for loop print the Column
				System.out.print("* ");
			}
			System.out.println(" ");
		}
	}
}
