package com.intellect;

public class NumberComparatorTest {
	public static void main(String[] args) {
		NumberComparator c = (a, b) -> {
			if (a > b) return true;
			return false;
		};
		System.out.println(c.compareNumber(15, 10));
	}
}
