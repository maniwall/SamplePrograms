package com.training.basics.exceptions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.training.basics.Employee;

public class ExceptionHandlingDemo {

	// throw
	// throws

	String strValue = "";

	public void demo() {

		int value = 0;
		String str = "";
		try {

			// File Reader
			// DB Connections - connection.close()
			// Connections

			value = 100 / 0;

			FileReader reader = new FileReader(new File("test.txt")); // Exception
			// logic

			// readFile();
			// test();

		} catch (ArithmeticException | IOException e) {
			
		}
		
		/* catch (ArithmeticException e) {
			System.out.println(e);
			value = 150;
		} catch (FileNotFoundException e) {
			System.out.println(e);
			value = 150;
		} catch (Exception e) {
			// TODO: handle exception
		} */

		finally {
			// closing operation
// connection.close()
			System.out.println("coming from finally block!!");
		}

		// sum(value);
		System.out.println(value);
	}

	public void readFile() throws IOException {

		BufferedReader br = null;

		try {
			FileReader reader = new FileReader(new File("test.txt"));
			br = new BufferedReader(reader);

			System.out.println(br.readLine());

		} finally {
			System.out.println("Finally block");
			br.close();
		}

	}
	
	public void readFileWithResource() throws IOException { // JAVA 7

		// BufferedReader br = null;

		try (BufferedReader br = new BufferedReader(new FileReader(new File("test.txt")))) {
			// FileReader reader = new FileReader(new File("test.txt"));
			// br = new BufferedReader(reader);

			System.out.println(br.readLine());

		} 
	}
	
	
	

	public void test() throws FileNotFoundException {

		String str = "";

		if (str.isEmpty()) {
			throw new FileNotFoundException();
		}
	}

	public void testMethodCaller() throws FileNotFoundException {
		test();
	}

	public void anotherMethodCaller() {
		try {
			testMethodCaller();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		ExceptionHandlingDemo exceptionDemo = new ExceptionHandlingDemo();
		// exceptionDemo.anotherMethodCaller();

		exceptionDemo.checkEmployeeAge(15);

	}

	private void checkEmployeeAge(int age) throws InvalidAgeException {

		if (age < 20) {
			System.out.println("In-Valid Age!!");
			throw new InvalidAgeException(age + " is not a valid age!!");
		} else {
			System.out.println("Valid Age!!");
		}
	}

}
