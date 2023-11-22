package com.exception;

public class Bar {
	
	public void saveAge(int age) {
		if (age < 18) {
			throw new ArithmeticException();
		} else {
			System.out.println("Correct age is entered ");
		}
	}

	public static void main(String[] args) {
		Bar b = new Bar();
		try {
			b.saveAge(19);
		} catch (ArithmeticException e) {
			System.out.println("Exception Caught");
		}
	}
}
