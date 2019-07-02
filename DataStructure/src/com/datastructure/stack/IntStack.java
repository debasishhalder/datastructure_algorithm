package com.datastructure.stack;

public class IntStack {
	private int top;
	private int[] stack;
	private int size;

	public IntStack() {
		top = -1;
		size = 10;
		stack = new int[size];
	}

	public IntStack(int size) {
		top = -1;
		this.size = size;
		stack = new int[this.size];
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return stack.length-1 == top;
	}

	public void pop() {
		if (isEmpty())
			System.out.println("Stack is Empty.");
		else
			System.out.println(stack[top--]);
	}
	
	public void push(int item) {
		if(isFull())
			System.out.println("Stack is full");
		else {
			top++;
			stack[top] = item;
		}
	}
}
