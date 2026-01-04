package com.darshan.javapracticeprogram;

public class Method_Overriding_Employee {
	
	 void calculateSalary() {
		int hourslyRate = 150;
		int hours = 8;
		int dailySalary = hourslyRate * hours;
		int monthlySalary = dailySalary * 30;
		System.out.println("Monthly Salary :"+monthlySalary);
	}
	
}
