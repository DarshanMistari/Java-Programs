package com.darshan.javapracticeprogram;

public class continue_Statement {

	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) {
			if(i == 3) {
				continue;
			}
			System.out.println(i+" Java Programming Lang.");
		}
	}

}
