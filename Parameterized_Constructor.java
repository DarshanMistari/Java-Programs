package com.darshan.javapracticeprogram;

public class Parameterized_Constructor {
	int id;
	String empName;
	double salary;
	String role;
	
	public Parameterized_Constructor(int id, String empName,double salary, String role) {
		this.id = id;
		this.empName = empName;
		this.salary = salary;
		this.role = role;
	}
	
//	Copy Constructor
	Parameterized_Constructor(Parameterized_Constructor par) {
		this.id = par.id;
		this.empName = par.empName;
		this.salary = par.salary;
		this.role = par.role;
	}
	
	void display() {
		System.out.println("Employee Id :"+id);
		System.out.println("Employee Name :"+empName);
		System.out.println("Employee Salary :"+salary);
		System.out.println("Employee Role :"+role);
	}
	public static void main(String agrs[]) {
		
		Parameterized_Constructor par = new Parameterized_Constructor(1,"Darshan Mistari",50000.00,"Java Developer");
		par.display();
		
		System.out.println("============================================================================");
//		Copy Constructor
		System.out.println("Copy Constructor :\n");
		Parameterized_Constructor p1 = new Parameterized_Constructor(par);
		p1.display();
	}
}
