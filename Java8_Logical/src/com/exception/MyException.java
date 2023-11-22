package com.exception;

public class MyException extends Exception {

	static int accNo[] = { 101, 102, 103, 104, 105 };
	static String name[] = { "Rama", "Laxmi", "Raja", "Jaga", "Sachi" };
	static long balance[] = { 1000, 12000, 1335, 900, 3500 };

	public static void main(String[] args) {
		try {
			System.out.println("AccNo" + "\t" + "Name" + "\t" + "Balance");
			for (int i = 0; i < 5; i++) {
				System.out.println(accNo[i] + "\t" + name[i] + "\t" + balance[i]);
				if (balance[i] < 1000) {
					MyException my = new MyException();
					throw my;
				}
			}
		} catch (MyException e) {
			System.out.println("Your Account Balance is very low ");
			e.printStackTrace();
		}
	}
}
