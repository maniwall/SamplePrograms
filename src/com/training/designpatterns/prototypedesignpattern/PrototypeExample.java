package com.training.designpatterns.prototypedesignpattern;

public class PrototypeExample {

	public static void main(String[] args) {
		
		Circle circle = new Circle("Red");
		ShapeClient sc = new ShapeClient(circle);
		Shape redCircle = sc.createShape();
		redCircle.draw();
		
		
		Rectangle rectangle = new Rectangle("Green", 15);
		ShapeClient sc1 =  new ShapeClient(rectangle);
		Shape greenRectangle = sc1.createShape();
		greenRectangle.draw();
	}

}
