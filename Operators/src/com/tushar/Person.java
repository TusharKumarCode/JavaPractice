package com.tushar;

import java.util.Scanner;

public class Person {
     
	 public void details() {
		 
		 Scanner scanner= new Scanner(System.in);
		 
		 System.out.println("enter your age:");
		 int age=scanner.nextInt();
		 
		 scanner.nextLine();
		 
		 System.out.println("enter your salary:");
		 int salary=scanner.nextInt();
		 
		 scanner.nextLine();
		 
		 System.out.println("enter your name:");
		 String name=scanner.nextLine();
		 
		 System.out.println("age is valid "+age);
		 System.out.println("salary is valid "+salary);
		 System.out.println("name is valid "+name);
		 
		 scanner.close();
	 }
}
