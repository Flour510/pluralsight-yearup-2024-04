package com.pluralsight.finance;

import com.pluralsight.interfaces.Valuable;

public class FinanceApplication
{
    public static void main(String[] args)
    {
       BankAccount account1 = new BankAccount("Flor", "123", 12500);
       Valuable account2 = new BankAccount("Enrique", "456", 1500);

       // try to deposit money into both accounts
       account1.deposit(100);
    }
}
