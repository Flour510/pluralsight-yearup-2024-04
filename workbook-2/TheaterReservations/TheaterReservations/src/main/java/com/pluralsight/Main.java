package com.pluralsight;


import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);

       // prompt user for full name, date of show, and number of tickets needed
        System.out.print("Please enter your full name (last name , first name): ");
        String fullName = userInput.nextLine();
        System.out.print("What date will you be coming to the show? (mm/dd/yyyy): ");
        int date = userInput.nextInt();
        System.out.print("How many tickets would you like?: ");
        int ticketsNeeded = userInput.nextInt();

        // display confirmation message
        System.out.println(ticketsNeeded + " " + "tickets reserved for" + " " + date + " " + "under" + " " + fullName);


    }
}