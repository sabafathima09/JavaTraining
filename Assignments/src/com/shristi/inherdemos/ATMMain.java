package com.shristi.inherdemos;

import java.util.Scanner;
 
public class ATMMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        double initialBalance = 1000; // Initial balance for the account
        
        // Create an instance of Savings and Current accounts
        Savings savingsAccount = new Savings(initialBalance);
        Current currentAccount = new Current(initialBalance);

        System.out.println("Select account type: (1) Savings (2) Current");
        int accountType = scanner.nextInt();

        // Dynamic method dispatch based on account type
        Account selectedAccount = (accountType == 1) ? savingsAccount : currentAccount;

        System.out.println("Account balance: $" + selectedAccount.getBalance());
        System.out.println("Select transaction type: (1) Withdraw (2) Deposit");
        int transactionType = scanner.nextInt();

        switch (transactionType) {
            case 1:
                System.out.println("Enter withdrawal amount: ");
                double withdrawalAmount = scanner.nextDouble();
                selectedAccount.withdraw(withdrawalAmount);
                break;

            case 2:
                System.out.println("Enter deposit amount: ");
                double depositAmount = scanner.nextDouble();
                selectedAccount.deposit(depositAmount);
                break;

            default:
                System.out.println("Invalid transaction type.");
        }

        System.out.println("Updated account balance: $" + selectedAccount.getBalance());
        scanner.close();
    }
	
}
