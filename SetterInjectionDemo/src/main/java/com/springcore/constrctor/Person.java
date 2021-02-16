package com.springcore.constrctor;

public class Person {

	private String name;
	private int age;
	private Certificate certi;
	/**
	 * @param name
	 * @param age
	 * @param certi
	 */
	public Person(String name, int age, Certificate certi) {
		super();
		this.name = name;
		this.age = age;
		this.certi = certi;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", certificate =" + certi + "]";
	}
	
	
}
