package org.example.demo6;

import java.util.Scanner;

class Vehicle{
	  public void startEngine() {
		  
		  
	  }
	  public void stopEngine() {
		  
	  }
}
class Car extends Vehicle{
	public void startEngine() {
		System.out.println("Car engine has been Started !!");
	}
	 public void stopEngine() {
		  System.out.println("Car engine Be Stoped \n");
	  }
}
class Motorcycle extends Vehicle{
	 public void startEngine() {
		  System.out.println("Motorcycle engine Be Stoped");
	  }
	  public void stopEngine() {
		  System.out.println("Motorcycle engine Be Stoped");
	  }
}
public class Machin {
 public static void main(String[] args) {
	 //  System.out.println("Enter a Which vehicle you want :- ");
	   Vehicle v = new Car();
	   Vehicle v1= new Motorcycle();
      
	   System.out.println("Car Engine :- ");
	   v.startEngine();
	   v.stopEngine();
	   
	   System.out.println("Motorcycle Enigne :- ");
	   v1.startEngine();
	   v1.stopEngine();
 }
}
