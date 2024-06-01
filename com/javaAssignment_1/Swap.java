package com.javaAssignment_1;
//8] Write a Java program to swap two variables.

public class Swap {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int temp;

		// Swapping of numbers using third variable
		System.out.println("Before swapping Values a: " + a + " b: " + b); // using
		temp = a;
		a = b;
		b = temp;
		System.out.println("After swapping Values a: " + a + " b: " + b);

	}

}
