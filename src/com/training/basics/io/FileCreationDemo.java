package com.training.basics.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Scanner;

public class FileCreationDemo {

	public static void main(String[] args) throws IOException {
		
		String content = "Performing Java Read Write Operations";
		
		File file = new File("C:\\Users\\mabo0222\\Data\\Training\\sampletext.txt");
		
		
		File file1 = new File("C:\\Users\\mabo0222\\Data\\Training");
		
		String[] flies = file1.list();
		System.out.println(Arrays.toString(flies));
		
		boolean result = file.createNewFile();
		System.out.println("result :: " + result);
		
		
		System.out.println();
		
		Scanner sc = new Scanner(file);	
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
			// logic implementation
		}
		sc.close();
		
		// OutputStream outputStream = new FileOutputStream(file);
		
		FileWriter writer = new FileWriter(file);
		writer.write(content);
		writer.flush();
		writer.close();
		

	}
}
