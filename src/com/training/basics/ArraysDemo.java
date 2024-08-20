package com.training.basics;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysDemo {

	int value = 10;

	int values[] = { 10, 12, 14, 16, 18, 20, 22 }; // DB * 10

	int[] values1 = { 10, 12, 14, 16 };

	String strArray[] = new String[] { "Name", "FName", "LName" };

	int[][] cordinates = { { 1, 2 }, { 2, 3 } };

	String[] strArray1 = new String[10];

	// int, float, byte, double -> number Datatype

	Number[] numbers = new Number[3];

	/*
	 * public void fillValues() { strArray1[0] = "Name"; strArray1[1] = "FName";
	 * strArray1[2] = "LName"; }
	 */

	public void fillValues() {

		numbers[0] = 12;
		numbers[1] = 12.01;
		numbers[3] = 12;

		float sampleValue = 12;

		Integer[] intArray = { 1, 2, 3, 4 };
		Number[] numArray = intArray;

		if (intArray.getClass().getComponentType() == ((Object) sampleValue).getClass()) {
			numArray[1] = sampleValue; // exception
		}

		Arrays.fill(strArray1, "Test");

		for (String currentValue : strArray1) {

			System.out.println(currentValue);

		}
	}

	public void printSubArrays() {

		int[] subArray1 = Arrays.copyOf(values, values.length / 2);
		System.out.println("subArray1 :: " + Arrays.toString(subArray1));

		int[] subArray2 = Arrays.copyOfRange(values, values.length / 2, values.length);
		System.out.println("subArray2 :: " + Arrays.toString(subArray2));

		int[] copiedArray = Arrays.copyOfRange(values, 0, values.length);
		System.out.println("copiedArray :: " + Arrays.toString(copiedArray));

	}

	public void printValues() {
		System.out.println("int value :: " + value);
		System.out.println("strArray :: " + Arrays.toString(strArray));
		System.out.println("strArray deep :: " + Arrays.deepToString(cordinates));

		System.out.println();

		for (int i = 0; i < strArray.length; i++) {
			System.out.print(strArray[i] + ", ");
		}

		System.out.println();
		System.out.println("For each loop");

		for (int currentValue : values) {

			System.out.println(currentValue * 10);

		}
	}

	public void findMinMaxValues(int[] intputArray) {
		Arrays.sort(intputArray);
		System.out.println("Max number :: " + intputArray[intputArray.length - 1]);
		System.out.println("Min number :: " + intputArray[0]);
	}

	public void sortEmployee(Employee[] employees) {

		System.out.println("unsorted Employees");
		System.out.println(Arrays.toString(employees));

		Comparator comparator = new Comparator<Employee>() {

			@Override
			public int compare(Employee emp1, Employee emp2) {
				// return emp1.getId() - emp2.getId(); // +, -, 0
				return emp1.getName().compareTo(emp2.getName()); 
			}
		};

		System.out.println();
		Arrays.sort(employees, comparator);

		System.out.println("sorted Employees");
		System.out.println(Arrays.toString(employees));
	}

	public void printMultiArrayPrint() {

		System.out.println("Matrix print");
		System.out.println("[");
		System.out.println("]");
	}

	
	/*
	 * ArraysDemo demo = new ArraysDemo(); int[] inputArray = {12, 45, 20, 15, 10,
	 * 5}; // demo.findMinMaxValues(inputArray);
	 * 
	 * 
	 * Employee emp1 = new Employee(103, "TestName3", "TestAddress", "12434656",
	 * 'M'); Employee emp2 = new Employee(106, "TestName6", "TestAddress",
	 * "12434656", 'M'); Employee emp3 = new Employee(102, "TestName2",
	 * "TestAddress", "12434656", 'M'); Employee emp4 = new Employee(100,
	 * "TestName0", "TestAddress", "12434656", 'M');
	 * 
	 * Employee[] emps = new Employee[4]; emps[0] = emp1; emps[1] = emp2; emps[2] =
	 * emp3; emps[3] = emp4;
	 * 
	 * // demo.sortEmployee(emps);
	 * 
	 * demo.printMultiArrayPrint();
	 */
	 

}
