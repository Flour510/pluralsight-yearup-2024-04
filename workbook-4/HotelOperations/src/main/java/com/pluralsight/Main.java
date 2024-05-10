package com.pluralsight;

public class Main {

    public static void main(String[] args)
    {
       Room room1 = new Room(1, 150, false, false);
       System.out.println("Is room available: " + room1.isAvailable());

       Reservation reservation1 = new Reservation("king", 1, false);
       System.out.println("Reservation price: " + reservation1.getPrice() + " for room type King");

       Employee employee1 = new Employee(123, "Flor", "Concierge", 25, 40);
       System.out.println("Over time hours worked: " + employee1.getOverTimeHours());
       System.out.println("Total pay: " + employee1.getTotalPay());


    }
}