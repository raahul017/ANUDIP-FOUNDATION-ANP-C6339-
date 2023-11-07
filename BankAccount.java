package com.learning;

public class BankAccount {
	
	String accountHolderName;
	int accountNumber;
	int balance;
	
	//constructor
	
	public BankAccount(String accountHolderName, int accountNumber, int balance) {
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	//getter and setter method
	
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	//methods
	
	public String deposit(int deposit)
	{
		balance=balance+deposit;
		
		return (balance>=5000 ? "Minimum balance is maintained" : "Minimum balance is not mainitained");

	}
	
	
	public String withdraw(int withdraw)
	{
		if(withdraw<=balance)
		balance=balance-withdraw;
		else
		System.out.println("low balnce!!!");
		
		return (balance>=5000 ? "Minimum balance is maintained" : "Minimum balance is not mainitained");

	}
	
	
	public static void main(String[] args)
	{
		
		BankAccount bank = new BankAccount("Vaishnavi",342326, 10000);
		System.out.println("a/c no "+ bank.getAccountNumber());
		System.out.println("a/c holder name  "+ bank.getAccountHolderName());
		System.out.println("a/c balace "+ bank.balance);
		
		String msg= bank.deposit(1000);
		System.out.println(msg);
		System.out.println("Balance after depost " + bank.getBalance());
		msg=bank.withdraw(7000);
		System.out.println(msg);
		System.out.println("Balance after withdraw " + bank.getBalance());
		
		
		
	}


}