package com.assignment;

public class DemoDay {
	public void week(Day day) {

		System.out.println("TODAY IS " + day);
	}

	public static void main(String[] args) {
		DemoDay d1 = new DemoDay();
		d1.week(Day.FRIDAY);
		d1.week(Day.SUNDAY);

	}
}
