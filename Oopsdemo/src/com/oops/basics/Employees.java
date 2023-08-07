package com.oops.basics;

public class Employees {
 String empName;
 int empId;
 double salary;
 
 Employees(String name,int id,double sal){
	 this.empName = empName;
	 this.empId  = empId;
	 this.salary =salary;
 }
 
 void printDetails() {
	 System.out.println("Employee name" +empName);
	 System.out.println("Employee empId" +empId);
	 System.out.println("Employee salary" +salary);
 }
 
	 String greet(String msg) {
		 return msg + empName;
	 }
	 }