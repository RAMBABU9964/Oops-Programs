package com.kn.polymarphasm2;

public class Rectangular extends Shape{
double l=10,b=20;
	@Override
	public double calcArea() {
		return l*b;	
	}
public double calcRectPermeter() {
	return 2*(l+b);
	
}
}
