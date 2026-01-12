package com.darshan.functionalinterface;

public class Functional_Interface {
	
//	public void login() {
//		System.out.println("Login Successfully..");
//	}

	public static void main(String args[]) {
		
//		Functional_Interface funInt = new Functional_Interface();
//		funInt.login();
		
		Test t =()->{
			System.out.println("Login Sucessfully.");
		};
		
		t.login();
	}
}
