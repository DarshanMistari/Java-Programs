package com.darshan.javapracticeprogram;

public class NestedFor_Challenges {
	
	public static void main(String args[]) {
		
		//print same Structure for our Logic 
		// 1 1 1 1 1      1 1 1 1 0
		// 2 2 2 2 2      2 2 2 2 0
		// # # # # #  &   # # # # #
		// 4 4 4 4 4      4 4 4 4 0
		// 5 5 5 5 5      5 5 5 5 0
		
		
		for(int i=1; i<=5; i++) {  // Outer Loop for Row
			
			for(int j=1; j<=5; j++) {
				
				if(i==3) {
					System.out.print("# ");
				}
				else {
					System.out.print(i +" ");
				}
			}
			System.out.println(" ");
			
		}
		
		System.out.println(" ");
		
		for (int i = 1; i <= 5; i++) { // Outer Loop for Row

			for (int j = 1; j <= 5; j++) {

				if (i == 3) {
					System.out.print("# ");
				} else if (j == 5) {
					System.out.print("0 ");
				} else {
					System.out.print(i + " ");
				}
			}
			System.out.println(" ");

		}
	}

}
