package com.design_pattern.abstractt.factory;

public class TestAbstractFactory {

	
	public static void main(String[] args) {
		
		Car lc=CarFactory.buildCar(CarType.LUXURY, Location.USA);

		Car sedc=CarFactory.buildCar(CarType.SEDAN, Location.DEFAULT);
		
		Car smlc=CarFactory.buildCar(CarType.SMALL, Location.USA);
		
	}
}
