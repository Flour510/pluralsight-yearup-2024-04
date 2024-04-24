package com.pluralsight;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args)
    {
     Scanner userInput = new Scanner(System.in);
     System.out.println("Enter the name of the story/file: ");
     String fileName = userInput.nextLine();

     String filePath = "files/mary_had_a_little_lamb.txt";

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