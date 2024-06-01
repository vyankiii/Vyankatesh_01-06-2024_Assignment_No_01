package com.javaAssignment_1;

import java.util.Scanner;

//3]Write a Java program that takes a number as input and prints its multiplication table up to 10.

public class MultiplicationTable {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num = sc.nextInt();
		sc.close();
//		loop start execution form and execute until the condition i<=10 becomes false
		for (int i = 0; i <= 10; i++) {
			int mul = num * i;
//			prints table of the entered number
			System.out.println(num + " * " + i + " = " + mul);
		}

	}
}
