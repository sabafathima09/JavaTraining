package com.shristi.scan;

import java.util.Scanner;

public class SquareRootArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] numbersArray = new int[size];
        double[] squareRootArray = new double[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            numbersArray[i] = scanner.nextInt();
            squareRootArray[i] = Math.sqrt(numbersArray[i]);
        }
        System.out.println("Square root array: ");
        for (double squareRoot : squareRootArray) {
            System.out.print(squareRoot + " ");
        }
    }
}