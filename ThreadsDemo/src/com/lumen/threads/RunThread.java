package com.lumen.threads;

class RunChild implements Runnable{
	Booking booking;
	int tickets;
	String counterName;
	
	public RunChild(String counterName,Booking booking,int tickets) {
		super();
		this.booking=booking;
		this.tickets=tickets;
		this.counterName=counterName;
		Thread thread = new Thread(this,counterName);
		thread.start();
		}
	
	public void run() {
		System.out.println(counterName);
//		synchronized(booking);
		double amount = booking.bookTickets(counterName, tickets);
		System.out.println(amount);
		

//		String tname = Thread.currentThread().getName();
//		for(int i=0; i<5;i++) {
//			System.out.println(Thread.currentThread().getName()+""+i);
//			try {
//				Thread.sleep(3000);
//			}catch(InterruptedException e) {
//				e.printStackTrace();
//		
//		another method
//		String tname = Thread.currentThread().getName();
//		Booking booking = new Booking();
//		double amount=booking.bookTickets(tname, 10);
//		System.out.println(amount);
			}
}

public class RunThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Booking booking=new Booking();
		RunChild child1  =new RunChild("Counter-A",booking,10);
		RunChild child2  =new RunChild("Counter-B",booking,100);
		RunChild child3  =new RunChild("Counter-C",booking,120);
		
		

//		another
//		RunChild child = new RunChild();
//		Thread thread1 = new Thread(child,"A");
//		thread1.start();
//		Thread thread2 = new Thread(child,"B");
//		thread2.start();
	}
}

