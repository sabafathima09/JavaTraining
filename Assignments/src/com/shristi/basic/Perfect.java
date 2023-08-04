package com.shristi.basic;

public class Perfect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int number10 = 28;
	        int sum10 = 0;
	        for (int i = 1; i <= number10 / 2; i++) {
	            if (number10 % i == 0) {
	                sum10 += i;
	            }
	        }
	        if (sum10 == number10) {
	            System.out.println( + number10 + " is a perfect number.");
	        } else {
	            System.out.println(+ number10 + " is not a perfect number.");
	        }
	}

}
