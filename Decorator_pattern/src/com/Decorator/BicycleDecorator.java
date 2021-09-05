package com.decorator;

public class BicycleDecorator implements Bike {
	
	public Bike bike;
	
	public BicycleDecorator(Bike bike) {
		super();
		this.bike = bike;
	}

	

	@Override
	public void addFeatures() {
		 
		this.bike.addFeatures();
		
	}

}
