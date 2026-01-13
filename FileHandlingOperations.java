package com.darshan.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlingOperations {

	public void WriteDataIntoUserFile() {
		Users user1 = new Users(1, "Darshan Mistari", "Darshan@12");
		Users user2 = new Users(2, "Ritesh Badgujar", "Ritesh@12");
		Users user3 = new Users(3, "Jayesh Sonar", "Jayesh@12");
		Users user4 = new Users(4, "Umesh Kuwar", "Umesh@12");
		try {
			FileWriter fw = new FileWriter("D:\\Java\\File Handling\\FileHandlingProject.txt", true);

			fw.write("\n================== User Details ========================");
			fw.write("I\n ID : " + user1.getId());
			fw.write("\n Username : " + user1.getUserName());
			fw.write("\n Password : " + user1.getPassword());

			fw.write("\n================== User Details ========================");
			fw.write("I\n ID : " + user2.getId());
			fw.write("\n Username : " + user2.getUserName());
			fw.write("\n Password : " + user2.getPassword());

			fw.write("\n================== User Details ========================");
			fw.write("I\n ID : " + user3.getId());
			fw.write("\n Username : " + user3.getUserName());
			fw.write("\n Password : " + user3.getPassword());

			fw.write("\n================== User Details ========================");
			fw.write("I\n ID : " + user4.getId());
			fw.write("\n Username : " + user4.getUserName());
			fw.write("\n Password : " + user4.getPassword());

			fw.flush();

			System.out.println("Stored Data inside the File");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void readUserData() {

		try {
			FileReader fr = new FileReader("D:\\Java\\File Handling\\FileHandlingProject.txt");

			int i;

			while ((i = fr.read()) != -1) {
				System.out.print((char) i);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	
	public void deleteUserData() {
		
		File file = new File("D:\\Java\\File Handling\\FileHandlingProject.txt");
		
		if(file.exists()) {  //It will check file is present or not 
			file.delete(); 
			System.out.println("File is Deleted.");
		}
		else {
			System.out.println("File in not Available.");
		}
	}
	
	
	
	
	public static void main(String args[]) {

		FileHandlingOperations fileoperation = new FileHandlingOperations();
//		fileoperation.WriteDataIntoUserFile();
		fileoperation.readUserData();
//		fileoperation.deleteUserData();
	}
}
