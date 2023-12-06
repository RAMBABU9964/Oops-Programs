package com.kn.interface1;

public class StudentDemo {

	public static void main(String[] args) {
      CSEStudent cs1=new CSEStudent();
      MecStudent me1=new MecStudent();
      
        StudentDemo.callMethods(cs1);
          callMethods(me1);
	}
	
	static void callMethods(Student s) {
		s.study();
		s.doProject();
	}

}
