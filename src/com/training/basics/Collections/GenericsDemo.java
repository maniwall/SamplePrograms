package com.training.basics.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class GenericsDemo {

	GenericsDemo() {

	}

	public static void main(String[] args) {

		List<Object> values = new ArrayList(); // List values = new ArrayList();
		values.add(10);
		values.add("10");

		// values.add("Test"); // classCastException

		DemoClass<Integer> demo = new DemoClass<Integer>();
		demo.setValue(10);

		DemoClass<String> demoString = new DemoClass<String>();
		DemoClass<Integer> numbers;
		demoString.setValue("Test");

		demo.add(10);
		demo.getValue("String");

		Dimension<Integer, String> dimension = new Dimension<Integer, String>(10, 10, "Triangle");

		Collection<?> coll = new ArrayList<String>();

		List<? extends Number> list = new ArrayList<Long>();

		List<? super Number> value = new ArrayList<>();

		// Interface
		GenericsDemo genericsDemo = new GenericsDemo();
		String sumValue = genericsDemo.add("123", "345");
		System.out.println(value);

	}

	public <T> T add(T value1, T value2) {
		T t = (T) (value1.toString() + value2.toString());
		return t;
	}
	
	/*
	 * T – Type E – Element K – Key N – Number V – Value
	 */

}
