package com.springcore.ref;

public class Engine {
	 private String name;
	 private float capacity;
	 
	 
	/**
	 * 
	 */
	public Engine() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param name
	 * @param capacity
	 */
	public Engine(String name, int capacity) {
		super();
		this.name = name;
		this.capacity = capacity;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the capacity
	 */
	public float getCapacity() {
		return capacity;
	}
	/**
	 * @param capacity the capacity to set
	 */
	public void setCapacity(float capacity) {
		this.capacity = capacity;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Engine [name=" + name + ", capacity=" + capacity + "]";
	}
   
}
