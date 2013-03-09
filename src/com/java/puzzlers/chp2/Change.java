package com.java.puzzlers.chp2;

import java.math.BigDecimal;

public class Change {
	public static void main(String args[]) {
		// double temp = 2.0 - 1.10;
		// System.out.println("temp :" + temp);
		// System.out.println("Change :" + (2.00 - 1.10));
		// System.out.printf("%.2f%n", 2.00 - 1.10);
		System.out.println(new BigDecimal("2.00").subtract(new BigDecimal(
				"1.10")));

		// BigDecimal number = new BigDecimal(2.1);
		// System.out.println("number :" + number);
	}
}