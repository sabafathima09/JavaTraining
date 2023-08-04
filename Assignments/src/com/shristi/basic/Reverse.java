package com.shristi.basic;

import java.util.Arrays;

public class Reverse {
    public static void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // Swap elements at left and right indices
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            // Move the pointers towards the center
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        // Display the original array
        System.out.println("Original array: " + Arrays.toString(arr));

        // Reverse the array
        reverseArray(arr);

        // Display the reversed array
        System.out.println("Reversed array: " + Arrays.toString(arr));
    }
}