package com.training.basics.java8;

@FunctionalInterface
public interface FunctionalInterface1 {

	public void sum();

	public static int add() {
		return 0;
	}

	public static int add1() {
		return 0;
	}

	public default void test() {

	}

	@Override
	public boolean equals(Object obj);

}
