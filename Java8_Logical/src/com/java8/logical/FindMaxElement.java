package com.java8.logical;

import java.util.Arrays;
import java.util.List;

public class FindMaxElement {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);

		int max = list.stream().max(Integer::compare).get();
		System.out.println(max);
	}
}

//Given a list of integers, find the maximum value element present in it using Stream functions?
