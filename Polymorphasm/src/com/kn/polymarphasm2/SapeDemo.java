package com.kn.polymarphasm2;

public class SapeDemo {

	public static void main(String[] args) {
		//Creat parent object reference
//		Shape sh;
//		//Creat child 
//		System.out.println("**************Circle**********************");
//		sh=new Circle();
//		sh.draw();
//		System.out.println("Area of the circle = "+sh.calcArea());
//		System.out.println("perimeter of the circle = "+((Circle)(sh)).calcPerimeter());
//		System.out.println("============================================================");
//       System.out.println("****************Rectangle********************");
//		sh=new Rectangular();
//		sh.draw();
//		System.out.println("Area of the Rectangular = "+sh.calcArea());
//		System.out.println("perimeter of the Rectangle = "+((Rectangular)(sh)).calcRectPermeter());
//		System.out.println("===========================================================");
//        System.out.println("*****************Square*********************");
//		sh=new Square();
//		sh.draw();
//		System.out.println("Area of the Square = "+sh.calcArea());
//		System.out.println("perimeter of the Square = "+((Square)(sh)).calcSquarePer());
	
     Geomatary g=new Geomatary();
     Rectangular r=new Rectangular();
     Circle c=new Circle();
     Square s=new Square();
     
     
     g.doActivity(r);
     g.doActivity(c);
     g.doActivity(s);
	
	
	
	
	}
	
	

}
