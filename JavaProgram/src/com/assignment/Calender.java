package com.assignment;

public class Calender {
	public void calender(Day day, Month month) {

		System.out.println("THE DAY IS " + day);
		System.out.println("THE MONTH IS " + month);
	}

	public static void main(String[] args) {
		Calender d1 = new Calender();
		d1.calender(Day.FRIDAY, Month.MAY);
		d1.calender(Day.SUNDAY, Month.APRIL);

	}
}
