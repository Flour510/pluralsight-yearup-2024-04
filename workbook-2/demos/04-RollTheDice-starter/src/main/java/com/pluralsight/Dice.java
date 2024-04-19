package com.pluralsight;

import java.util.Scanner;


// dice
public class Dice
{
    // roll dice
    public int roll()
    {
        int randomNumber = (int) (Math.random() * 6) + 1;
        return randomNumber;
    }

}






