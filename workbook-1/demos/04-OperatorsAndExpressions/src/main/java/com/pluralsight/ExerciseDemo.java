package com.pluralsight;

public class ExerciseDemo
{
    public static void main(String[] args)
    {
        question1();
        question2();
    }

    public static void question1()
    {
        // calculate the amount of change given after buying chocolate
        double chocolatePrice = 2.99;
        double myCashOnHand = 20.00;
        int quantityToBuy = 4;
        double totalPrice;
        double changeReturned;

        totalPrice = chocolatePrice * quantityToBuy;
        changeReturned = myCashOnHand - totalPrice;
        System.out.println("Change given: $" + changeReturned);

    }

    public static void question2()
    {
        // calculate the perimeter of a circle


    }

}

