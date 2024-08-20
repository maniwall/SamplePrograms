package com.training.basics.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EmployeeService {

	public List<Employee> loadEmployeesFromDB() {

		List<String> bikeBrands = Arrays.asList("Giant", "Scott", "Trek", "GT");
		bikeBrands.forEach(EmployeeService::doNothingAtAll);

		return IntStream.rangeClosed(1, 10).mapToObj(i -> new Employee(i, "employee" + i, new Random().nextInt(50000)))
				.collect(Collectors.toList());
	}

	private static <T> void doNothingAtAll(String... o) {

		System.out.println(o);
	}

	public static void main(String[] args) {
		EmployeeService es = new EmployeeService();
		es.loadEmployeesFromDB();
	}

}
