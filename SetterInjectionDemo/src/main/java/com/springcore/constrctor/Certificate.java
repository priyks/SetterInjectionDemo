package com.springcore.constrctor;

import java.sql.Date;

public class Certificate {

	
	private String name;
	private int duration;
	
	/**
	 * @param name
	 * @param certificateDate
	 */
	public Certificate(String name,int duration) {
		super();
		this.name = name;
		this.duration=duration;
	
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "[name=" + name + ", duration=" + duration+" Months " + "]";
	}
	
	
}
