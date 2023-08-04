package com.shristi.basic;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 14. Pattern 1 23 456 789
        int num = 1,rows=2;
        System.out.println("Pattern 1 23 456 789");
        for (int i = 1; i <=rows; i++) { 
            for (int j = 1; j <= i; j++) {
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
}
}