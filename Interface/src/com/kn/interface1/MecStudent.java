package com.kn.interface1;

public class MecStudent implements Student {

	@Override
	public void study() {
		System.out.println("Studing AutoCad");
	}

	@Override
	public void doProject() {
       System.out.println("Working on Robotic Project");		

	}

}
