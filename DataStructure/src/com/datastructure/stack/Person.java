package com.datastructure.stack;

public class Person {
	private int id;
	private String name;
	private String address;

	/**
	 * @param id
	 * @param name
	 * @param address
	 */
	public Person(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

}
