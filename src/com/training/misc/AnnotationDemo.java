package com.training.misc;

import java.lang.reflect.Method;

// @TestAnnotation
public class AnnotationDemo {

	
	@TestAnnotation(name = "sachin")
	@TestAnnotation(name = "dravid")
	@TestAnnotation(name = "kohil")
	public static void main(String[] args) {
		
		AnnotationDemo demo = new AnnotationDemo();
		
		Class<? extends AnnotationDemo> class1 = demo.getClass();
		Method[] methods = class1.getDeclaredMethods();
		Method method1 = methods[0];
		
		TestAnnotation[] testAnnotations = method1.getAnnotationsByType(TestAnnotation.class);
		TestAnnotation testAnnotation1 = testAnnotations[0];
		TestAnnotation testAnnotation2 = testAnnotations[1];
		System.out.println("Getting the value from the custom annotation :: "+ testAnnotation1.name());
		System.out.println("Getting the value from the custom annotation :: "+ testAnnotation2.name());
	}
}
