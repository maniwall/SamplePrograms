package com.training.basics;

public class Circle implements Drawable {

	public static void main(String[] args) {
		System.out.println(Drawable.VALUE);
		Drawable drawable = new Circle();
		drawable.draw();

	}

	@Override
	public void draw() {
		System.out.println("Drawing Circle!!");

	}

	@Override
	public void draw1() {

	}

}
