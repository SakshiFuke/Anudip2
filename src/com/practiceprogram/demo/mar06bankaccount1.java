package com.practiceprogram.demo;

abstract class BankAccount1
{
	private String accountNo;
	private double balance;
	
	public BankAccount1(String accountNo, double balance) {
		this.accountNo = accountNo;
		this.balance = balance;
	}
	
	public String getAccountNo() {
		return accountNo;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	abstract void deposit(double amount);
	abstract void withdraw(double amount);
}
class SavingAccount1 extends BankAccount1
{
	public SavingAccount1(String accountNo, double balance) {
		super(accountNo, balance);
	}
	@Override
	public void deposit(double amount) {
		setBalance(getBalance()+amount);
		System.out.println("Deposite of "+amount+ "successful. Current balance is "+getBalance());
	}
	@Override
	void withdraw(double amount) {
			if(getBalance()>=amount)
			{
				setBalance(getBalance()-amount);
				System.out.println("withdraw of "+amount+ "successful. Current balance is "+getBalance());
			}
			else
			{
				System.out.println("withdraw fail. Insufficient funds");
			}
	}
}
class CurrentAccount extends BankAccount1
{
	public CurrentAccount(String accountNo, double balance) {
		super(accountNo, balance);
	}
	@Override
	void deposit(double amount) {
		setBalance(getBalance()+amount);
		System.out.println("Deposite of "+amount+ "successful. Current balance is "+getBalance());
	}
	@Override
	void withdraw(double amount) {
		if(getBalance()>=amount)
		{
			setBalance(getBalance()-amount);
			System.out.println("withdraw of "+amount+ "successful. Current balance is "+getBalance());
		}
		else
		{
			System.out.println("withdraw fail. Insufficient funds");
		}
	}
}
public class mar06bankaccount1 {

	public static void main(String[] args) {
		
		SavingAccount1 sa = new SavingAccount1("sakshi" , 1000);
        CurrentAccount ca = new CurrentAccount("Fuke" , 2000);

        sa.deposit(500);
        sa.withdraw(200);
        System.out.println("Savings Account Balance: " + sa.getBalance());
        System.out.println();
        ca.deposit(1000);
        ca.withdraw(2500);
        System.out.println("Current Account Balance: " + ca.getBalance());
	}

}

