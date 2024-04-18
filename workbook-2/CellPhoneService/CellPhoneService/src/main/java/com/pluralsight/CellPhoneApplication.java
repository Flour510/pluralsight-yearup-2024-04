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

        // create a second instance of CellPhone
        CellPhone cellPhone1 = new CellPhone(123456," " + "(510) 866-8164", "iPhone 13", "Verizon", "Flor Preciado");
        CellPhone cellPhone2 = new CellPhone(654321, " " + "(855) 555-2222", "Samsung Galaxy S21", "AT&T", "John Doe");

        display(cellPhone1);
        display(cellPhone2);

        // dialing a phone number
        cellPhone1.dial(" " + "(510) 866-8164");
        cellPhone1.dial( cellPhone2.getPhoneNumber() );
        cellPhone2.dial( cellPhone1.getPhoneNumber() );

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

    public static void display(CellPhone phone)
    {
        System.out.println(); // line break
        System.out.println("Serial Number: " + phone.getSerialNumber());
        System.out.println("Phone Number: " + phone.getPhoneNumber());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Owner: " + phone.getOwner());
        System.out.println();

    }



}






