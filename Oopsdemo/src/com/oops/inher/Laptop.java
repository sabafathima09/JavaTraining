package com.oops.inher;

public class Laptop extends Electronic {
String[] ports;
		
public Laptop(String model, double price, String brand, String[] ports) {
	super(model, price, brand);
	this.ports = ports;
}
	
	void showports() {
		for (String port : ports) {
			System.out.println(port);
		}
	}
}
