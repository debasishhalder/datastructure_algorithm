package com.datastructure.stack;

public class IntStack {
	private int top;
	private int[] stack;
	private int size;

	public IntStack() {
		top = -1;
		size = 50;
		stack = new int[size];
	}

}
