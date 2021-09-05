package com.decorator;

public class TestDecorator {

	public static void main(String[] args) {
		 
		Bike basicBike = new BasicBike(new BasicBicycle());
		 
		Bike sportsBike = new SportsBike(basicBike);
		//Added sports bike features
		sportsBike.addFeatures();
		System.out.println("\n \n Now I have sports Bike \n");
		
		System.out.println("\n**************************************");
		
        Bike bulletBike = new BulletBike(sportsBike);
		//Added sports bike features
        bulletBike.addFeatures();
        
        System.out.println("\n \n Now I have Bullet Bike \n");

	}

}
