package com.kn.polymarphasm2;

public class Circle extends Shape{
public void draw() {
	System.out.println("Drawing a circle");
}
double radious=5.5;
@Override
public double calcArea() {
	return Math.PI*radious*radious;
	
}
public double calcPerimeter() {
	return 2*Math.PI*radious;
	
}

}
