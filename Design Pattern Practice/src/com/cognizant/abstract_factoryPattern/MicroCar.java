package com.cognizant.abstract_factoryPattern;

public class MicroCar extends Car{

	public MicroCar(Location location) {
		super(CarType.MICRO, location);
		construct();
		// TODO Auto-generated constructor stub
	}

	@Override
	void construct() {
		
		System.out.println("Connecting to Micro Car");
		
	}

}
