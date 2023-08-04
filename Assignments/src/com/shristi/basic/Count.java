package com.shristi.basic;

		import java.util.HashMap;
		import java.util.Map;
		
		public class Count{
		    public static Map<Integer, Integer> countDuplicates(int[] arr) {
		        Map<Integer, Integer> countMap = new HashMap<>();
		        for (int num : arr) {
		            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
		        }
		        return countMap;
		    }

		    public static void main(String[] args) {
		        int[] arr = {1, 2, 3, 3, 4, 5, 5, 6};

		        // Count duplicates
		        Map<Integer, Integer> duplicates = countDuplicates(arr);

		        // Display the result
		        for (Map.Entry<Integer, Integer> entry : duplicates.entrySet()) {
		            if (entry.getValue() > 1) {
		                System.out.println(entry.getKey() + " occurs " + entry.getValue() + " times.");
		            }
		        }
		    }
		}
