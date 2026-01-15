package com.darshan.filehandling;

import java.io.File;
import java.io.IOException;

public class CreateFile {
	
	public static void main(String args[]) {
		
		File file = new File("D:\\Java\\File Handling\\Darshan.txt");
		
		try {
			file.createNewFile(); //This method used to create the file.
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(" File Created.");
	}

}
