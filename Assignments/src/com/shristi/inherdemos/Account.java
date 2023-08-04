package com.shristi.inherdemos;

public class Account {
private double balance;

public Account(double initialbalance) {
	super();
	this.balance = initialbalance;
}
void withdraw(double amount) {
	if(balance<=amount) {
		 balance-=amount;
		System.out.println("withdraw:+amount");
	}else
	{
		System.out.println("insufficient balance");
	}
}
public void deposit(double amount) {
	balance+=amount;
	System.out.println("deposisted:+amount");
}
public double getBalance() {
    return balance;
}
}