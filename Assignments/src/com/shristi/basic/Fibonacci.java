package com.shristi.basic;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
        int firstNum = 0;
        int secondNum = 1;
        System.out.print("Fibonacci Series: " + firstNum + " " + secondNum + " ");
        for (int i = 2; i < n; i++) {
            int nextNum = firstNum + secondNum;
            System.out.print(nextNum + " ");
            firstNum = secondNum;
            secondNum = nextNum;
        }
        System.out.println();
	}

}
