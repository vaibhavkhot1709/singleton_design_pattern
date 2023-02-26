package com.design_pattern.factory;

public class TestFactory {

	
	public static void main(String[] args) {
		
		Car lc=CarFactory.buildCar(CarType.LUXURY);
		
		Car sedc=CarFactory.buildCar(CarType.SEDAN);
		
		Car smlc=CarFactory.buildCar(CarType.SMALL);
		
	}
}
