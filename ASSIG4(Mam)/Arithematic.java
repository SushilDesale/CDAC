package org.example.demo1;

import java.util.Scanner;

public class Arithematic {

	public static void main(String[] args) {
         
		System.out.println("Enter the Numbers \n ");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the integer number :- ");
		int n = sc.nextInt();
		
		System.out.println("Enter the double number :- ");
		double d = sc.nextDouble();
		
		System.out.println("Enter the float number :- ");
		float f= sc.nextFloat();
		
		double sum = (n + d + f);
		System.out.println("Sum of Three Numbers :- "+sum);
		
		
	}

}
