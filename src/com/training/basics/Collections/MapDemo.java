package com.training.basics.Collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

import com.training.basics.Employee;

public class MapDemo extends Object {

	public static void main(String[] args) {

		Map<Integer, String> students = new HashMap<>();

		students.put(100, "student1"); // current
		students.put(101, "student2");
		students.put(102, "student3");
		students.put(103, "student4");
		
		// students.remove(101);
		
		
		System.out.println("102 key value :: " + students.get(102));
		System.out.println("values :: " + students.values().toString());
		
		Set<Integer> keys = students.keySet();
		System.out.println("keys :: " + keys);
		
		for(Integer currentKey : keys) {
			System.out.println("Key ::  " + currentKey + " value :: " + students.get(currentKey));
		}
		
		System.out.println();
		

		Set<Entry<Integer, String>> entries = students.entrySet();
		Iterator<Entry<Integer, String>> entriesIt = entries.iterator();

		while (entriesIt.hasNext()) {
			Entry<Integer, String> current = entriesIt.next();
			System.out.println("Entry Key ::  " + current.getKey() + " value :: " + current.getValue());

			// Business logic
		}

		System.out.println();
		
		Map<Integer, Employee> employees = new HashMap<>();
		employees.put(1, new Employee(100, "Emp1", "Add1", "111", 'M'));
		employees.put(2, new Employee(101, "Emp2", "Add1", "111", 'M'));
		employees.put(1, new Employee(102, "Emp3", "Add1", "111", 'M'));
		

		Set<Entry<Integer, Employee>>  empEntries = employees.entrySet();
		Iterator<Entry<Integer, Employee>> empEntriesIt = empEntries.iterator();
		
		while (empEntriesIt.hasNext()) {
			Entry<Integer, Employee> current = empEntriesIt.next();
			Employee emp = current.getValue();
			if(emp.getId() == 102) {
				System.out.println("Entry Key ::  " + current.getKey() + " value :: " + current.getValue().toString());
				// empEntriesIt.remove();
			}  
			
			System.out.println("Entry Key ::  " + current.getKey() + " value :: " + current.getValue().toString());
		}
		
		System.out.println("************TreeMap*********");
		
		Map<Integer, String> treeMap = new TreeMap<>();
		
		treeMap.put(100, "Test1");
		treeMap.put(50, "Test50");
		treeMap.put(20, "Test20");
		treeMap.put(150, "Test150");
		
		Set<Entry<Integer, String>> treeMapentries = treeMap.entrySet();
		Iterator<Entry<Integer, String>> treeMapentriesIt = treeMapentries.iterator();

		while (treeMapentriesIt.hasNext()) {
			Entry<Integer, String> current = treeMapentriesIt.next();
			System.out.println("Entry Key ::  " + current.getKey() + " value :: " + current.getValue());

			// Business logic
		}
	}
	
	public void concurrentHashMap() {
		
		Map<Integer, String> ccMap = new ConcurrentHashMap<>();
		ccMap.put(100, "Test1");
		
		
		
		Map<String, HashMap<Integer, String>> nestedMap = new HashMap<>();
		
		Map<String, HashMap<Integer, String>> syncNestedMap = Collections.synchronizedMap(nestedMap);
		
		HashMap<Integer, String> map = new HashMap<>();
		map.put(100, "Name");
		
		nestedMap.put("1", map);
		
		HashMap<Integer, String> value = nestedMap.get("1");
		
		
	}

}
