package com.darshan.javapracticeprogram;

public class Constructor_Chaining {
	
	
//	Constructor chaining is calling one Constructor from another constructor is called Constructor Chaining.
//	this() => it is used to call current class constructor explicitly 
//	this() => can be used in only constructor at first line only.
	
	public Constructor_Chaining() {
		this("Darshan");
		System.out.println(" O Prameterize Constructor");
		System.out.println("=================================================================\n");
	}
	
	public Constructor_Chaining(String name) {
		this("darshan@gmail.com","12345");
		System.out.println("One Prametrize Constructor, Name :"+name);
		System.out.println("=================================================================\n");

	}
	
	public Constructor_Chaining(String email, String password) {
		System.out.println("\nTwo Parametrize Constructor, Email & Password :'"+email+"'+ '"+password+"'");
		System.out.println("=================================================================\n");

	}
	public static void main(String args[]) {
		Constructor_Chaining p1 = new Constructor_Chaining();
	}

}
