package com.springcore.ref;

public class Bike {
	
	private String brandName;
	private Engine engine;
	private float millage;
	private float price;
	/**
	 * @param brandName
	 * @param engine
	 * @param millage
	 * @param price
	 */
	public Bike(String brandName, Engine engine, int millage, float price) {
		super();
		this.brandName = brandName;
		this.engine = engine;
		this.millage = millage;
		this.price = price;
	}
	/**
	 * 
	 */
	public Bike() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the brandName
	 */
	public String getBrandName() {
		return brandName;
	}
	/**
	 * @param brandName the brandName to set
	 */
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	/**
	 * @return the engine
	 */
	public Engine getEngine() {
		return engine;
	}
	/**
	 * @param engine the engine to set
	 */
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	/**
	 * @return the millage
	 */
	public float getMillage() {
		return millage;
	}
	/**
	 * @param millage the millage to set
	 */
	public void setMillage(float millage) {
		this.millage = millage;
	}
	/**
	 * @return the price
	 */
	public float getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(float price) {
		this.price = price;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Bike [brandName=" + brandName + ", engine=" + engine + ", millage=" + millage + ", price=" + price
				+ "]";
	}

}
