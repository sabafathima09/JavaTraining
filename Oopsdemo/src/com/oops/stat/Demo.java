package com.oops.stat;

import static java.lang.Integer.parseInt;
import static com.oops.stat.Trial.*;


public class Demo {
	static {
		System.out.println("static block in Demo");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main demo");
		getMessage();
	    int x=100;int y =200;
		System.out.println("Sum "+(Trial.x+Trial.y));
		
		int n = Integer.parseInt("100");
		System.out.println(n);

	}

}
