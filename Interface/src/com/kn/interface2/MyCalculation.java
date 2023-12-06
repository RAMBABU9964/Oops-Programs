package com.kn.interface2;

public class MyCalculation implements Calculator2 {

	@Override
	public void addition() {
		System.out.println("Using Addition we will Add two numbers");

	}

	@Override
	public void subtraction() {
		System.out.println("Using Subtraction we will Sub two numbers");

	}

	@Override
	public void multiplication() {
		System.out.println("Using Multiplaction we will Multipli two numbers");

	}

	@Override
	public void divison() {
		System.out.println("Using Divison we will Divide two numbers");

	}

}
