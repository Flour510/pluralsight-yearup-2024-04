package com.pluralsight.finance;

import com.pluralsight.interfaces.Valuable;

public class CreditCard implements Valuable
{
    private String name;
    private  String accountNumber;
    private double balance;

    public CreditCard(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double charge(double amount)
    {
        balance += amount;
        return balance;
    }

    public double pay(double amount)
    {
        balance -= amount;
        return balance;
    }

    @Override
    public double getValue() {
        return - balance;
    }

    @Override
    public String getName() {
        return name;
    }
}
