package com.datastructure.stack;

public class PersonStack {
	private int top;
	private Person[] stack;
	private int size;

	public PersonStack() {
		top = -1;
		size = 10;
		stack = new Person[size];
	}

	public PersonStack(int size) {
		top = -1;
		this.size = size;
		stack = new Person[this.size];
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
	
	public void push(Person item) {
		if(isFull())
			System.out.println("Stack is full");
		else {
			top++;
			stack[top] = item;
		}
	}
}
