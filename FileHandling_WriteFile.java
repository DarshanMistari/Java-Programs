package com.darshan.javapracticeprogram;

import java.io.FileWriter;
import java.io.IOException;

public class FileHandling_WriteFile {

	public static void main(String[] args) {
		
		try {
		FileWriter fw = new FileWriter("D:\\Java\\File Handling\\Employee",true);
		fw.write("Hi Darshan.");
		fw.write("\nToday learn in File Handling File Writer Topics.");
		System.out.println("File is Write.");
		fw.flush();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
