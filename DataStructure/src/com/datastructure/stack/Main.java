/**
 * 
 */
package com.datastructure.stack;

/**
 * @author Debasish
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IntStack intStack = new IntStack();
		for(int i=0;i<=10;i++) {
			intStack.push(i);
		}
		
		for(int i=0;i<=10;i++) 
			intStack.pop();
	}

}
