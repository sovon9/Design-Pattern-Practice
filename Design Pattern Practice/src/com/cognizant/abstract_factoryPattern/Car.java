package com.cognizant.abstract_factoryPattern;

public abstract class Car {

	public CarType model=null;
	
	public Location location=null;

	public Car(CarType model, Location location) {
		super();
		this.model = model;
		this.location = location;
	}
	
	abstract void construct();

	public CarType getModel() {
		return model;
	}

	public void setModel(CarType model) {
		this.model = model;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", location=" + location + "]";
	}
	
}
