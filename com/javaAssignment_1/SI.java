package com.javaAssignment_1;

//14] Write a Java program to Calculate Simple Interest for a given amount, rate of interest and time duration.
import java.util.Scanner;

public class SI {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Amount: ");
		double amount = sc.nextDouble();
		System.out.println("Enter rate: ");
		double rate = sc.nextDouble();
		System.out.println("Enter year:");
		double year = sc.nextDouble();
		sc.close();

		// calculate Simple Interest
		double SI = amount * rate * year / 100;
		// print Simple Interest
		System.out.println("Simple Interest is : " + SI);

	}
}
