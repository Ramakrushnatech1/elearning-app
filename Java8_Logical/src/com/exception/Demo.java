package com.exception;

public class Demo {

	int sum(int sum1, int sum2) {
		if (sum2 == 0) {
			throw new ArithmeticException("Second parameter is not valid");
		} else {
			System.out.println("Both parameter are valid");
			return sum1 / sum2;
		}
	}

	public static void main(String[] args) {
		Demo d = new Demo();

		int res = d.sum(12, 0);
		System.out.println(res);
	}
}
