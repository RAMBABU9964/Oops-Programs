package com.kn.inheritance.multilevel;

public class MultiLevalInheritance {

	public static void main(String[] args) {
		vehicle v1=new vehicle();
		v1.registrationnumber=111;
       System.out.println("vehicle registration number"+v1.registrationnumber);
       v1.move();
       
       System.out.println("<======car======>");
       car c1=new car();
       c1.registrationnumber=222;
       System.out.println("car registration number"+c1.registrationnumber);
       c1.move();
       
       System.out.println("<=====sedan=====>");
       sedan s1=new sedan();
       s1.registrationnumber=333;
       System.out.println("sedan registration number"+s1.registrationnumber);
       s1.move();
	}

}
