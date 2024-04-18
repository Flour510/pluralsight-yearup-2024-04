package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication
{
    private static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args)
    {
        // create a new instance of CellPhone and register it
        CellPhone newPhone = register();

        // print the properties of the phone using getters
        System.out.println("Serial Number: " + newPhone.getSerialNumber());
        System.out.println("Phone Number: " + newPhone.getPhoneNumber());
        System.out.println("Model: " + newPhone.getModel());
        System.out.println("Carrier: " + newPhone.getCarrier());
        System.out.println("Owner: " + newPhone.getOwner());
    }

    public static CellPhone register()
    {
        // declare variables
        int serialNumber;
        String phoneNumber, model, carrier, owner;

        // prompt the user for the cell phone information
        System.out.println("What is the serial number? ");
        serialNumber = userInput.nextInt();

        userInput.nextLine(); // clears memory stream

        System.out.println("What is the phone number? ");
        phoneNumber = userInput.nextLine();

        System.out.println("What is the model? ");
        model = userInput.nextLine();

        System.out.println("Who is the carrier? ");
        carrier = userInput.nextLine();

        System.out.println("Who is the owner of the phone? ");
        owner = userInput.nextLine();

        System.out.println("----------------------------------"); // line break

        // create a new CellPhone object with the provided information
        CellPhone phone = new CellPhone(serialNumber, phoneNumber, model, carrier, owner);
        return phone;
    }

}




