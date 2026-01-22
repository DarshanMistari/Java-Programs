package com.darshan.javapracticeprogram;

public class Two_D_Array {
	
	public static void main(String[] args) {
		
		int num[][] = new int[2][2];
		
		num[0][0] = 100;
		num[0][1] = 200;
		num[1][0] = 300;
		num[1][1] = 400;
		
		for(int i=0; i<2; i++) {
			for(int j=0; j<2;j++) {
				System.out.println(num[i][j]);
			}
		}
	}
}
