package com.kn.polymarphasm2;

public class Geomatary {
public void doActivity(Shape sh) {
	sh.draw();
	System.out.println("Area = "+sh.calcArea());
	
	if(sh instanceof Rectangular) {
		System.out.println("perimeter of the Rectangle = "+((Rectangular)(sh)).calcRectPermeter());
	}else if(sh instanceof Circle) {
		System.out.println("perimeter of the circle = "+((Circle)(sh)).calcPerimeter());
	}else {
		System.out.println("perimeter of the Square = "+((Square)(sh)).calcSquarePer());
	}
	System.out.println("=====================================================");
}
}
