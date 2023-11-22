package com.exception;

import java.io.IOException;

public class Example2 {
	void myMethod(int num) throws IOException, ClassNotFoundException {
		if (num == 1) {
			throw new IOException("Exception Message 1");
		} else if (num == 2) {
			throw new ClassNotFoundException("Exception Message 2");
		} else {
			System.out.println(num);
		}
	}

	public static void main(String[] args) {
		try {
			Example2 ex2 = new Example2();
			ex2.myMethod(1);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
