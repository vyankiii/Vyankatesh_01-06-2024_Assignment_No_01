package com.javaAssignment_1;

// 6] Write a Java program to print the area and perimeter of a rectangle
public class Rectangle {

	public static void main(String[] args) {

		// length and width
		double length = 10;

		double width = 5;

		// Calculate the area perimeter
		double area = length * width;
		// Calculate the perimeter
		double perimeter = 2 * (length + width);

		// Print the Area and Perimeter
		System.out.println("Area of rectangle: " + area);
		System.out.println("Perimeter of rectangl: " + perimeter);

	}
}
