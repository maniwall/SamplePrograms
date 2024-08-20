package com.training.hackerrank;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class StringCharCountAndShowResultInString {

	public static void main(String[] args) {

		String input = "abbbbb";
		char[] inputValues = input.toCharArray();
		HashMap<Character, Integer> map = new HashMap<>();

		for (char ch : inputValues) {
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		Iterator<Entry<Character, Integer>> it = map.entrySet().iterator();
		
		while(it.hasNext()) {
			Entry<Character, Integer> currentEntry = it.next();
			sb.append(currentEntry.getKey()).append(currentEntry.getValue());
		}
		
		System.out.println("Result :: " + sb);
	}

}
