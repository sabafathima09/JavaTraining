package com.lumen.training;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		int x = 30;
		int y = 40;
		System.out.println("Sum = " +(x + y));
		System.out.println("\'Welcome to lumen\'");
//		float num = 34.6f;
		 
//		type casting 
//		byte to int (upcasting)
		
		byte a = 10;
		int b = a*2;
		long num = a+b;
		System.out.println(num);
		
		int num1 = (int)num;
		float amount = num1*num1;
		double result = amount+10.6;
		
		float data= (float)result;
		int c = (int)data;
		System.out.println(data);
		System.out.println(c);
		
//		since we have byte in range of -128 to +128 tht is total 255 characters 
//		including 0 its 256 characters so we will get 44 output 
		
		byte b1= 100;
//		byte b2 = 200;
//		byte b3 = (byte)(b1+b2);
//		int b4 = b1+b2;
		
		int x1 = 100;
		int x2 = 200;
		byte  x3 = (byte)(x1+x2);
		System.out.println(x3);
		

	}

}
