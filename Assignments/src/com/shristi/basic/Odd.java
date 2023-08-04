package com.shristi.basic;

public class Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(" Odd numbers up to 20: ");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
	}

}
