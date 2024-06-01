package com.javaAssignment_1;
//13] Write a Java program that takes a year from the user and prints whether it is a leap year or not.

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter year: ");
		int year = sc.nextInt();
		sc.close();

		// Calculate year is leap or not
		if ((year % 400 == 0) || ((year % 100 != 0) && (year % 4 == 0)))
			System.out.println(year + " is a leap year");
		else
			System.out.println(year + " is not a leap year");

	}
}
