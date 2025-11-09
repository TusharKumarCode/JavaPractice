package com.tushar;

public class CheckAge {
     
	 public int dl(int age) {
		 
		 if(age>18 && age<70) {
			 
			 System.out.println("user is eligible for driving");
		 }
		 
		 else {
			 
			 System.out.println("user is not eligible for driving");
		 }
		 
		 return age;
	 }
}
