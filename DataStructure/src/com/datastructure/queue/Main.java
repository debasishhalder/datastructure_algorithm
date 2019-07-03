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
		
		//Integer type queue implementation
		/*IntQueue q = new IntQueue();
		q.enQueue(10);
		q.enQueue(2);
		q.enQueue(8);*/
		
		/*System.out.println(q.deQueue());
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());*/
		
		//q.showAll();
		
		//Custom Object type queue implementation
		PersonQueue personQueue = new PersonQueue();
		for(int i=0;i<5;i++) {
			Person person = new Person(i, "Ram"+i, "Hyderabad"+i);
			personQueue.enQueue(person);
		}
		
		personQueue.showAll();
	}

}
