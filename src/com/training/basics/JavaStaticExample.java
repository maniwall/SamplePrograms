package com.training.basics;

public class JavaStaticExample {
	
	int value= 10;

	JavaStaticExample() {
		// System.out.println("coming from Super class!!");
	}

	public static int staticValue = 10; // 10
	int nonStaticValue = 20; // 20, 20

	public static Integer getStaticVar() {
		// getNonStaticMethod();
		return staticValue;
	}

	public Integer getNonStaticMethod() {
		return 0;
	}

	public static void test() {
		System.out.println("Comming from Parent method");
	}

	public void normalMethod() {
		System.out.println("Comming from parent normal method");
	}

	protected static JavaStaticExample getInstance() {
		// System.out.println("coming from JavaStaticExample method1!!" + Runner.str);
		JavaStaticExample object = null;
		
		object = new JavaStaticExample();
		return object;
	}
	
	public final void sum(int a, int b) {
		int j = 0;
	}

	static class StaticInnerClass {
		int value = getStaticVar();

		public void printStaticValue() {
			System.out.println("Static Integer value :: " + staticValue);
		}
	}

}
