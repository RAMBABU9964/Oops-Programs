package com.kn.polymarphasm2;

public class Square extends Shape{
double side=5.5;
	@Override
	public double calcArea() {
		
		return side*side ;
	}
	
	public double calcSquarePer() {
		return 4*side;
		
	}

}
