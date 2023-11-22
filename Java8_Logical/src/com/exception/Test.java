package com.exception;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {

		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter you age :");
		age = sc.nextInt();
		if (age < 18) {
			System.out.println("You are not eligiblie for Vote");
		} else {
			System.out.println("Welcome to Vote");
		}
	}

}
