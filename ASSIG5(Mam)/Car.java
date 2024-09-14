package org.example.demo2;

import java.util.Scanner;

class Vehicle{
	  String Company;
	  int year;
	  
	  public Vehicle() {
		  this.Company="";
		  this.year=0;
	  }
	  public Vehicle(String company,int year) {
		  this.Company=company;
		  this.year=year;
	  }
	public String getCompany() {
		return Company;
	}
	public void setCompany(String company) {
		Company = company;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void acceptRecord() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Car Brand Company Name :");
		String s = sc.nextLine();
		
		System.out.println("Enter Manufacture Year :");
		int n = sc.nextInt();
		System.out.println("Car Brand Is : "+s+"\nManufacture year is : "+n);
	
		sc.close();
	}
	public void Printrecord() {
		System.out.println("Car Company           :"+this.Company);
		System.out.println("Manufactur Year       :"+this.year);
	}
	public String toString() {
		return this.Company+"   "+this.year;
	}
	
}
public class Car {

	public static void main(String[] args) {
		Vehicle v = new Vehicle();
//      v.setCompany("Toyota");
//		v.setYear(20);
		v.acceptRecord();
		//v.Printrecord();
		
		
	}

}
