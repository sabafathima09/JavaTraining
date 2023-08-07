package com.lumen.threads;

class Child extends Thread {

	public Child(String name,int priority) {
		super(name);
		this.setPriority(priority);
		System.out.println(this);
		this.start();
			
		}
		// TODO Auto-generated constructor stub
	public void run() {
		// TODO Auto-generated method stub
		String tname = Thread.currentThread().getName();
//		for(int i=0;i<5;i++) {
//			System.out.println(tname+" "+i);
		for(int i=0; i<5;i++) {
			System.out.println(Thread.currentThread().getName()+""+i);
			try {
				Thread.sleep(3000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class ExThread{
	public static void main(String[] args) {
//		Thread child1=new Child();
//		child1.setName("Poppy");
//		child1.setPriority(Thread.MAX_PRIORITY);
//		
//		Thread child2=new Child();
//		child2.setName("bat");
//		child2.setPriority(Thread.MIN_PRIORITY);
//		
//		Thread child3=new Child();
//		child3.setName("cat");
//		child3.setPriority(Thread.NORM_PRIORITY);
//		child1.start();
//		child2.start();
//		child3.start();
		
//		instaed of starting this threads again and again we can use this 
		Thread child1=new Child("A",Thread.MAX_PRIORITY);
		Thread child2=new Child("B",Thread.MIN_PRIORITY+2);
		Thread child3=new Child("C",Thread.NORM_PRIORITY+3);
		
		for(int i=0; i<5;i++) {
			System.out.println(Thread.currentThread().getName()+""+i);
			try {
				Thread.sleep(3000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}