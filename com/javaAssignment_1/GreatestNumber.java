package com.javaAssignment_1;
//11] Write a Java program that takes three numbers from the user and prints the greatest number.

import java.util.Scanner;

public class GreatestNumber {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Enter three numbers
		System.out.print("First number: ");
		double a = sc.nextDouble();

		System.out.print("Second number: ");
		double b = sc.nextDouble();

		System.out.print("Third number: ");
		double c = sc.nextDouble();

		// Close the scanner
		sc.close();

		// Calculate the greatest number 
		double greatest = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);

		System.out.println("greatest number is: " + greatest);

	}
}
