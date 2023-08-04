package com.shristi.basic;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number9 = 153;
        int originalNumber9 = number9;
        int result9 = 0;
        int power9 = String.valueOf(number9).length();
        while (number9 > 0) {
            int digit = number9 % 10;
            result9 += Math.pow(digit, power9);
            number9 /= 10;
        }
        if (result9 == originalNumber9) {
            System.out.println( + originalNumber9 + " is an Armstrong number.");
        } else {
            System.out.println( + originalNumber9 + " is not an Armstrong number.");
        }

	}

}
