package org.example.demo1;

import java.util.Scanner;

public class Arry7{
	private int [] num;
	
	public Arry7(int s) {
		num = new int [s];
	}
	
	public void acceptRecord() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no :- "+ num.length +" integer");
		for( int i=0 ;i < num.length ; i++) {
			 num [i] = sc.nextInt();
			 sc.close();
		}
	}
	public void printRecord() {
		System.out.println("Array VAlue");
		for( int i :  num) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
          Arry7 a = new  Arry7(7);
          a.acceptRecord();
          a.printRecord();
		
	}
	}

