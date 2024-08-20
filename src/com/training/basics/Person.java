package com.training.basics;

import java.util.List;

public class Person {
	
	private String personName;
	private Passport passport; // Mandatory
	private List<Address> addresses;
	

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public Person(String personName) {
		this.personName = personName;
	}
	
	public Person(Passport passport) {
		super();
		this.passport = passport;
	}

	public Passport getPassport() {
		return passport;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}
	
	

}
