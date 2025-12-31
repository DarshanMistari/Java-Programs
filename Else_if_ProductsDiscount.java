package com.darshan.javapracticeprogram;

import java.util.Scanner;

public class Else_if_ProductsDiscount {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		double price;
		double discount;
		double finalAmount;
		
		System.out.println("Entr the Product Price :");
		price = sc.nextDouble();
		
		if(price > 7000) {
			System.out.println("You will get 40% Discount");
			discount = price * 0.40;
			System.out.println("You hvae Save the "+discount+"Rs");
			finalAmount = price - discount;
			System.out.println("You have Pay Only"+finalAmount+"Rs");
		}
		else if(price >= 5000 && price < 7000) {
			System.out.println("You will get 30% Discount.");
			discount = price * 0.30;
			System.out.println("You have Save the "+discount+"Rs");
			finalAmount = price - discount;
			System.out.println("You have Pay Only "+finalAmount+"Rs");
		}
		else if(price >= 4000 && price <=5000 ){
			
			System.out.println("You will get 20% Discount");
			discount = price * 0.20;
			System.out.println("You have Save the "+discount+"Rs");
			finalAmount = price - discount;
			System.out.println("You have Pay Only "+finalAmount+"Rs");
		}
		else {
			System.out.println("You will get 5% Discount");
			discount = price * 0.5;
			System.out.println("You have Save the "+discount+"Rs");
			finalAmount = price - discount;
			System.out.println("You have Pay Only "+finalAmount+"Rs");
		}
		
		
	}
}
