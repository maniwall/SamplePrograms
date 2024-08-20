package com.training.basics.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Consumer;

import com.training.basics.Employee;

public class ListDemo {

	public static void main(String[] args) {

		int value = 10;

		List<String> empNames = new ArrayList(); // 16

		empNames.add("Employee1"); // 0
		empNames.add("Employee2"); // 1
		empNames.add("Employee3"); // 2
		empNames.add("Employee2");

		// empNames.remove(2);

		/*
		 * List emps = new ArrayList(10); emps.add(10); emps.add("Test");
		 * 
		 * int value0 = (int) emps.get(0); int value1 = (int) emps.get(1);
		 * System.out.println(value1);
		 */

		List<Integer> empcapacityNames = new ArrayList(10);
		empcapacityNames.add(10);
		empcapacityNames.add(1, 15);
		empcapacityNames.addAll(2, Arrays.asList(20, 15, 16));

		System.out.println("using JAVA8 For Each");

		empcapacityNames.forEach(new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {
				System.out.println(t);
			}
		});

		// empcapacityNames.remove(2);
		// Integer receviedValue = empcapacityNames.get(2);
		// System.out.println(receviedValue);

		// forloop
		// for each loop
		// while loop
		// iterator()

		for (Integer currentvalue : empcapacityNames) {
			if (currentvalue == 15) {
				System.out.println("currentvalue ::" + currentvalue);
			} else {
				System.out.println("currentvalue ::" + currentvalue * 10);
			}
			// logic store DB
		}

		Iterator<Integer> values = empcapacityNames.iterator();
		System.out.println(values);

		while (values.hasNext()) {
			System.out.println(values.next());
		}

		String[] strArray1 = new String[10]; // 15
		List<String> empNameswithArray = new ArrayList(Arrays.asList(strArray1));

		String[] newstrArray = new String[15];

		List<Employee> emps = new ArrayList<>();
		Iterator<Employee> empsIt = emps.iterator();

		System.out.println();

		String[] strArray = { "One", "Two", "Three" };
		List<String> list = Arrays.asList(strArray);
		// strArray[3] = "Four";
		System.out.println(list.toString());

		List<String> newList = new ArrayList(list);
		System.out.println(newList.toString());

		// Convert List into Array

		List<Integer> linkedList = new LinkedList<>();

		linkedList.add(10);
		linkedList.add(15);
		linkedList.add(20);
		linkedList.add(20);
		linkedList.add(20);
		linkedList.add(20);

		System.out.println("Printing LL values");
		System.out.println(linkedList.toString());

		System.out.println("Printing Set values");
		Set<Integer> setValues = new HashSet<>();
		setValues.add(10);
		setValues.add(20);
		setValues.add(10);
		setValues.add(10);
		System.out.println(setValues.toString());

		Set<Integer> treeSetValues = new TreeSet(setValues);
		System.out.println("Printing TreeSet values");
		System.out.println(treeSetValues.toString());

		Iterator<Integer> setIt = treeSetValues.iterator();

		while (setIt.hasNext()) {
			System.out.println(setIt.next());
		}
	}

	public void sortEmployees() {

		List<Employee> emps = new ArrayList<>();
		Employee emp1 = new Employee(103, "TestName3", "TestAddress", "12434656", 'M');
		Employee emp2 = new Employee(106, "TestName6", "TestAddress", "12434656", 'M');
		Employee emp3 = new Employee(102, "TestName2", "TestAddress", "12434656", 'M');
		Employee emp4 = new Employee(100, "TestName0", "TestAddress", "12434656", 'M');

		emps.add(emp1);
		emps.add(emp2);
		emps.add(emp3);
		emps.add(emp4);

		Collections.sort(emps);

		Collections.sort(emps, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}
		});

		Collections.sort(emps, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return o1.getAddress().compareTo(o2.getAddress());
			}
		});

		Collections.sort(emps, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return o1.getMobileNum().compareTo(o2.getMobileNum());
			}
		});
	}

}
