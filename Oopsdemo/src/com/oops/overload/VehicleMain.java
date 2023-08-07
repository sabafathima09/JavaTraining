package com.oops.overload;

public class VehicleMain {

	public static void main(String[] args) {
	Vehicle vehicle  = new Vehicle();
	vehicle.print();
	System.out.println();
	vehicle = new Vehicle("A100");
	vehicle.print();
	System.out.println();
	vehicle = new Vehicle("A100",200000);
	vehicle.print();
	System.out.println();
	vehicle = new Vehicle("A100","MERCEDEZ ", 212000);
	vehicle.print();
	
	
	}

}

