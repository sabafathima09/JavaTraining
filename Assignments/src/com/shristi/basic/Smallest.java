package com.shristi.basic;

public class Smallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] array2 = { 10, 23, 5, 17, 99, 33, 42 };
	        int smallest = array2[0];
	        for (int i = 1; i < array2.length; i++) {
	            if (array2[i] < smallest) {
	                smallest = array2[i];
	            }
	        }
	        System.out.println("2. The smallest number in the array is: " + smallest);

	}

}
