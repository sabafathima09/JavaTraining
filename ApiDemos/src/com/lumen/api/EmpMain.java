package com.lumen.api;

public class EmpMain {
	public static void main(String[] args) {
		Employee employee = new Employee("saba",90,5000);
		System.out.println(employee);
		
		int x = 10;
		long y = x;//upcasting
		Long a = y;//autoboxing
		
		int b = (int)y;//downcasting
		
		//convert to obj
		Object o = a;//this is of type long 
		
		//trying to downcast will through classcast exception
		Integer i = (Integer)o;//exception
	}

}
