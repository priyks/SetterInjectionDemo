package com.codetointerface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Circle implements Shape{

private Point circle;

/**
 * @return the circle
 */
public Point getCircle() {
	return circle;
}

/**
 * @param circle the circle to set
 */

@Autowired
@Qualifier("circleRelated")
public void setCircle(Point circle) {
	this.circle = circle;
}

public void draw() {
	System.out.println("Circle is drawn with point : "+circle.getPointX()+"  "+circle.getPointY());
	
}


}
