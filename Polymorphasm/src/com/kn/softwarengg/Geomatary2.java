package com.kn.softwarengg;

public class Geomatary2 {
public void doActiviy(SoftwarEngginer sf) {
	if(sf instanceof BackEndEngginer) {
		System.out.println("**************Backend engginer*************");
		System.out.println("");
        sf.attendMetting();
        ((BackEndEngginer)(sf)).doBackendProject();
	}else if(sf instanceof DataBaseEngginer){
		System.out.println("*************Database engginer************");
		System.out.println("");
		sf.attendMetting();
        ((DataBaseEngginer)(sf)).doDatabaseProject();
        ((DataBaseEngginer)(sf)).learnSQL();
	}else if(sf instanceof JavaBackendEngginer) {
		System.out.println("************Java Backend engginer*****************");
		System.out.println("");
		((JavaBackendEngginer)(sf)).doBackendProject();
        ((JavaBackendEngginer)(sf)).learnJava();
	}else if(sf instanceof PythenBackendEngginer) {
		 System.out.println("**************Pythen Backend Engginer*******************");
		 System.out.println("");
		 ((PythenBackendEngginer)(sf)).doBackendProject();
        ((PythenBackendEngginer)(sf)).learnPythen();
	}
	System.out.println("===================================================================");
}
}
