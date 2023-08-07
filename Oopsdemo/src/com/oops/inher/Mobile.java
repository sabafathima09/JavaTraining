package com.oops.inher;

public class Mobile extends Electronic {

	String Cameratype;

	public Mobile(String model, double price, String brand, String Cameratype) {
		super(model, price, brand);
		this.Cameratype = Cameratype;
	}
	
	void showCameratype() {
		System.out.println("model has " + Cameratype);
}
}
