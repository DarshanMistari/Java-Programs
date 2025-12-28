package com.darshan.javapracticeprogram;

public class AdditionMethodProgram {
	
	
	
	void Addition(int a, int b) { // Parameterize Method
		int c = a + b ;  		 //variable are create inside the method, this variable also called local variable
		System.out.println("Addition :"+c);
	}

	public static void main(String ars[]) {
		
		AdditionMethodProgram add = new AdditionMethodProgram();
		add.Addition(10, 20);
	}
}
