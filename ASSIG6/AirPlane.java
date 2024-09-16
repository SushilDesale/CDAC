package org.example.demo1;

import java.util.Scanner;

public class AirPlane{
	private boolean [] [] seats;
	
	  public  AirPlane(int rows , int colm) {
		  seats = new boolean [rows][colm];
		  
	  }
	  public void bookSeat(int rows, int col) {
		  if (rows < 0 || rows >=seats.length || col < 0 || col >= seats[0].length) {
			  System.out.print("Wrong Seat Possition");
			  return;
		}
		  seats[rows][col]=true;
	  }
	  public void cancelBooking(int rows, int col) {
		  if ( rows <0 || rows >= seats.length || col < 0 ||col >=seats[0].length) {
			  System.out.print("Wrong Seat Possition");
			  return;
		  }
		  seats[rows][col]=false;
	  }
	  
	  public boolean checkSeatAvila(int rows,int col) {
		  if (rows < 0 || rows >= seats.length || col < 0 || col >= seats[0].length) {
			  System.out.println("Wrong Seat Possiton");
			  return false;
		  }
		  return !seats[rows][col];
	  }
	  
	  public void showseatingchart() {
		  System.out.println("Seating Chart");
		  for (int i=0 ; i<  seats.length ;i++) {
			  for (int j = 0 ; j <seats[i].length;j++) {
				  System.out.print(seats[i][j] ? "x " : "O " );
			  }
			  System.out.println();
		  }
	  }
	    public static void main(String[] args) {
	        AirPlane  a = new AirPlane(5, 6);
	        Scanner sc = new Scanner(System.in);
	        
	        a.bookSeat(2, 3);
	        a.cancelBooking(2, 3);
	        System.out.println("Is seat (2,3) available? " + a.checkSeatAvila(2, 3));
	        a.showseatingchart();
	        
	        sc.close();
	        
	    }
	}
