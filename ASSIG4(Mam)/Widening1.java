package org.example.demo1;

public class Widening1 {

	public static void main(String[] args) {
  
		int a=20;
		
		double d=a;
		System.out.println(d);
		
		float f = a;
		System.out.println(f);
		
	//  boolean b = a; not okkk
		boolean b =( a != 0);
		System.out.println(b);
		
	//	String s = a; not okk
		String s = Integer.toString(a);
		System.out.println(s);

		
	}

}
