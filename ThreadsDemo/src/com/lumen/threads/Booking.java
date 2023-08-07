package com.lumen.threads;

public class Booking {

	public synchronized double bookTickets(String name,int noOfTickets) {
		double costPerTicket=200;
		System.out.println("booked for"+name);
		double totalPrice=costPerTicket*noOfTickets;
//		System.out.println("Total"+totalPrice);
//		return totalPrice;
//		
		// TODO Auto-generated method stub

		System.out.println("Total"+totalPrice);
		return totalPrice;
		
	}

}
