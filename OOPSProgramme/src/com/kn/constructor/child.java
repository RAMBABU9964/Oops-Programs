package com.kn.constructor;

public class child extends Parent {
String name="chootu";
int age=12;


public child() {
	System.out.println("Child no-arg constructor");
}
public child(String name) {
	this(12);
	System.out.println("Child 1-arg String constructor");
}
public child(int age) {
	this();
	System.out.println("Child 1-arg int constructor");
}

public child( String name, int age) {
  this("Shyam"); 
  System.out.println("*********befor************");
  System.out.println(this.name);
  System.out.println(this.age); 
  this.name=name;
  this.age=age;
  System.out.println("*********ofter************");
  System.out.println(this.name);
  System.out.println(this.age);
}
}
