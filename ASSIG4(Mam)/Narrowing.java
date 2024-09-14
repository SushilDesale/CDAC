package org.example.demo1;

public class Narrowing {
  public static void main(String[] args) {
	   
	  double d = 30.5;
	  int a = 20;
	  float f = 40.50f;
	  
	  int c = (int) d;
	  int b= (int ) f;
	  System.out.println("Narrowing :- "+c);
	  System.out.println("Narrowing :- "+b);
	  System.out.println("In that case data will be loss in narrowing");

	  
	  
}
}
