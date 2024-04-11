package org.example;

// ask user for their name
// display the product & price
// ask for quantity
// calculate total and display
// ask for money
// give change back

public class GroceryStore
{
    public static void main(String[] args)
    {

        // declare variables
        String product = "Milka Aplenmilch";
        double PRICE = 2.99;

        // input variables
        String customerName;
        int quantity;
        double cashReceived;

        // calculated
        double totalPrice;
        double changeReturned;

        // get user input
        customerName = "Bob";
        quantity = 5;

        // calculations
        totalPrice = PRICE * quantity;
        cashReceived = 20;
        changeReturned = cashReceived - totalPrice;

        // display the receipt

        System.out.println("Total: " + totalPrice);
        System.out.println("Cash: " + cashReceived);
        System.out.println("Change: " + changeReturned);
    }



}