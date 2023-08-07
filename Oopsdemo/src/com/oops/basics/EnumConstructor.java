package com.oops.basics;

enum VehicleDetails{
	HONDA("CITY",900000),
	AUDI("A100",4000000),
	BENZ("A90",1000000);
	
    private String model;
	private double price;
	private VehicleDetails(String brand,double price) {
		this.model = model;
		this.price = price;
	}
	public String getBrand() {
	return model;
	}
    public double getPrice() {
    	return price;
    }
}
    
    public class EnumConstructor{
    	public static void main(String[] args) {
			VehicleDetails vehicle = VehicleDetails.AUDI;
			System.out.println("Model" + vehicle.getBrand());
			System.out.println("Price" + vehicle.getPrice());
    	String modelofhonda=VehicleDetails.HONDA.getBrand();
    	double priceofhonda=VehicleDetails.HONDA.getPrice();

    	System.out.println(modelofhonda);
    	System.out.println(priceofhonda);
    	
    }
}