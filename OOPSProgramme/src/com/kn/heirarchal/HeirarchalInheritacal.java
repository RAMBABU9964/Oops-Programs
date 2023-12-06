package com.kn.heirarchal;

public class HeirarchalInheritacal {

	public static void main(String[] args) {
		Empolyee e1=new Empolyee();
		e1.name="ram";
		e1.salary=25000;
		System.out.println("<======Employee======>");
		System.out.println("Name = "+e1.name+" - "+" Salary = "+e1.salary);
		
		developer d1=new developer();
		d1.name="shyam";
		d1.salary=22000;
		System.out.println("<======Developer======>");
		System.out.println("Name = "+d1.name+" - "+" Salary = "+d1.salary);

		TestEngineer t1=new TestEngineer();
		t1.name="sonu";
		t1.salary=33000;
		System.out.println("<======TestEngineer======>");
		System.out.println("Name = "+t1.name+" - "+" Salary = "+t1.salary);
		
		TeamLead tl1=new TeamLead();
		tl1.name="ravi";
		tl1.salary=44000;
		System.out.println("<======Team Lead======>");
		System.out.println("Name = "+tl1.name+" - "+" Salary = "+tl1.salary);
		
		
		Manager m1=new Manager();
		m1.name="suma";
		m1.salary=55000;
		System.out.println("<======Manager======>");
		System.out.println("Name = "+m1.name+" - "+" Salary = "+m1.salary);
	}

}
