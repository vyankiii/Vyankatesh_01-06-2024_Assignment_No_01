package com.javaAssignment_1;
//15] Write a Java program to Find Quotient and Remainder for a given number.

import java.util.Scanner;

public class QuotientAndRemainder {
	public static void main(String[] args) {

		System.out.println("Enter the two Numbers :");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();
		int quotient = 0, remainder = 0;

		// Calculate quotient
		quotient = num1 / num2;

		// Calculate remainder
		remainder = num1 % num2;

		// Print Quotient and Remainder
		System.out.println("The quotient of " + num1 + " and " + num2 + " = " + quotient);
		System.out.println("The Reminder of " + num1 + " and " + num2 + " = " + remainder);

	}

}
