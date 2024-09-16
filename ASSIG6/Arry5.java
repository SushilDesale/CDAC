package org.example.demo1;

import java.util.HashSet;
import java.util.Set;

public class Arry5{
	public static void main(String[] args) {
         int [] num1 = {1, 2, 3, 4 ,5 , 6};
         int [] num2 = {2, 5, 6, 7, 1, 4};
         
         Set<Integer> a1 = new HashSet<>();
         for ( int i : num1) {
        	 a1.add(i);
	     }
         
         Set<Integer> a2 = new HashSet<>();
         for (int i : num2) {
        	 if(a1.contains(i)) {
        		 a2.add(i);
        	 }
         }
         
         System.out.println("intersection");
         for(int i : a2) {
        	 System.out.println(i);
         }
	}
	
}

