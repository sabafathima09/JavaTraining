package com.oops.basics;

public class Employee {
     String empName;
	 double salary;
	 int empId;
	public static void main(String[] args) {
		Employee employee = new Employee();
		
		System.out.println(employee.empName);
		System.out.println(employee.empId);
		
		employee.empName = "Saba";
		employee.empId = 121;
		employee.salary = 2000;
		
		System.out.println("Employee Name: " + employee.empName);
		System.out.println("Employee Id: " + employee.empId);
		System.out.println("Employee Salary: " + employee.salary);
		
		Employee employee1 = new Employee();
		employee.empName = "Rakshita";
		employee1.empId = 121;
		employee1.salary = 1000;
		
		System.out.println("Employee Name: " + employee1.empName);
		System.out.println("Employee Id: " + employee1.empId);
		System.out.println("Employee Salary: " + employee1.salary);
	}
}
