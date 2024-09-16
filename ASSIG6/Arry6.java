package org.example.demo1;


public class Arry6{
	public static void main(String[] args) {
         int [] num = {1, 3, 2, 5};
         int n = 5;
         
         int sum = n * 	(n + 1) / 2;
	     int sum2 = 0;
	     
	     for(int a : num ) {
	    	  sum2 += a;
	     }
	     int missing = sum - sum2;
	     System.out.println("Missing numbers :- "+missing);
	}
	}

