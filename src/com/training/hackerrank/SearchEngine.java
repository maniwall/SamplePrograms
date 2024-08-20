package com.training.hackerrank;

import java.util.*;
import java.util.stream.Collectors;

public class SearchEngine {

	public static void main(String[] args) {
		List<String> products = new ArrayList<>();

		products.add("camera");
		products.add("charger");
		products.add("mobile");
		products.add("laptop");
		products.add("keyboard");
		products.add("mouse");
		products.add("calculator");

		Scanner sc = new Scanner(System.in); // cam
		
		System.out.println("Enter String to search ::");
		String userInputValue = sc.next();

		List<String> resultProducts = fetchResults(products, userInputValue);

		for (String product : resultProducts) {
			System.out.println(product);
		}

	}

	private static List<String> fetchResults(List<String> products, String userInputValue) {

		int l = userInputValue.length();
		List<String> result = new ArrayList<>();

		for (int i = 0; i < l; i++) {
			String temp = userInputValue.substring(0, i + 1);
			result.add(temp);
			List<String> tempResult = products.stream().filter(product -> product.startsWith(temp)).sorted().limit(3)
					.collect(Collectors.toList());

			result.addAll(tempResult);
			result.add("-------------------");

		}

		return result;
	}

}
