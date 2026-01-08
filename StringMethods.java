package com.darshan.javapracticeprogram;

public class StringMethods {
	
	public static void main(String args[]) {
		
		String quote = "Everything is possible just belive in yourself.";
		
		String name = "We learn String Methods in java";

		System.out.println("First String  :"+quote);
		System.out.println("\nSecond String  :"+name);
		
		System.out.println("\nFirst String Startwith E   :"+quote.startsWith("E")); // quote Start with E Character or not. True or False
		
		System.out.println("\nFirst String Endwith f   :"+quote.endsWith("f")); // quote End with f Character or not. True or False
		
		System.out.println("\nFirst String Contain Java  :"+name.contains("java")); // String is contain java or not. True or False
		
		System.out.println("\nFirst String UpperCase  :"+quote.toUpperCase()); // quote is convert to UpperCase.
		
		System.out.println("\nFirst String LowerCase  :"+quote.toLowerCase()); // quote is convert to lowerCase.
		
		System.out.println("\nFirst String Length  :"+quote.length()); // length of quote String is return.
		
		System.out.println("\nFirst String & second string are equals  :"+quote.equals(name)); // quote is equals to name String or not. True or False
		
		System.out.println("\nSecond String are Blank  :"+name.isBlank()); // Name is Blank or Not this method does not read space. true of False
		
		System.out.println("\nSecond String are Empty count space  :"+name.isEmpty()); // This method will count space this method check String is empty of not. True False
		
		System.out.println("\nSecond String 10 num Which Char Present  :"+name.charAt(10)); //This method used to 10 num which char present
		
		System.out.println("\n"+name.concat(", Hi am Darshan.")); 
		
		System.out.println("\nFirst String & Second String are Compare :"+ quote.compareTo(name)); 
		// This method are Compare the Both String. if first String greater than second string to return -value
		// second String is greater then first String is return +value
		
		System.out.println(name.replace("We learn String Methods in java", "\nHi am Darshan.")); // this method are replace first String with second string
	}

}
