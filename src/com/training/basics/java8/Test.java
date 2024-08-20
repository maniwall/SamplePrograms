package com.training.basics.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test implements FunctionalInterfaceDemo1 {

	public static void main(String[] args) {

		/* FunctionalInterfaceDemo1 demo1 = new FunctionalInterfaceDemo1() {
			@Override
			public int sum(int a, int b) {
				return a + b;
				// return a+b;
			}
		}; 

		demo1.sum(10, 15); 

		// (parameters) -> expression

		FunctionalInterfaceDemo1 addOperation = (a, b) -> {
			return a + b;
		};
		System.out.println("Sum result :: " + addOperation.sum(10, 15));

		Runnable runner = new Runnable() {

			@Override
			public void run() {
				System.out.println("Comming from runner method!!");

			}
		};
		runner.run();*/

		Runnable runnerLam = () -> System.out.println("Comming from lambda method!!");
		runnerLam.run();

		SampleInterface demo2 = new SampleInterface() {

			@Override
			public int sum2(int a, int b) {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public int sum1(int a, int b) {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public int sum(int a, int b) {
				// TODO Auto-generated method stub
				return 0;
			}
		};

		// (int a, int b) -> a + b;

		System.out.println();
		Predicate<Integer> predicate = (a) -> {
			return (a > 5);
		};
		System.out.println("For 10 value :: " + predicate.test(10));
		System.out.println("For 2 value :: " + predicate.test(2));

		IntFunction<String> intFunction = (value) -> {
			if (value == 1) {
				return "ONE";
			}
			return "not Valid value!!";
		};

		System.out.println();
		System.out.println(intFunction.apply(1));

		System.out.println(intFunction.apply(10));

		System.out.println();

		List<Integer> numbers = new ArrayList<>();

		numbers.add(10);
		numbers.add(15);
		numbers.add(20);
		numbers.add(25);

		Iterator<Integer> it = numbers.iterator();
		while (it.hasNext()) {
			System.out.println("Iterator list value :: " + it.next());
		}

		/*
		 * Consumer<Integer> consumer = new Consumer<Integer>() {
		 * 
		 * @Override public void accept(Integer t) {
		 * 
		 * System.out.println("From consumer :: " + t); } };
		 */

		// (parameters) -> expression;

		Consumer<List<Integer>> consumer = (List<Integer> numbers1) -> System.out
				.println("From consumer :: " + numbers1);
		Consumer<String> consumer1;

		for (Integer number : numbers) {
			System.out.println(number);
		}

		numbers.forEach(number -> System.out.println("From consumer :: " + number));

	}

	public int sum10(int a, int b) {
		return a + b;
	}

	@Override
	public int sum(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int add(int a, int b) {
		System.out.println("a ::" + a);
		System.out.println("b ::" + b);
		return a * b;
	}
}

/**
 * Functional Interface Default Methods lamda Expressions Stream API Date API
 * Internal Memory management - metaspace Method Reference
 * 
 */
