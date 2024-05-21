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

    public void BankAccount(String name, String accountNumber, double balance)
    {

    }

    public double charge(double amount) { return amount; }

    public double pay(double amount) { return amount; }

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
