package com.design_pattern.abstractt.factory;

public class LuxuryCar extends Car{
	
	
	public LuxuryCar(Location location) {
		super(CarType.LUXURY, location);
		construct(location);
	}

	@Override
	public void construct(Location location) {

		if(location==Location.ASIA)
			System.out.println("Luxury car constructede at location "+location);
			
			else if(location==Location.USA)
				System.out.println("Luxury car constructede at location "+location);
			
			else if(location==Location.DEFAULT)
				System.out.println("Luxury car constructede at location "+location);

	}


}
