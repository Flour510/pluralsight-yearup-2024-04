package com.pluralsight.finance;

import com.pluralsight.interfaces.Valuable;

public class BankAccount implements Valuable 
{
    private String name;
    private String accountNumber;
    private double balance;

    public BankAccount(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    
    public double deposit(double amount)
    {
        return deposit(amount);
    }

    public double withdraw(double amount)
    {
        return withdraw(amount);
    }

    @Override
    public double getValue() {
        return 0;
    }

    @Override
    public String getName() {
        return "";
    }

    @Override
    public double getMarketValue() {
        return 0;
    }
}
