package com.lumen.abs;

public class VehicleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vehicle = new Bike("Duke","Pulsar 180",400000,"200CC");
		vehicle.printDetails();
		
		Bike bike = (Bike)vehicle;
		bike.engineType();
		bike.getMileage();
		bike.showType();
		
		Car car = (Car)vehicle;
		car.Accessories();
		car.getMileage();
		car.showType();

	}

}
