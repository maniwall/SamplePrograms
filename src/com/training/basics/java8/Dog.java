package com.training.basics.java8;

public class Dog implements Animal1, Animal2 {

	@Override
	public void print() {
		System.out.println("overriding Abstract method!!");

	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		Animal2.super.move();
	}

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.move();
		Animal1.staticMethod();
		Animal2.staticMethod();
		
	}
}
