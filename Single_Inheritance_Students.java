package com.darshan.javapracticeprogram;
public class Single_Inheritance_Students {
	
	int id;
	String name;
	String email;
	
	public Single_Inheritance_Students(int id, String name,String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}
	
	void display() {
		System.out.println("Student id :"+id);
		System.out.println("Student Name :"+name);
		System.out.println("Student email :"+email);
		System.out.println("===========================================================");
	}
	
	public static void main(String args[]) {
		Single_Inheritance_Students stud = new Single_Inheritance_Students(1,"Darshan Mistari","darshan@gmail.com");
		stud.display();
		
		Single_Inheritance_Course c1 = new Single_Inheritance_Course("Java Fullstack","10000","3 Months");
		c1.display();
		
		
	}

}
