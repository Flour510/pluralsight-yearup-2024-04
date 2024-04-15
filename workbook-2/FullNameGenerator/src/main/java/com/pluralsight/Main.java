package com.pluralsight;

import java.util.Scanner; // always include a scanner for user input

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Welcome to the Full Name Generator!");
        FullNameApplication(args);
    }

    public static void FullNameApplication(String[] args)
    {
        Scanner userInput = new Scanner(System.in);

        // first name user input
        System.out.println("What is your first name? ");
        String firstName = userInput.nextLine().strip().trim();

        // middle name user input
        System.out.println("What is your middle name? ");
        String middleName = userInput.nextLine().strip().trim();

        // last name user input
        System.out.println("What is your last name? ");
        String lastName = userInput.nextLine().strip().trim();

        // suffix user input
        System.out.println("What is your suffix? ");
        String suffix = userInput.nextLine().strip().trim();

        // if name does not include middle name
        String fullName;
        if (!middleName.isEmpty()) {
            fullName = firstName + " " + middleName + " " + lastName + " " + suffix;
        } else {
            fullName = firstName + " " + lastName + " " + suffix ;
        }

        // add a coma before suffix if suffix is included in full name
        if (!suffix.isEmpty()) {
            fullName = firstName + " " + middleName + " " + lastName + ", " + suffix;
        }

        // full name
        System.out.println("Full Name: " + fullName);

    }
}