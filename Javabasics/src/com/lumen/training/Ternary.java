package com.lumen.training;

public class Ternary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int x = 200;
//		String result = x > 300 ?"Hello":"welcome";
//		System.out.println(result);
		
		int a = 10;
		int b = 20;
		int c = 30;
		String answer = a > b && a < c?"a is greater":(b>c?"b is greater":"c is greater");
		System.out.println(answer);
	}

}
