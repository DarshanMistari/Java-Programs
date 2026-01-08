package com.darshan.javapracticeprogram;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String fruits;
		
		System.out.println("Enter the Favorite Fruits:");
		fruits = sc.next();
		
		switch(fruits) {
		case "Mango":
			System.out.println("My Favorite Fruits is Mango");
			break;
			
		case "Grapes":
			System.out.println("My Favorite Fruits is Grapes");
			break;
			
		case "WaterMelon":
			System.out.println("My Favorite Fruits is WaterMelo");
			break;
			
			default:
				System.out.println("Invalide Fruites Name.");
				break;
			
			
			
		}
	} 
}
