package com.lumen.assignment;

import java.util.Scanner;

public class Registration {

	public static void main(String[] args) {
		String username[] = {"Saba", "fathima"};
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter username");
		String uname = scanner.nextLine();
		boolean flag=true;
		for (String name : username) {
			if (name.equals(uname)) {
				System.out.println("user name already exists");
//				System.out.println("you are registered");
			}
//				System.out.println("name is not unique");
		}
		if(flag) {
			System.out.println("you are registered");
		}		
	}
}
