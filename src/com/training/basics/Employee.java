package com.training.basics;

import java.util.Comparator;

public class Employee implements Comparable<Employee> {

	private int id;
	private String name;
	private String address;
	private String mobileNum;
	private char gender;
	
	private Department department;

	Employee() {

	}

	public Employee(int id, String name, String address, String mobileNum, char gender) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.mobileNum = mobileNum;
		this.gender = gender;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobileNum() {
		return mobileNum;
	}

	public void setMobileNum(String mobileNum) {
		this.mobileNum = mobileNum;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", mobileNum=" + mobileNum
				+ ", gender=" + gender + "]";
	}

	@Override
	public int compareTo(Employee o) {
		return this.getId() - o.getId(); //
	}

}
