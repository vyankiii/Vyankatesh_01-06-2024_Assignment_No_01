package com.javaAssignment_1;
//9] Write a Java program that reads a number in inches and converts it to meters.

public class InchesMeters {

	public static void main(String[] args) {

		double inch = 100;
		// Convert inches to meters (1 inch = 0.0254 meters)
		double meters = inch * 0.0254;
		// Print inches value and meters
		System.out.println("The value of " + inch + " Inches in meter is: " + meters);

	}

}
