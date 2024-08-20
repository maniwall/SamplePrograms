package com.training.designpatterns.prototypedesignpattern;

public class ShapeClient {

	public Shape shapePrototype;
	
	public ShapeClient (Shape shapePrototype) {
		this.shapePrototype = shapePrototype;
	}
	
	public Shape createShape() {
		return shapePrototype.clone();
	}
}
