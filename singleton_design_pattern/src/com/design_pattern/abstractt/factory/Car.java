package com.design_pattern.abstractt.factory;

public abstract class Car {

	private CarType carType;
	private Location location;

	
	protected Car(CarType carType, Location location) {
		super();
		this.carType = carType;
		this.location = location;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public CarType getCarType() {
		return carType;
	}

	public void setCarType(CarType carType) {
		this.carType = carType;
	}

	protected abstract void construct(Location location );
}
