package com.intellect;

public class ExtendsTest {
	public static void main(String[] args) {
		B b = new B();
		B1 b1 = new B1();
		B2 b2 = new B2();

		b1 = (B1) b; // Answered
		// b2 = b; //CE
		// b2 = (B2) b1; //CE
		// b = b1; //Sucessful Run
		// b1 = (B) b1; //CE

	}
}