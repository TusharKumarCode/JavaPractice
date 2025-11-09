package com.tushar;

import java.util.Scanner;

public class ForLoan {
    
	 public void cust(int balance,int income) {
		 
		 Scanner scanner= new Scanner(System.in);
		 
		 System.out.println("enter your account balance:");
		 int num= scanner.nextInt();
		 
		 System.out.println("enter your monthly income:");
		 int num1=scanner.nextInt();
		 
		 if(num>balance || num1>income) {
			 
			 System.out.println("you are eligible for loan");
		 }
		 
		 else {
			 
			 System.out.println("you are not eligible for loan. your account balance must be more than 100000 or your monthly income is above 20000");
		 }
		 
		 scanner.close();
	 }
}
