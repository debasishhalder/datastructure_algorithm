/**
 * 
 */
package com.datastructure.queue;

/**
 * @author Debasish
 *
 */
public class PersonQueue {
	private Person[] queue;
	private int size;
	private int total;
	private int front;
	private int rear;

	public PersonQueue() {
		size = 10;
		queue = new Person[size];
		total = 0;
		front = 0;
		rear = 0;
	}

	public PersonQueue(int size) {
		this.size = size;
		queue = new Person[this.size];
		total = 0;
		front = 0;
		rear = 0;
	}

	public boolean isFull() {
		return total == size;
	}

	public boolean enQueue(Person item) {
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

	public Person deQueue() {
		Person item = queue[front];
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
