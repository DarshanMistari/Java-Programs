package com.darshan.javapracticeprogram;

public class ConstructorProgram {
	
	//	Default Constructor are 
	ConstructorProgram(){ 	// constructor name and Class name are Same.
		System.out.println("Hi I am Darshan Mistari");
	}
	
//	Parameterize Constructor
	ConstructorProgram(int a, int b){
		System.out.println("Addition :"+(a+b));
	}

	public static void main(String args[]) {
		
		ConstructorProgram con = new ConstructorProgram();  //Default Constructor call
		
		ConstructorProgram con1 = new ConstructorProgram(10,20); // Parameterize Constructor Call we can pass parameter
		
	}
}
