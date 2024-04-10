package com.pluralsight;

public class Main
{
    public static void main(String[] args)
    {
        // declare variables for each of the following:

        // a vehicle identification number in the range 1000000 - 9999999
        int vehicleIdentificationNumber = 9999990;
        System.out.println("VIN #: " + vehicleIdentificationNumber);

        // a vehicle make /model (i.e. Ford Explorer)
        String makeOfVehicle = "Vokswagen ";
        String modelOfVehicle = "Beetle";
        System.out.println("Car type: " + makeOfVehicle + modelOfVehicle);

        // a vehicle color
        String vehicleColor = "Red";
        System.out.println("The vehicle is color: " + vehicleColor);

        // whether the vehicle has a towing package
        boolean towingPackageAvailable = true;
        System.out.println("Tow package available: " + towingPackageAvailable);

        // an odometer reading
        int odometerReading = 510510510;
        System.out.println("Odometer reading: " + odometerReading);

        // a price
        double priceOfWater = 2.50;
        System.out.println(priceOfWater);

        // a quality rating (A, B, or C)
        char qualityRating = 'F';
        System.out.println("Vehicle quality rating: " + qualityRating);

        // a phone number
        String phoneNumber = "(510)866-8164";
        System.out.println(phoneNumber);

        // a social security number
        int socialSecurityNumber = 123445678;
        System.out.println("SSN: " + socialSecurityNumber);

        // a zip code
        int zipCode = 94601;
        System.out.println("Zip code: " + zipCode);

    }
}