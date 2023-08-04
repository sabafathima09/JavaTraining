package com.lumen.abs;

public abstract class Vehicle {
	String brand;
	String model;
	double price;
	
	void printDetails() {
		System.out.println("model");
		System.out.println("brand");
		System.out.println("price");
	}
	abstract void getMileage();
	abstract void showType();
	
}
