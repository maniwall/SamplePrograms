package com.training.basics;

public class Rectangle extends Shape {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		// rectangle.draw();
		
		Shape shape = new Rectangle();
		
		shape.draw();
		shape.draw1();
		

	}

	@Override
	void draw() {
		System.out.println("drawing rectangle");
	}

}
