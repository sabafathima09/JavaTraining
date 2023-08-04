package com.shristi.basic;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int number12 = 17;
	        boolean isPrime = true;
	        if (number12 <= 1) {
	            isPrime = false;
	        } else {
	            for (int i = 2; i <= Math.sqrt(number12); i++) {
	                if (number12 % i == 0) {
	                    isPrime = false;
	                    break;
	                }
	            }
	        }
	        if (isPrime) {
	            System.out.println(+ number12 + " is a prime number.");
	        } else {
	            System.out.println(+ number12 + " is not a prime number.");
	        }
	}

}
