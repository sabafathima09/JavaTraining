package com.shristi.basic;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // 13. Pattern 1 22 333 4444
		 int rows = 4;
	        System.out.println("Pattern 1 22 333 4444");
	        for (int i = 1; i <= rows; i++) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print(i);
	            }
	            System.out.println();
	        }

	}

}
