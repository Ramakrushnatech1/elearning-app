package com.java8.logical;

import java.util.Arrays;
import java.util.List;

public class EvenNo_List {
	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(20, 30, 40, 78, 95, 63, 42, 58, 45);
		list.stream()
			.filter(n -> n % 2 == 0)
			.forEach(System.out::println);
	}
}


//Given a list of integers, find out all the even numbers that exist in the list using Stream functions?