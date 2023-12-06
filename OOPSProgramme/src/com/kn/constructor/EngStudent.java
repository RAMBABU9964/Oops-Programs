package com.kn.constructor;
public class EngStudent extends Student {
 String branch;
 int sem;
 
 public EngStudent(String name, int age, String branch, int sem) {
	this("ram", 14);
	this.branch = branch;
	this.sem = sem;
	this.branch=branch;
	this.sem=sem;	
	}

  public EngStudent(String name, int age) {
	super("shyam",15);
	this.name=name;
	this.age=age;
}

  public EngStudent() {
  this("ram",15,"me",5);
}

}

