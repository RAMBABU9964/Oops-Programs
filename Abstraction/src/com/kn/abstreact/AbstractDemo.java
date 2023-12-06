package com.kn.abstreact;

public class AbstractDemo {
	public static void main(String[] args) {
		ElectricalCar eCar=new ElectricalCar();
		DisealCar dCar=new DisealCar();
		PetroleCar pCar=new PetroleCar();
		
		eCar.start();
		eCar.stop();
		eCar.refull();
		System.out.println("****************************************");
		
		dCar.start();
		dCar.stop();
		dCar.refull();
		System.out.println("****************************************");
		
		
		pCar.start();
		pCar.stop();
		pCar.refull();
		System.out.println("****************************************");
		
	}



}
