package com.Assignment2;

public class EB_Reading {
	
	public int reading() {
		int consumed_units = 150;
		return consumed_units;
	}
	
	public int calculate(int consumed_units) {
		int payment;

		if (consumed_units <= 100) {
			payment = consumed_units * 13;
		} else if (consumed_units <= 200) {
			payment = (100 * 13) + ((consumed_units - 100) * 15);
		} else {
			payment = (100 * 13) + (100 * 15) + ((consumed_units - 200) * 20);
		}

		return payment;
	}
	
	public static void main(String[] args) {
		EB_Reading assessor = new EB_Reading();
		int consumed_units = assessor.reading();
		int payment = assessor.calculate(consumed_units);
		
		// Print the consumed units and payment value
        System.out.println("Consumed Units: " + consumed_units);
        System.out.println("Payment Amount: " + payment);
	} 
}

