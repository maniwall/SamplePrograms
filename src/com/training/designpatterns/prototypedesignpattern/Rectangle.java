package com.training.designpatterns.prototypedesignpattern;

public class Rectangle implements Shape {

	private String color;
	private int length;

	public Rectangle(String color, int length) {
		this.color = color;
		this.length = length;
	}

	@Override
	public void draw() {
		System.out.println("Drawing Rectange with color :: " + color + " with length :: " + length);
	}

	@Override
	public Shape clone() {
		return new Rectangle(this.color, this.length);
	}

}
