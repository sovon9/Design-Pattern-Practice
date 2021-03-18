package com.cognizant.abstract_factoryPattern;

public class Minicar extends Car{

	public Minicar(Location location) {
		super(CarType.MINI, location);
		construct();
		// TODO Auto-generated constructor stub
	}

	@Override
	void construct() {

		System.out.println("Connecting to Mini Car");
		
	}

}
