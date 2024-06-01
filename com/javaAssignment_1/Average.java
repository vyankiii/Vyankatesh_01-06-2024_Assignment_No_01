package com.javaAssignment_1;

import java.util.Scanner;

//4] Write a Java program that takes three numbers as input to calculate and print the average of the numbers.

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first number: ");
		double a = sc.nextDouble();

		System.out.print("Enter second number: ");
		double b = sc.nextDouble();

		System.out.print("Enter  third number: ");
		double c = sc.nextDouble();
		sc.close();

		// Calculate the average
		double avg = (a + b + c) / 3;

		// print average of three number
		System.out.println("Average of " + a + " , " + b + " and " + c + " = " + avg);

	}

}
