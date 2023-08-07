package com.oops.inher;

public class InManager extends Inemployee {
	
	double salary;
	public InManager(String name,int employeeId,double salary){
		super(name,employeeId);
		this.salary=salary;
	}
	void printBonus(double amount) {
		System.out.println(salary+amount);
	}
}