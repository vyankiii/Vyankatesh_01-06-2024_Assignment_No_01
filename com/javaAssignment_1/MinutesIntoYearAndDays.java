package com.javaAssignment_1;

//10] Write a Java program to convert minutes into years and days.
public class MinutesIntoYearAndDays {

	public static void main(String[] Strings) {

		long min = 1000000;
		final long minutesInYear = 60 * 24 * 365; // Constants for conversion
		// Calculate year and To convert the miniute value of a double type to a long
		// type
		long years = min / minutesInYear;
		// calculate Days
		int days = (int) (min / 60 / 24) % 365;

		// Print year and days
		System.out.println("Minutes: " + min);
		System.out.println("Years: " + years);
		System.out.println("Days: " + days);
	}

}
