package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Hello world!");
    }


    public static void calculateGrossPay()
    {
        // method that calculates and returns employee gross pay
        int getGrossPay() = hoursWorked * payRate;
        int displayGrossPay;
    }

    public static void loadEmployeeData()
    {
          // load a file reader object
          // creates a path to the file
          File file = new File("files/employeeData.csv");

          // opens file using a Scanner
          try(Scanner fileScanner = new Scanner(file))
          {
              // skip the first line - because it is a header line
              fileScanner.nextLine();

              // loops through each line in the file
              while(fileScanner.hasNextLine())
              {
                  String line = fileScanner.nextLine();

                  // split the line on a | (pipe)
                  String[] columns = line.split("[|]]");

                  // get the specific variables
                  int employeeId = columns[0];
                  String name = columns[1];
                  double hoursWorked = Double.parseDouble(columns[2]);
                  double payRate = Double.parseDouble(columns[3]);


              }

          }
          catch (FileNotFoundException e)
          {

          }
    }

    public static void employee(int employeeId, String name, double hoursWorked, double payRate, double getGrossPay)
    {

    }
}