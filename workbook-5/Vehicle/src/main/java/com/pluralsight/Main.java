package com.pluralsight;

/*
Inheritance is basically, so we can condense for example (lines 11 to 15) , into one line of code for example (line 10).
We do this with first creating a constructor in the parent class (for example the Vehicle class).
Followed by making constructors for every other additional classes.
In the additional classes we can not forget to create a "super" inside the constructors. This connects the classes to the parent class.
clear */

public class Main {
    public static void main(String[] args)
    {
        Car car = new Car("Pink", 4, 15, 15); // instance
        //car.setColor("Pink");
        //car.setNumberOfPassengers(4);
        //car.setCargoCapacity(15); // cubic feet
        //car.setFuelCapacity(15); // gallons
        //System.out.println(car.getColor());

        Hovercraft hovercraft = new Hovercraft("Purple", 6, 1000,100); // instance
        //hovercraft.setColor("Purple");
        //hovercraft.setNumberOfPassengers(6);
        //hovercraft.setCargoCapacity(1000); // lb
        //hovercraft.setFuelCapacity(100); // gallons
        //System.out.println(hovercraft.getColor());

        Moped moped = new Moped("Yellow", 1, 325, 3); // instance
        //moped.setColor("Yellow");
        //moped.setNumberOfPassengers(1);
        //moped.setCargoCapacity(325); // kilogram
        //moped.setFuelCapacity(3); // gallons
        //System.out.println(moped.getColor());

        SemiTruck semiTruck = new SemiTruck("Green", 2, 3000, 300); // instance
        //semiTruck.setColor("Green");
        //semiTruck.setNumberOfPassengers(2);
        //semiTruck.setCargoCapacity(3000); // cubic feet
        //semiTruck.setFuelCapacity(300); // gallons
        //System.out.println(semiTruck.getColor());

        // print them all here
        System.out.println("The vehicle is color " + car.getColor() + ", the max number of passengers is "
        + car.getNumberOfPassengers() + ",\nthe cargo capacity is " + car.getCargoCapacity() + " cubic feet" +
        ", and the fuel capacity is " + car.getFuelCapacity() + " gallons" + ".");
    }
}
