/**
 * 
 */
package com.datastructure.queue;

/**
 * @author Debasish
 *
 */
public class IntQueue {
	private int[] queue;
	private int size;
	private int total;
	private int front;
	private int rear;

	public IntQueue() {
		size = 10;
		queue = new int[size];
		total = 0;
		front = 0;
		rear = 0;
	}

	public IntQueue(int size) {
		this.size = size;
		queue = new int[this.size];
		total = 0;
		front = 0;
		rear = 0;
	}

	public boolean isFull() {
		return total == size;
	}

	public boolean enQueue(int item) {
		if (isFull()) {
			return false;
		} else {
			total++;
			queue[rear] = item;
			// rear++;
			rear = (rear + 1) % size;
			return true;
		}
	}

	public int deQueue() {
		int item = queue[front];
		// front++;
		front = (front + 1) % size;
		total--;
		return item;
	}

	public void showAll() {
		int f = front;
		if (total != 0) {
			for (int i = 0; i < total; i++) {
				System.out.println(" " + queue[f]);
				f = (f + 1) % size;
			}
		}
	}
}
