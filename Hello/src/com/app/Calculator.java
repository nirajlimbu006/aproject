package com.app;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
//		int num1 = 10;
//		int num2 = 20;
//		int result = num1+num2;
//		System.out.println("Sum if num1 + num2 => " + result);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int num1 = sc.nextInt();
		
		System.out.println("Enter second number");
		int num2 = sc.nextInt();
		
		int result = num1 + num2;
		System.out.println("The result is : " + result);
		
		sc.close();
	}

}
