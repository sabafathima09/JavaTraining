package com.lumen.training;

import java.util.Scanner;

public class ScanDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter details");
		System.out.println("Enter Name");
		String name = scanner.nextLine();
		System.out.println("Name:-"+name);
		System.out.println("Enter ID");
		int id = scanner.nextInt();
		System.out.println("Id:-" +id);
		scanner.nextLine();
		System.out.println("Enter city");
		String city = scanner.next();
		System.out.println("city:-"+ city);
		System.out.println("Enter Salary");
		double salary =  scanner.nextDouble();
		System.out.println("Salary:-"+ salary);
	}

}
