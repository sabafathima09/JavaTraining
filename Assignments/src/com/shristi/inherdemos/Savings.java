package com.shristi.inherdemos;

public class Savings extends Account {

	public Savings(double initialbalance) {
		super(initialbalance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		if(amount<=getBalance()&&amount<=1000) {
		super.withdraw(amount);
	}else {
		System.out.println("insufficient balance");
	}
	}

	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		super.deposit(amount);
	}

}
