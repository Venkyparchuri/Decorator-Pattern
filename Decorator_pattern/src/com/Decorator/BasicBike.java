package com.decorator;

public class BasicBike extends BicycleDecorator {

	public BasicBike(Bike bike) {
		super(bike);
	}

	@Override
	public void addFeatures() {
		super.addFeatures();
		System.out.println("First adding features of Basic bike \n");
	}
}
