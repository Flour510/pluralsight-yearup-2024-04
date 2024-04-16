package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        // enter your full name
        System.out.println("Enter your full name: ");
        String fullName = userInput.nextLine().trim();

        // split the string
        String[] nameParts = fullName.split("\\s+");

        // individualize the name
        String firstName = "";
        String middleName = "";
        String lastName = "";

        // asign names based on the number of parts
        if (nameParts.length >= 1) {
            firstName = nameParts[0];
        }
        if (nameParts.length == 2) {
            lastName = nameParts[1];
        } else if (nameParts.length == 3) {
            middleName = nameParts[1];
            lastName = nameParts[2];
        }

        // display the names individually
        System.out.println("First name: " + firstName);
        System.out.println("Middle name: " + (middleName.isEmpty() ? "(none)" : middleName));
        System.out.println("Last name: " + lastName);

        // print out full name with proper spacing
        if (nameParts.length == 3) {
            System.out.println(firstName + " " + middleName + " " + lastName);
        } else {
            System.out.println(firstName + " " + lastName);
        }


    }
}
