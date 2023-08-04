package com.lumen.assignment;

import java.util.Scanner;

public class login {

	public static void main(String[] args) {
		String username[] = {"Saba", "fathima"};
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter username");
		String uname = scanner.nextLine();
		boolean flag=false;
		for (String name : username) {
			if (name.equals(uname))
			flag = true;
			break;
		}
				System.out.println("user logged in ");
				scanner.close();
//			
	}

}
