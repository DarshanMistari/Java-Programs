package com.darshan.javapracticeprogram;

public class Types_of_Variables {
//	Instance variables : The variable which is created inside the class and outside 
//	the method or Constructor is called instance variable.
//	instance variable scope available through out class.
//  instance variable also know as global variable.
//	the value of instance variable is changing from object to object.	
// the instance variable we can access using object reference
//	Instance variable can be accessible within whole class
	String userName;   // Instance variables
	String email;
	String password;
	
	static String companyName; //for every company name as same
//	static keyword are used to create a variable inside the class and outside the method and constructor is called static keyword.
//	static variable are related to the class.
//	static variable value is common for all objects.
//	static variable we can access directly using class.
	
	
//	Local variable : local variable which are created in the method is called local variable.
//	this : this keyword are used to differentiate local variable and global variable.
	
//	local variables inside the method
void setVariables(String userName,String email,String password) {  
		this.userName = userName;
		this.email = email;
		this.password = password;
	}
	
	 void display() {
//		 we can access static variable in instance method ? Yes
		System.out.println("Company Name :"+companyName);
		
//		can we access instance variable in instance method ? Yes
		System.out.println("UserName :"+userName);
		System.out.println("Email :"+email);
		System.out.println("Password :"+password);	
		System.out.println("===================================================================");
	 }
//	 method define using static keyword
	 static void getCount() {
//		 we can access instance variable in static method ? NO (directly) Yes (indirectly) using object
		 Types_of_Variables var = new Types_of_Variables();
		 System.out.println(var.userName);
		 System.out.println(var.email);
		 System.out.println(var.password);
		 System.out.println("===================================================================");
	 }
	 
	 void method() {
//		 we can  call instance method in another instance method : Yes
		 display();
		 
//		 we can call static method in another instance method : Yes
		 getCount();
	 }
	 
	 
	
	public static void main(String args []) {
		
		Types_of_Variables var = new Types_of_Variables();
		Types_of_Variables.companyName = "DM Services";
		var.setVariables("Darshan", "darshan@gmail.com","12345");
		var.display();
		Types_of_Variables.getCount();
		
	}

}
;