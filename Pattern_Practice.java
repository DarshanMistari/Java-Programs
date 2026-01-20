package com.darshan.javapracticeprogram;

public class Pattern_Practice {
	
	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) {
			for(char j='A'; j<='F'; j++) {
				
				if(j == 'D') {
					System.out.print(" * ");
				}
				
				System.out.print(" "+j);
			}
			
			System.out.println(" ");
		}
	}

}
