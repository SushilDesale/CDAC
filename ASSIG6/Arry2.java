package org.example.demo1;

import java.util.Scanner;

public class Arry2{
	  private int []num = new int[5];
 

 public  void acceptRecord() {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter 5 interger Value :- ");
	 for(int i =0; i <num.length ;i++) {
		  num [i] = sc.nextInt();
		  sc.close();
	 }
 }
   public void printRecord() {
	   System.out.println("Array new Value");
	   for(int num : num) {
		   System.out.println(num);
	   }
   }

	public static void main(String[] args) {
        Arry2 a = new Arry2();
        a.acceptRecord();
        a.printRecord();
	    
	}

}

