package com.lumen.training;

public class Twodim {
public static void main(String[] args) {
	int [][] marks = new int[3][2];
	marks[0][0]=100;
	marks[0][1]=200;
	marks[1][0]=400;
	marks[1][1]=500;
	marks[2][0]=600;
	marks[2][1]=900;
	int sum = 0;
	for(int one[]:marks)
		for(int num:one)
			sum+=num;
    System.out.println(sum);
}
}
