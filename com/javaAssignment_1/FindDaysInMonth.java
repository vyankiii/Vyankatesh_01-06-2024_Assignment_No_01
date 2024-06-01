package com.javaAssignment_1;
// 12] Java program to check whether a character is a VOWEL or CONSONANT using switch statement

import java.util.Scanner;

public class FindDaysInMonth {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter month between (1- 12): ");
		int month = sc.nextInt();

		System.out.println("Enter Year: ");
		int year = sc.nextInt();
		sc.close();
		switch (month) {
		// 31 Days
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("Number of days is 31");
			break;

		// 30 Days
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("Number of days is 30");
			break;

		// 28 or 29 Days for feb
		case 2:
			if ((year % 400 == 0) || ((year % 100 != 0) && (year % 4 == 0)))
				System.out.println("Number of days is 29");
			else
				System.out.println("Number of days is 28");
			break;

		default:
			System.out.println("Invalid Month...");
			break;
		}

	}
}
/*
 * January - 31 days February - 28 days in a common year and 29 days in leap
 * years March - 31 days April - 30 days May - 31 days June - 30 days July - 31
 * days August - 31 days September - 30 days October - 31 days November - 30
 * days December - 31 days
 */
