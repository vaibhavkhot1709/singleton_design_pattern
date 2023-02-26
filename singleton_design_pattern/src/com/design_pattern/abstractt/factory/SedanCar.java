package com.design_pattern.abstractt.factory;

public class SedanCar extends Car{
	
	
	public SedanCar(Location location) {
		super(CarType.SEDAN, location);
		construct(location);
	}

	@Override
	public void construct(Location location) {
		if(location==Location.ASIA)
		System.out.println("Sedan car constructede at location "+location);
		
		else if(location==Location.USA)
			System.out.println("Sedan car constructede at location "+location);
		
		else if(location==Location.DEFAULT)
			System.out.println("Sedan car constructede at location "+location);
		
	}

}
