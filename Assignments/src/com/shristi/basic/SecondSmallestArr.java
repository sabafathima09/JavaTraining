package com.shristi.basic;

public class SecondSmallestArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array5 = { 10, 23, 5, 17, 99, 33, 42 };
        int secondSmallest = Integer.MAX_VALUE;
        int smallest5 = Integer.MAX_VALUE;
        for (int num : array5) {
            if (num < smallest5) {
                secondSmallest = smallest5;
                smallest5 = num;
            } else if (num < secondSmallest && num != smallest5) {
                secondSmallest = num;
            }
        }
        System.out.println("The second smallest number in the array is: " + secondSmallest);

	}

}
