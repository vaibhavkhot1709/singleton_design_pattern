package com.design_pattern.factory;

public class LuxuryCar extends Car{
	
	
	public LuxuryCar(CarType carType) {
		super(CarType.LUXURY);
		construct(carType);
	}


	@Override
	public void construct(CarType carType) {
		System.out.println("Luxury car constructede !!! "+ this.getCarType());
		
	}

}
