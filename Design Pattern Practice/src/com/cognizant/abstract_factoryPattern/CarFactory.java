package com.cognizant.abstract_factoryPattern;

public class CarFactory {

	public static Car buildCar(CarType model,Location location)
	{
		if(model.equals(CarType.LUXURY))
		{
			 return new LuxuryCar(location);
		}
		else if(model.equals(CarType.MICRO))
		{
			return new MicroCar(location);
		}
		else if(model.equals(CarType.MINI))
		{ 
			return new Minicar(location);
		}
		return null;
	}
	
}
