package org.example.demo1;

import java.util.HashSet;
import java.util.Set;

public class Arry4{
	public static void main(String[] args) {
        
		int [] num = {1, 2, 4, 5, 1, 4,  2, 5};
		 
		Set<Integer> uniqnum = new HashSet<>();
		
		for (int i : num ) {
			uniqnum.add(i);
		}
		
		System.out.println("Array Of duplicate value Remove");
		for(int i : uniqnum) {
			System.out.println(i);
		}
	}

}

