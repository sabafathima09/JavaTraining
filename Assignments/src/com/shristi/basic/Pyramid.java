package com.shristi.basic;

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //Pyramid with stars - half up to *** ***
		int rows=9;
	        System.out.println("Pyramid with stars - half up to *** ***");
	        for (int i = 1; i <= rows; i++) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	        for (int i = rows - 1; i >= 1; i--) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	}
}