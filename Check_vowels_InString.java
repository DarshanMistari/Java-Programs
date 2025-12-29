package com.darshan.javapracticeprogram;

public class Check_vowels_InString {
	
	public static void main(String args[]) {
		String name = "Everything is possible just belive in yourself";
		
		char [] c = name.toCharArray();
		
		int count=0;
		for(int i=0; i < c.length; i++) {
			if(c[i]=='a' || c[i]=='e'|| c[i]=='i'|| c[i]=='o' || c[i]=='u') {
				count++;
				System.out.println("Vowel :"+c[i]+" Present at Index "+i);
			}
		}
		System.out.println("Total vowel in String :"+count);
	}

}
