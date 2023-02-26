package com.design_pattern.abstractt.factory;

public class CarFactory{


	public static Car buildCar(CarType type, Location location)
	{
		Car car = null;
		
		switch(location)
		{
		case ASIA:
			car = AsiaLocation.buildCar(type);
			break;
		case DEFAULT:
			car = DefaultLocation.buildCar(type);
			break;
		case USA:
			car = UsaLocation.buildCar(type);
			break;
		default:
			System.out.println("We only support Default, Asia and USA locations!!!!");
			break;
			
		}
		return car;
		
	}
}
