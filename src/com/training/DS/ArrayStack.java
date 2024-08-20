package com.training.DS;

public class ArrayStack {

	private int[] stack;
	private int capacity;
	private int top;

	public ArrayStack(int capacity) {
		this.capacity = capacity;
		this.stack = new int[capacity];
		this.top = -1;
	}

	public void push(int value) {
		if (isFull()) {
			throw new IllegalArgumentException("Stack is full!!");
		}

		stack[++top] = value;
	}

	public int peek() {
		if (isEmpty()) {
			throw new IllegalArgumentException("Stack is Empty, nothing to peek!!");
		}
		return stack[top];
	}

	public int pop() {
		if (isEmpty()) {
			throw new IllegalArgumentException("Stack is Empty, nothing to pop!!");
		}
		int result = stack[top];
		this.top = --this.top;
		return result;
	}

	public boolean isFull() {
		return this.capacity == top + 1;
	}

	public boolean isEmpty() {
		return this.top == -1;
	}
// 8033139507013843612
	public static void main(String[] args) {

		ArrayStack as = new ArrayStack(3);
		as.push(10);
		as.push(15);
		as.push(20);
		
		System.out.println("peeked :: " + as.peek());
		System.out.println("popped1 :: " + as.pop());
		System.out.println("popped2 :: " + as.pop());
		System.out.println("popped2 :: " + as.pop());
		System.out.println("popped2 :: " + as.pop());
	}

}
