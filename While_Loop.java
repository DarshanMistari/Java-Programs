package com.darshan.javapracticeprogram;

import java.util.Scanner;

public class While_Loop {
	
	public static void main(String arg[]) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("Enter the Any Number :");
			int num= sc.nextInt();
			if(num < 0) {
				System.out.println("Enter the Postive Number Only.\n");
			}
			else {
				System.out.println("Good It is Positive Number :"+num);
				break;
			}
		}
		
	}

}
