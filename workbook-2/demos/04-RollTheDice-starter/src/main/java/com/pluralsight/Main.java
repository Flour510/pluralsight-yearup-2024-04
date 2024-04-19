package com.pluralsight;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Dice dice = new Dice(); // what do these instances do?

        // counters
        int twoCounter = 0;
        int fourCounter = 0;
        int sixCounter = 0;
        int sevenCounter = 0;

        // roll the dice 20 times
        for(int i = 0; i < 20; i++) {

                // roll the dice twice
                int roll1 = dice.roll();
                int roll2 = dice.roll();

                // print the value of each roll
                System.out.println("Roll: " + (i + 1) + ":" + roll1 + " - " + roll2);
                int sum = roll1 + roll2;
                System.out.println("Sum: " + sum);

                // increments counters based on sum
                if (sum == 2) {
                    twoCounter++;
                } else if (sum == 4) {
                    fourCounter++;
                } else if (sum == 6) {
                    sixCounter++;
                } else if (sum == 7) {
                    sevenCounter++;
                }

        }

                // display counters
                System.out.println("-----------------------------------"); // line break
                System.out.println("Dice Roll Average: ");
                System.out.println("Two Counter: " + twoCounter);
                System.out.println("Four Counter: " + fourCounter);
                System.out.println("Six Counter: " + sixCounter);
                System.out.println("Seven Counter: " + sevenCounter);
    }



}



