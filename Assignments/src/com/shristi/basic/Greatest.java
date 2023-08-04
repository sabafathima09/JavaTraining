package com.shristi.basic;

public class Greatest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = { 10, 23, 5, 17, 99, 33, 42 };
        int greatest = array1[0];
        for (int i = 1; i < array1.length; i++) {
            if (array1[i] > greatest) {
                greatest = array1[i];
            }
        }
        System.out.println("1. The greatest number in the array is: " + greatest);

	}

}
