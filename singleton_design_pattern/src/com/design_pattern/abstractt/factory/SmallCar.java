package com.design_pattern.abstractt.factory;

public class SmallCar extends Car {

	public SmallCar(Location location) {
		super(CarType.SMALL, location);
		construct(location);
	}

	@Override
	public void construct(Location location) {
		if (location == Location.ASIA)
			System.out.println("Small car constructede at location " + location);

		else if (location == Location.USA)
			System.out.println("Small car constructede at location " + location);

		else if (location == Location.DEFAULT)
			System.out.println("Small car constructede at location " + location);

	}
}
