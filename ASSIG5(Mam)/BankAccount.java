package org.example.demo3;

import java.util.Scanner;

class BankHolder{
	  String name;
	  int balance;
   
	  public BankHolder() {
		  this.name="";
		  this.balance=0;
	  }	  
	  public BankHolder(String name, int balance) {
		  this.name=name;
		  this.balance=balance;
		    
	  }
	  public void deposite() {
		 Scanner sc = new  Scanner(System.in);
		 System.out.println("Enter Your Deposite Amount :- ");
		 String s = sc.nextLine();
		 if(50000 <= 100000) {
    		 System.out.println("your Amount has been Deposite :-"+ s);
		 }
    	 else {
    		 System.out.println("Your limit has been over :-");
    	 }
		 
	  }
	  public void withdraw() {
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter  your withdraw Amount :-");
		  String s1= sc.nextLine();
			 if(0 < 60000) {
	    		 System.out.println("your Amount has been wihtdraw :-"+ s1);
			 }
	    	 else {
	    		 System.out.println("Your limit has been Exceed :-");
	    	 }
	  }
		  public static int menuList() {
		Scanner sc = new Scanner(System.in);
		System.out.println("0.Exit");
		System.out.println("1.Deposite Amount");
		System.out.println("2.Withdraw");
		System.out.print("Enter choice	:	");
		return sc.nextInt();
	}
 
}
class savingAccount extends BankHolder{
	     public void deposite() {
	    	 super.deposite();
	     }
  
	    	 public void withdraw() {
	    		 super.withdraw();
	    	 }
}


public class BankAccount {
	public static void main(String[] args) {
		int choice;
		BankHolder util = new BankHolder();
		while( ( choice = BankHolder.menuList( ) ) != 0 ) {
			switch( choice ) {
			case 1:
				util.deposite();
				break;
			case 2:
				util.withdraw();
				break;
			}
		}
//		     BankHolder b = new BankHolder();
//		     b.deposite();
//		     b.withdraw();
//		     
	}
	
}


