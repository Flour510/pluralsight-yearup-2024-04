package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);

        // declare constants
        final String size1 = "Regular";
        final double size1_BasePrice = 5.45;
        final String size2 = "Large";
        final double size2_BasePrice = 8.95;
        final float student17YearsOldOrYoungerDiscount = 0.1f;
        final float senior65YearsOldOrOlderDiscount = 0.2f;

        // input variables?
        String customerName;
        String sandwichSizeSelection;
        int customerAge;
        double totalPrice = 0.0;

        // greeting / user input name for order
        System.out.println("Welcome to the Sandwich Shop! What is the name for the order? ");
        customerName = userInput.nextLine(); // waits for the customer to enter their name
        System.out.println(); // line break

        // get user input / sandwich size selection
        System.out.print("On the menu today are two options: ");
        System.out.println(); // line break

        System.out.println("Option 1) " + size1 + " $" + size1_BasePrice);
        System.out.println("Option 2) " + size2 + " $" + size2_BasePrice);
        System.out.println(); // line break

        System.out.println("What size sandwich would you like, Regular or Large? ");

        sandwichSizeSelection = userInput.nextLine(); // waits for customer to input choice
        System.out.println(); // line break

        // user input for their age for the possible discount
        System.out.println("Great choice, We have a few discounts you might qualify for! \nWhat is your age?");
        customerAge = Integer.parseInt(userInput.nextLine()); // waits for customers age input
        System.out.println(); // line break

        // calculate discount based on age and size of selection
        if (customerAge <= 17) {

            System.out.println("You will receive the 10% Student discount! ");
            totalPrice = sandwichSizeSelection.equals(size1) ?
                    size1_BasePrice * (1 - student17YearsOldOrYoungerDiscount) :
                    size2_BasePrice * (1 - student17YearsOldOrYoungerDiscount);

        } else if (customerAge >= 65) {

            System.out.println("You will receive the 20% Senior discount! ");
            totalPrice = sandwichSizeSelection.equals(size1) ?
                    size1_BasePrice * (1 - senior65YearsOldOrOlderDiscount) :
                    size2_BasePrice * (1 - senior65YearsOldOrOlderDiscount);

        } else if (customerAge >= 18 && customerAge <= 64) {

            System.out.println("You do not qualify for one of our Student or Senior discounts at this time.");
            totalPrice = sandwichSizeSelection.equals(size1) ? size1_BasePrice : size2_BasePrice;
        }

        // prints out total price in .2 decimal format
        System.out.println("Your total is : $" + String.format("%.2f", totalPrice));
    }
}