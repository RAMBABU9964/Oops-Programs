package com.kn.constructor;

public class Student {
  String name;
  int age;

public Student(String name,int age) {
	this(15);
	System.out.println("*********before in 2-arg parent****");
	System.out.println("name = "+name);
	System.out.println("age = "+age);
	this.name=name;
	this.age=age;
	System.out.println("*********ofter in 2-arg parent****");
	System.out.println("name = "+name);
	System.out.println("age = "+age);
}

    public Student(int age){
    	this("ram");
    	System.out.println("*********before in 1-arg parent age****");
    	System.out.println("age = "+age);
    	this.age=age;
    	System.out.println("*********ofter in 1-arg parent age****");
    	System.out.println("age = "+age);
    }

	public Student(String name) {
		System.out.println("*********before in 1-arg parent name****");
    	System.out.println("name = "+name);
     this.name=name;
     System.out.println("*********before in 1-arg parent name****");
 	System.out.println("name = "+name);
	}
    
} 
	


