package com.darshan.javapracticeprogram;

public class Method_Overloding {
	
	public void add(int a , int b) {
		int c= a + b ;
		System.out.println("Addition :"+c);
	}
	
	public void add(float a ,float b) {
		float c= a + b;
		System.out.println("Addition :"+c);
		
	}

	public static void main(String args[]) {
		Method_Overloding m = new Method_Overloding();
		m.add(15, 20);
		m.add(22, 34);
	}
}
