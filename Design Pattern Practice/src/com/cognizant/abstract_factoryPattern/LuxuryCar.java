package com.cognizant.abstract_factoryPattern;

public class LuxuryCar extends Car{

	public LuxuryCar(Location location) {
		super(CarType.LUXURY, location);
		construct();
		// TODO Auto-generated constructor stub
	}

	@Override
	void construct() {
		
		System.out.println("Connecting to Luxery car");
		
	}

}
