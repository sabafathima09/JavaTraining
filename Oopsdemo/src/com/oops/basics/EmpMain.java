package com.oops.basics;

public class EmpMain {
	 public static void main(String[] args) {
		Employees employee  = new Employees("Ram" , 12 , 2000.0);

		employee.empName = "Saba";
		employee.empId = 121;
		employee.salary = 2000;
		
		employee.printDetails();
			String result = employee.greet("great day");
			System.out.println(result);
			
			Employees employee1  = new Employees("Ram" , 12 , 2000.0);
			employee1.empName = "Saba";
			employee1.empId = 121;
			employee1.salary = 2000;
			
			employee1.printDetails();
			  System.out.println(employee1.greet("Welcome"));
	 }
}
