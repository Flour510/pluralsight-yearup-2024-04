package com.pluralsight;

public class ForLoop
{
    public static void main (String[] args) throws InterruptedException
    {
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(1000); // this was cool! more of this plz
        }

        // forLoop 10-1 counter ends with launch!
        System.out.println("Launch!");
    }
}
