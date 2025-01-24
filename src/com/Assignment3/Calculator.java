package com.Assignment3;

public class Calculator {

	// Addition method
	public void add() {
		System.out.println(10 + 20);
	}

	// subtract method
	public void subtract() {
		System.out.println(10 - 20);
	}

	// multiply method
	public void multiply() {
		System.out.println(10 * 20);
	}

	public static void main(String[] args) {
		// Instance of the class/Object
		Calculator Calc = new Calculator();

		// Method calling
		Calc.add();
		Calc.subtract();
		Calc.multiply();
	}

}
