package com.kn.softwarengg;

public class SoftwarEngginerDemo {

	public static void main(String[] args) {
		
		SoftwarEngginer sf=new SoftwarEngginer();
		System.out.println("");
	     System.out.println("");
		System.out.println("**************Softwar engginer*************");
		sf.attendMetting();
		sf.doTesting();
		
		
		
		 System.out.println("");
	     System.out.println("");
		System.out.println("**************Backend engginer*************");
		sf=new BackEndEngginer();
        sf.attendMetting();
        ((BackEndEngginer)(sf)).doBackendProject();
        
        
        System.out.println("");
        System.out.println("");
        System.out.println("*************Database engginer************");
        sf=new DataBaseEngginer();
        sf.attendMetting();
        ((DataBaseEngginer)(sf)).doDatabaseProject();
        ((DataBaseEngginer)(sf)).learnSQL();
        
        
        System.out.println("");
        System.out.println("");
        System.out.println("************Java Backend engginer*****************");
        sf=new JavaBackendEngginer();
        ((JavaBackendEngginer)(sf)).doBackendProject();
        ((JavaBackendEngginer)(sf)).learnJava();
        
        
        System.out.println("");
        System.out.println("");
        System.out.println("**************Pythen Backend Engginer*******************");
        sf=new PythenBackendEngginer();
        ((PythenBackendEngginer)(sf)).doBackendProject();
        ((PythenBackendEngginer)(sf)).learnPythen();
	
	
//	Geomatary2 g=new Geomatary2();
//	BackEndEngginer b=new BackEndEngginer();
//	DataBaseEngginer d=new DataBaseEngginer();
//	JavaBackendEngginer j= new JavaBackendEngginer();
//	PythenBackendEngginer p=new PythenBackendEngginer();
//	
//	
//	g.doActiviy(b);
//	g.doActiviy(d);
//	g.doActiviy(j);
//	g.doActiviy(p);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
