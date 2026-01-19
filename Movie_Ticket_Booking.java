package com.darshan.javapracticeprogram;

import java.util.Scanner;

public class Movie_Ticket_Booking {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int qty = 0;
		int total = 0;
		String movie="";
		double discount = 0.0;
		double finalTotal = 0.0;
		
		do {

			System.out.println("\nWelcome to Movie Booking System\n");
			System.out.println("1.Dhurandhar - 350 Rs");
			System.out.println("2.12th Fail - 250 Rs");
			System.out.println("3.Saiyara - 150 Rs");
			System.out.println("4.Kantara - 100 Rs");
			
			System.out.println("\nEnter Your Choice :");
			int choice = sc.nextInt();
			
			if(choice == 1) {
				System.out.println("Enter the Quantity of Tickets:");
				qty = sc.nextInt();
				movie="Dhurandhar";
				total = qty *  350;
				
				if(total > 2000) {
					discount = total * 0.10;
					finalTotal = total - discount;
				}
				else if(total > 1000 && total <2000) {
					discount = total * 0.05;
					finalTotal = total - discount;
					}
				}
			else if(choice == 2) {
				System.out.println("Enter the Quantity of Ticket");
				qty = sc.nextInt();
				movie="12th Fail";
				total = qty * 250;
				
				if(total > 2000) {
					discount = total * 0.10;
					finalTotal = total - discount;
				}else if(total >1000 && total <2000){
					discount = total * 0.05;
					finalTotal = total - discount;
				}
				
			}
			else if(choice == 3) {
				System.out.println("Enter the Quantity of Ticket");
				qty = sc.nextInt();
				movie="Saiyara";
				total = qty * 150;
				
				if(total > 2000) {
					discount = total * 0.10;
					finalTotal = total - discount;
				}else if(total >1000 && total <2000){
					discount = total * 0.05;
					finalTotal = total - discount;
				}
				
			}
			else if(choice == 4) {
				System.out.println("Enter the Quantity of Ticket");
				qty = sc.nextInt();
				movie="Kantara";
				total = qty * 100;
				
				if(total > 2000) {
					discount = total * 0.10;
					finalTotal = total - discount;
				}else if(total >1000 && total <2000){
					discount = total * 0.05;
					finalTotal = total - discount;
				}
				
			}
			else if(choice == 5) {
				System.out.println("Thank you for using Movie App.");
				break;
			}
			else{
				System.out.println("Invalide Choice.");
				break;
				}
			
			System.out.println("Movie Ticket Booked SuccessFully...");
			System.out.println("Movie Name :"+movie);
			System.out.println("Total Quantity : "+qty);
			System.out.println("Discount :"+discount);
			System.out.println("Total Bill :"+finalTotal);
			System.out.println("Thank you...");
			}while(true);
			
			
	}

}
