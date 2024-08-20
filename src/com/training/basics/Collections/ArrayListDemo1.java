package com.training.basics.Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo1 {

	public static void main(String[] args) {

		List<String> values = new ArrayList<>();
		values.add("test1");
		values.add("test2");
		values.add("test3");
		values.add("test4");

		values.add(0, "test5");

		System.out.println(values.toString());

		
		
	}

	
}
