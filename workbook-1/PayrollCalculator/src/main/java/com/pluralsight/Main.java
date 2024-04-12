package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        // create a scanner
        Scanner scanner = new Scanner(System.in);

        // read name
        System.out.print("What is your name? ");
        String name = scanner.nextLine();

        // read hours worked
        System.out.print("How many hours did you work? ");
        double hoursWorked = scanner.nextDouble();

        // read pay rate
        System.out.print("What is your pay rate? ");
        double payRate = scanner.nextDouble();

        // calculate pay rate / print gross pay
        double grossPay = payRate * hoursWorked;
        System.out.printf("%s, your gross pay is: $%.2f", name , grossPay);

    }


}
