package com.training.basics.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.training.basics.Employee;

public class StreamDemo {

	public static void main(String[] args) {
		// List<Int[]> list = new ArrayList<>(Arrays.asList(intArray));

		Integer intArray[] = { 20, 10, 12, 1, 5, 6, 15 }; // * 2
		List<Integer> numbers = Arrays.asList(intArray);
		Stream<Integer> numbersStream = numbers.stream();
		
		Predicate<Integer> predicate = t -> t % 2 == 0;
		
		List<Integer> evenNumbers = numbersStream.filter(predicate).collect(Collectors.toList());
		evenNumbers.forEach(t -> System.out.println("current even :: " +t));
		
		Optional<Integer> result = evenNumbers.stream().filter(predicate).reduce((t, u) -> {return t + u;}); //30, 12
		System.out.println(result.get());
		
		List<Employee> employees = new ArrayList<>();
		// Employee emp = Employee :: new;
		// employees.add(emp);
		
		employees.add(new Employee(100, "Employee1", "Address1", "1111111",'M'));
		employees.add(new Employee(101, "Employee2", "Address2", "1111111",'M'));
		employees.add(new Employee(102, "Employee3", "Address3", "1111111",'F'));
		employees.add(new Employee(103, "Employee4", "Address4", "1111111",'F'));
		
		
		/*
		 * Employee emp1 = employees.get(1); char ch = emp1.getGender(); boolean result
		 * = ch == 'F';
		 */
		
		
		
		employees.stream().map(emp -> emp.getId() * 2).forEach(System.out::println);
		
		
		List<Employee> fEmps = employees.stream().filter(emp -> emp.getGender() == 'F').collect(Collectors.toList());
		List<Employee> mEmps = employees.stream().filter(emp -> emp.getGender() == 'M').collect(Collectors.toList());
		fEmps.forEach(emp -> System.out.println(emp));
		mEmps.forEach(emp -> System.out.println(emp));
		
		

		/*
		 * Function<Integer, Integer> function = new Function<Integer, Integer>() {
		 * 
		 * @Override public Integer apply(Integer t) { // TODO Auto-generated method
		 * stub return t * 2; } };
		 */

		// Intermediate Stream Type
		// numbersStream.map(number -> number * 2).forEach(t -> System.out.println(t));

		// Terminal Stream Type
		// mapStream.forEach(t -> System.out.println(t));

	}

}
