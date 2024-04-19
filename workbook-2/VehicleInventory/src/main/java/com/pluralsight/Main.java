package com.pluralsight;

import java.util.Scanner;

public class Main
{
    static final Scanner userInput = new Scanner(System.in);

    public static void main(String[] args)
    {
        // create an array of vehicles here
        Vehicle[] vehicle =
        {
                new Vehicle(101121,"Ford Explorer","Red",45000,13500),
                new Vehicle(101122,"Toyota Camry","Blue",60000,11000),
                new Vehicle(101123,"Chevrolet Malibu","Black",50000,9700),
                new Vehicle(101124,"Honda Civic","White",70000,7500),
                new Vehicle(101125,"Subaru Outback","Green",55000,14500),
                new Vehicle(101126,"Jeep Wrangler","Yellow",30000,16000)
        };


        int choice = 0;
        while(choice != 5)
        {
            // print the home screen
            System.out.println();
            System.out.println("What do you want to do?");
            System.out.println();
            System.out.println("1 - List all vehicles");
            System.out.println("2 - Search by make/model");
            System.out.println("3 - Search by price range");
            System.out.println("4 - Search by color");
            System.out.println("5 - Quit");
            System.out.println();
            System.out.println("Enter your command");
            choice = Integer.parseInt(userInput.nextLine());

            switch(choice)
            {
                case 1:
                    // call the list all vehicles (pass the array)
                    listAllVehicles(vehicle);
                    break;
                case 2:
                    // call the search by make/model
                    searchByMakeModel(vehicle);
                    break;
                case 3:
                    // call the search by price
                    searchByPrice(vehicle);
                    break;
                case 4:
                    // call the search by color
                    searchByColor(vehicle);
                    break;
                case 5:
                    System.out.println();
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println();
                    System.out.println("Bruh... Invalid selection");
                    break;
            }

        }


    }

    public static void listAllVehicles(Vehicle[] vehicles)
    {
        System.out.println();
        System.out.println("All Vehicles: ");
        System.out.println("-------------------------------------");

        // loop through vehicles and print all
        for (int i = 0; i < vehicles.length; i++) {
            Vehicle vehicle = vehicles[i];
            System.out.printf("%-10s %-10s %-10s %-10d %-10f\n", vehicle.getVehicleId(), vehicle.getMakeModel(), vehicle.getColor(), vehicle.getOdometerReading(), vehicle.getPrice());
        }
    }

    public static void searchByMakeModel(Vehicle[] vehicles)
    {
        // get user search criteria
        System.out.println();
        System.out.println("Search Vehicle by Make Model");
        System.out.println("-------------------------------");
        System.out.println("Enter Make Model: ");
        String searchMakeModel = userInput.nextLine();

        // loop through vehicles and print only vehicles that match the search
        for (int i = 0; i < vehicles.length; i++) {
            Vehicle vehicle = vehicles[i];
            if (vehicle.getMakeModel().equalsIgnoreCase(searchMakeModel))
            {
                System.out.printf("%-10s %-10s %-10s %-10d %-10f\n", vehicle.getVehicleId(), vehicle.getMakeModel(), vehicle.getColor(), vehicle.getOdometerReading(), vehicle.getPrice());
            }
        }
    }

    public static void searchByPrice(Vehicle[] vehicles)
    {
        // get user search criteria
        System.out.println();
        System.out.println("Search Vehicles by Price: ");
        System.out.println("-------------------------------------------");
        System.out.println("Enter a price to search: ");
        int searchPrice = userInput.nextInt();

        userInput.nextLine();

        // loop through vehicles and print only vehicles that match the search
        for (int i = 0; i < vehicles.length; i++) {
            Vehicle vehicle = vehicles[i];
            if(vehicle.getPrice() == searchPrice)
            {
                System.out.printf("%-10s %-10s %-10s %-10d %-10f\n", vehicle.getVehicleId(), vehicle.getMakeModel(), vehicle.getColor(), vehicle.getOdometerReading(), vehicle.getPrice());
            }
        }
    }

    public static void searchByColor(Vehicle[] vehicles)
    {
        // get user search criteria
        System.out.println();
        System.out.println("Search Vehicles by Color");
        System.out.println("-------------------------------------------");
        System.out.println("Enter a color to search: ");
        String searchColor = userInput.nextLine();

        // loop through vehicles and print only vehicles that match the search
        for (int i = 0; i < vehicles.length; i++) {
            Vehicle vehicle = vehicles[i];
            if (vehicle.getColor().equalsIgnoreCase(searchColor))
            {
                System.out.printf("%-10s %-10s %-10s %-10d %-10f\n", vehicle.getVehicleId(), vehicle.getMakeModel(), vehicle.getColor(), vehicle.getOdometerReading(), vehicle.getPrice());
            }
        }
    }

    // bonus (optional)
    public static void addVehicle(Vehicle[] vehicles)
    {
        // get user input

        // create a vehicle

        // add it to the inventory

        // hint: you will need to create a new array that is 1 bigger than the old one
        //       then add the new vehicle in the last spot
    }
}
