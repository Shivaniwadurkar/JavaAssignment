package com.assignment;

public class DemoDirection {

	// public static final String North = "North";
	// public static final String South = "South";
	// public static final String East = "East";
	// public static final String West = "West";
	//
	//
	//

	public void navigate(Direction direction) {

		System.out.println("Move In " + direction + " Direction.");
	}

	public static void main(String[] args) {
		DemoDirection d = new DemoDirection();
		d.navigate(Direction.North);
		d.navigate(Direction.Southwest);

	}
}
