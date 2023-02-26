package com.design_pattern.factory;

public class SedanCar extends Car{
	
	
	public SedanCar(CarType carType) {
		super(CarType.SEDAN);
		construct(carType);
	}


	@Override
	public void construct(CarType carType) {
		System.out.println("Small car constructede !!!"+ this.getCarType());
		
	}

}
