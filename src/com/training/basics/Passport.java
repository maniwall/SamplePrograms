package com.training.basics;

public class Passport {
	
	private String passportNumber;
	
	{
		
		System.out.println("comming from parent initialzer block!!");
	}
	
	Passport(){
		System.out.println("comming from parent class constructor!!");
	}

	public Passport(String passportNumber) {
		super();
		this.passportNumber = passportNumber;
	}

	public String getPassportNumber() {
		return passportNumber;
	}
	
	

}
