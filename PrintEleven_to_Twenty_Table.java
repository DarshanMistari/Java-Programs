package com.darshan.javapracticeprogram;

public class PrintEleven_to_Twenty_Table {
	
	public static void main(String args[]) {
		
		int i;
		
		for( i=1; i<=10; i++) {
			
			for(int j=11; j<=20; j++) {
				
				System.out.print(j*i+"\t");
			}
			System.out.println(" ");
		}
	}

}
