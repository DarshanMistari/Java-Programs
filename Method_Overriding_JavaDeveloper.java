package com.darshan.javapracticeprogram;

public class Method_Overriding_JavaDeveloper extends Method_Overriding_Employee{
	
	void calculateSalary() {
//		super.calculateSalary();
		int hours = 8;
		int hourslyRate = 400;
		int dailySalary = hourslyRate * hours;
		int monthlySalary = dailySalary * 30;
		
		System.out.println("Java Developer Monthly Salary :"+monthlySalary);
	}
	
public static void main(String args[]) {
	
	Method_Overriding_JavaDeveloper over = new Method_Overriding_JavaDeveloper();
	over.calculateSalary();
		
	}

}
