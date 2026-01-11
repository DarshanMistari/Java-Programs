package com.darshan.abstraction;

import java.util.Scanner;

public class StudentMain {
	StudentModel studentModel = new StudentModel();
	
	public void setStudent() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Student Data Abtraction.\n");
		System.out.print("Enter the Student ID :");
		studentModel.setStudId(sc.nextInt());
		
		System.out.print("Enter the Student Name :");
		studentModel.setStudName(sc.next());
		
		System.out.print("Enter Student Fees :");
		studentModel.setStudFees(sc.next());
		
		System.out.print("Enter the Student Birthdate :");
		studentModel.setStudbirth_date(sc.next());
		
		System.out.print("Enter the Student Mobile Number :");
		studentModel.setStudMobileNumber(sc.next());
		System.out.println("===================================================");
	}
	
	public void getStudent() {
		System.out.println("Student ID            :"+studentModel.getStudId());
		System.out.println("Student Name          :"+studentModel.getStudName());
		System.out.println("Student Fees          :"+studentModel.getStudFees());
		System.out.println("Student Birthdate     :"+studentModel.getStudbirth_date());
		System.out.println("Student Mobile Number :"+studentModel.getStudMobileNumber());
	}
	
	public static void main(String args[]) {
		
		StudentMain studentMain = new StudentMain();
		studentMain.setStudent();
		studentMain.getStudent();
		
	}

}
