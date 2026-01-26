package com.darshan.javapracticeprogram;

import java.io.File;
import java.io.IOException;

public class FileHandling_CreateFile {
	
	public static void main(String args[]) {
		
		File file = new File("D:\\Java\\File Handling\\Employee");
		
		try {
			file.createNewFile();
			System.out.println("File is Created");
		}catch(IOException e) {
			System.out.println("File is Not Created.");
		}
	}

}
