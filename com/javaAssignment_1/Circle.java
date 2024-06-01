package com.javaAssignment_1;

//4] Write a Java program to print the area and perimeter of a circle.
public class Circle {

	public static void main(String[] args) {

		final double PI = 3.14;
		double radius = 10;

		// Calculate the perimeter of the circle
		double perimeter = 2 * PI * radius;

		// Calculate the area of the circle
		double area = PI * radius * radius;

		// Print the calculated perimeter and area
		System.out.println("Perimeter of Circle is = " + perimeter);
		System.out.println("Area of Circle is = " + area);

	}

}
