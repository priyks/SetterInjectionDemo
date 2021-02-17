package com.codetointerface;

public class Triangle  implements Shape{
	private Point pointA;
	private Point pointB;
	private Point pointC;

	
	/**
	 * @param pointA the pointA to set
	 */
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}


	/**
	 * @param pointB the pointB to set
	 */
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}


	/**
	 * @param pointC the pointC to set
	 */
	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}


	public void draw() {
		System.out.println("Triangle is drawn with pointA : "+pointA.getPointX()+"  "+pointA.getPointY());
		System.out.println("Triangle is drawn with pointB : "+pointB.getPointX()+"  "+pointB.getPointY());
		System.out.println("Triangle is drawn with pointC : "+pointC.getPointX()+"  "+pointC.getPointY());
	}

}
