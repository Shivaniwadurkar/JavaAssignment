package com.assignment;

public class Car {
	private int plate_number;
	private int wheel;


	public Car(int plate_number, int wheel) {
		this.plate_number = plate_number;
		this.wheel = wheel;
		

	}

	public int getPlate_number() {
		return plate_number;
	}

	public void setPlate_number(int plate_number) {
		this.plate_number = plate_number;
	}

	public int getWheel() {
		return wheel;
	}

	public void setWheel(int wheel) {
		this.wheel = wheel;
	}

	
	public static void main(String[] args) {
		Car c = new Car(231, 4);
		c.getPlate_number();

	}
}
