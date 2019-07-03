/**
 * 
 */
package com.datastructure.queue;

/**
 * @author Debasish
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IntQueue q = new IntQueue();
		q.enQueue(10);
		q.enQueue(2);
		q.enQueue(8);
		
		/*System.out.println(q.deQueue());
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());*/
		
		q.showAll();
	}

}
