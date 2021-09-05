package com.decorator;

public class SportsBike extends BicycleDecorator{

	public SportsBike(Bike bike) {
		super(bike);
	 
	}

	@Override
	public void addFeatures() {
		 
		super.addFeatures();
		System.out.print("Sports bike features added\n");
	}
	
	
	
}
