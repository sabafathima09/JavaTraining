package com.shristi.basic;

public class SecondlargestArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array6 = { 10, 23, 5, 17, 99, 33, 42 };
        int secondLargest = Integer.MIN_VALUE;
        int largest6 = Integer.MIN_VALUE;
        for (int num : array6) {
            if (num > largest6) {
                secondLargest = largest6;
                largest6 = num;
            } else if (num > secondLargest && num != largest6) {
                secondLargest = num;
            }
        }
        System.out.println("6. The second largest number in the array is: " + secondLargest);
	}
}
