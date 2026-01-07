package com.darshan.javapracticeprogram;

public class Single_Inheritance_Course {
	String courseName;
	String coursePrice;
	String courseDuration;
	
	public Single_Inheritance_Course(String courseName, String coursePrice, String courseDuration) {
		super();
		this.courseName = courseName;
		this.coursePrice = coursePrice;
		this.courseDuration = courseDuration;
	}
	
	public void display() {
		System.out.println("Course Name :"+courseName);
		System.out.println("Course Price :"+coursePrice);
		System.out.println("Couser Duration :"+courseDuration);
	}
}
