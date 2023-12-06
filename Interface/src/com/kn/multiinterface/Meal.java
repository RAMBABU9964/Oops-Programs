package com.kn.multiinterface;

public class Meal implements MainCourse, Starter, Desert {

	@Override
	public void gulabJame() {
		System.out.println("12 Pieces with Ice Cream");

	}

	@Override
	public void manchurian() {
		System.out.println("Gobi Manchurian");

	}

	@Override
	public void enjoy() {
		System.out.println("Enjoy meals...Thank you");

	}

	@Override
	public void biryani() {
		System.out.println("Mashroom Biryani");
	}

}
