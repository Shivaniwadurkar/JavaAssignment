package com.assignment;

public class DemoMonth {
public void groupOfMonth(Month month) {
	System.out.println("This Month is "+month);
	
}

public static void main(String[] args) {
	DemoMonth DM = new DemoMonth();
	DM.groupOfMonth(Month.JANUARY);
	DM.groupOfMonth(Month.MARCH);

}
}
