package com.springcore.constrctor;

import java.util.Set;

public class Person {

	private String name;
	private int age;
	private Certificate certi;
	private Set<String> hobbies;
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
	/**
	 * @param name
	 * @param age
	 * @param certi
	 * @param hobbies
	 */
	public Person(String name, int age, Certificate certi, Set<String> hobbies) {
		super();
		this.name = name;
		this.age = age;
		this.certi = certi;
		this.hobbies = hobbies;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", certi=" + certi + ", hobbies=" + hobbies + "]";
	}

	
	
	
}
