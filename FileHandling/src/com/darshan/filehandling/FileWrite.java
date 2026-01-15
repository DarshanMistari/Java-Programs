package com.darshan.filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {


	public static void main(String args[]) {
		 try {
			 FileWriter fw = new FileWriter("D:\\Java\\File Handling\\Darshan.txt",true);
			 fw.write("Hello Everyone, We are learning File Handling in Java.\n");
			 fw.write("I am Darshan From Shahada.\n");
			 fw.flush(); // To save the Data in File.
			 
			 
			 
			 System.out.println("Data Stored inside the File.");
		 }catch(IOException e) {
			 e.printStackTrace();
		 }
	}
}
