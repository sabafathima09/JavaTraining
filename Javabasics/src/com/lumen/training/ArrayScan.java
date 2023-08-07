package com.lumen.training;

import java.util.Scanner;

public class ArrayScan {

	public static void main(String[] args) {
		int[] marks = new int[4];
		Scanner scanner = new Scanner(System.in);
		for(int i=0;i<4;i++) {
			 marks[i]= scanner.nextInt();
			 
		}
		int sum = 0;
		for(int num : marks) {
		sum+=num;
	}
	System.out.println(sum);
	scanner.close();
	
}
}
//
