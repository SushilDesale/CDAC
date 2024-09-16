package org.example.demo1;

public class Arry3{
	public static void main(String[] args) {
       int [] num = {1 , 4 , 5 , 2 , 3 };
       
       
       if(num.length == 0) {
    	   System.out.println("Array is empty");
    	   return;
       }
       
       int max = num[0];
       int min = num[0];
       
       for(int i : num) {
    	 if( i > max) {
    	     max = i ;
    	 }
    	 if( i < min) {
    		 min = i;
       }
   }  

        System.out.println("Maximum value :- "+ max);
        System.out.println("Minimun value :- "+ min);

	}

}

