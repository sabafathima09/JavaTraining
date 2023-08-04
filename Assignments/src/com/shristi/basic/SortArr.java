package com.shristi.basic;

import java.util.Arrays;

public class SortArr {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};

        // Sort the array in ascending order
        Arrays.sort(arr);

        // Display the sorted array
        System.out.println("Sorted array in ascending order: " + Arrays.toString(arr));
    }
}
