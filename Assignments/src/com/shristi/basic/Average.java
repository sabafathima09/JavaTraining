package com.shristi.basic;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 10, 23, 5, 17, 99, 33, 42 };
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        double average = (double) sum / array.length;
        System.out.println(" Sum of all digits in the array: " + sum);
        System.out.println("   Average of all digits in the array: " + average);

	}

}
