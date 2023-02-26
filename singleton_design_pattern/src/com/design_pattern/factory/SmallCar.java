package com.design_pattern.factory;

public class SmallCar extends Car{
	
	
	public SmallCar(CarType carType) {
		super(CarType.SMALL);
		construct(carType);
	}


	@Override
	public void construct(CarType carType) {
		System.out.println("Small car constructede !!! "+ this.getCarType());
		
	}

}
