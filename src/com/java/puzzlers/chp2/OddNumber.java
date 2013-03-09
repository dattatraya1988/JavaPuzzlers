package com.java.puzzlers.chp2;

public class OddNumber {
	public static void main(String[] args) {
		OddNumber oddNumber = new OddNumber();

		if (oddNumber.isOdd(5)) {
			System.out.println("Number is odd...");
		} else {
			System.out.println("Number is not odd...");
		}
	}

	public boolean isOdd(int number) {
		// return (number % 2) == 1;
		// return (number % 2) != 0;
		return (number & 1) != 0;
	}
}
