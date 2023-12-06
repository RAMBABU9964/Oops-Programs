package com.kn.inheritances;

public class inheritance {

	public static void main(String[] args) {
		chefRobo chf1=new chefRobo();
		DriveRobo dr1=new DriveRobo();
		techerRobo tech1=new techerRobo();
		System.out.println("<=============Chef Robo============>");
		System.out.println("name = "+chf1.name);
		System.out.println("Type = "+chf1.type);
         chf1.walk();
         chf1.talk();
         chf1.charged();
         chf1.cook();
         
         System.out.println("<=============Driver Robo============>");
         System.out.println("name = "+dr1.name);
 		 System.out.println("Type = "+dr1.type);
          dr1.walk();
          dr1.talk();
          dr1.charged();
          dr1.Drive();
          
          System.out.println("<=============Techer Robo============>");
          System.out.println("name = "+tech1.name);
  		  System.out.println("Type = "+tech1.type);
           tech1.walk();
           tech1.talk();
           tech1.charged();
           tech1.techer();
	}

}
