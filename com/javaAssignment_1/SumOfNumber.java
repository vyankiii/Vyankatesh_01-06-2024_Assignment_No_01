package com.javaAssignment_1;

import java.util.Scanner;

//2]Write a Java program that takes two values as input and displays the sum of two numbers

public class SumOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// take the input from the user
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first Number: ");
		int a = sc.nextInt();
		System.out.print("Enter the Second Number: ");
		int b = sc.nextInt();
		sc.close();
		// calculate the sum
		int sum = a + b;
		// Print The result
		System.out.println("sum of " + a + " and " + b + " is :" + sum);

	}

}
