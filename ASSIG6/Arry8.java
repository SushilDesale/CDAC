package org.example.demo1;

import java.util.Scanner;

public class Arry8{
	    private int[] num;

	    public Arry8(int size) {
	        num = new int[size];
	    }
	    public void setNumbers(int[] n) {
	        this.num = n;
	    }
	    public int[] getNumbers() {
	        return num;
	    }
	   
	    public void setNumbers() {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter " + num.length + " integers:");
	        for (int i = 0; i < num.length; i++) {
	            num[i] = sc.nextInt(); 
	      }
            sc.close();

	    }
	    public void printNumbers() {
	        System.out.println("Array values:");
	        for (int i : num) {
	            System.out.println(i);
	        }
	    }
	    public static void main(String[] args) {
	    	Arry8 handler = new Arry8(5);
	        handler.setNumbers();
	        handler.printNumbers();

	    }
	}
