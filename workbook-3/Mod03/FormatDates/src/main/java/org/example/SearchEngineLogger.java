package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class SearchEngineLogger
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);

        logUserActions("Start Application");

        while(true)
        {
            System.out.println();
            System.out.print("Launch Application: Enter 1 - Yes or 2 - No ");
            int userSelection = userInput.nextInt();

            try
            {
                int answer;

                if (userSelection == 1)
                {
                    System.out.println("Application Launch Logged");
                    logUserActions("End Application");
                    break;
                }
            }
            catch(Exception ex)
            {
                System.out.println("No, was selected. Goodbye!");
                logUserActions("Error: " + ex.getMessage());
            }
        }

        while (true)
        {
            System.out.println();
            System.out.println("Enter a search term or (X to Exit) below ");
            int userSelection = userInput.nextInt();

            try
            {
                int answer2;

                int String = 1;
                
                if (userSelection == String)
                {
                    System.out.println("Searching for a Term Logged");
                    logUserActions("End Application");
                    break;
                }
            }
            catch (Exception ex)
            {
                System.out.println("No, was selected. Goodbye!");
                logUserActions("Error: " + ex.getMessage());
            }
        }



    }

    public static void logUserActions(String message)
    {
        File file = new File("logs/log.txt");
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("kk:mm:ss");

        try (
              FileWriter fileWriter = new FileWriter(file, true);
              PrintWriter writer = new PrintWriter(fileWriter)
        )
        {
              writer.printf("%s %s - %s\n", now.format(dateFormatter), now.format(timeFormatter), message);

        }
        catch (Exception ex)
        {

        }


    }





}
