package com.darshan.javapracticeprogram;

import java.util.Scanner;

public class OTP_Generate_Program {

	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		
		int otp = 0;
		otp = (int) (Math.random() * 1000000);
		
		System.out.println("Your OTP is :"+otp);
		
		System.out.print("Enter your OTP :");
		int userOtp = sc.nextInt();
		
		if(otp == userOtp) {
			System.out.print("Login Successfuly.");
		}else {
			System.out.println("Login Fails.");
		}
	}
}
