package com.decorator;

public class BulletBike extends BicycleDecorator{

	public BulletBike(Bike bike) {
		super(bike);
		 
	}

	@Override
	public void addFeatures() {
		 
		super.addFeatures();
		
		System.out.println("\nBullet Bike features added");
	}
	
}
