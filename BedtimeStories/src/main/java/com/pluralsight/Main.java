package com.pluralsight;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args)
    {
     Scanner userInput = new Scanner(System.in);
     System.out.println();
     System.out.println("Welcome to the Bedtime Stories File Reader! ");
     System.out.println();
     System.out.println("*******************************************************************");
     System.out.println("                      Below are your options: ");
     System.out.println("*******************************************************************");
     System.out.println(" goldilocks.txt");
     System.out.println(" hansel_and_gretel.txt");
     System.out.println(" mary_had_a_little_lamb.txt");
     System.out.println("*******************************************************************");
     System.out.println("ENTER THE NAME OF THE STORY/FILE OPTION YOU WISH TO OPEN BELOW: ");
     System.out.println("*******************************************************************");
     String fileName = userInput.nextLine();

     String filePath = "file/" + fileName;

     File file = new File(filePath);

     try(Scanner fileScanner = new Scanner(file))
     {
        int wordCount = 0;

        while(fileScanner.hasNext())
        {
            String line = fileScanner.nextLine();
            String[] words = line.split(" ");
            wordCount += words.length;

            System.out.println(line);
        }

         System.out.println();
         System.out.println("Word count: " + wordCount);
     }

     catch(FileNotFoundException e) {
         System.out.println("That was a bad file name.");
     }



    }





}