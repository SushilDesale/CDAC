package org.example.demo1;

import java.util.Scanner;

public class Arry1 {

	public static void main(String[] args) {
 
		 int [] num = new int[5];
		 
		 System.out.println("Default Value");
		 for (int a : num) {
			 System.out.println(num);
		
		}
		 
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter 5 intergers");
		  for (int i = 0; i < num.length; i++) {
			  num[i] = sc.nextInt();

		}
		  System.out.println("updates Value");
		  for (int i : num) {
			System.out.println(i);
			sc.close();
		}
	}

}
