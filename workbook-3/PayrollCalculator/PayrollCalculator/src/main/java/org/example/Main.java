/*
For this assignment we were asked to create a shared data style application that
reads contents of a .csv file and loads the content into the memory of the java application.
Below are the steps I took to solve this exercise:

1) Created an application: PayrollCalculator
2) Wrote the private data member attributes inside an Employee class
3) Created the constructor's for each attribute
4) Created getters and setters for each attribute
5) Inside a Main class, wrote a FileReader object inside a loadEmployeeData method to connect the csv file
6) Using a while loop, read through each line of text
7) Inside that while loop, split the string by using a | character
8) Below the while loop, created an Employee object
9) Inside a displayEmployees method, created a display of employee by calling them by methods inside a for each loop

For Part Two of this exercise we were asked to display payroll report by writing it into a .csv file in a
different format:
1) Next we had to prompt the user for input
2) I did this by creating a method called writePayrollReport
3) Inside that method, created a scanner to get the user input
4) Followed by a try / catch object to run the output code inside of
 */

package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;



public class Main
{
    static ArrayList<Employee> employees = new ArrayList<>();

    public static void main(String[] args)
    {
        loadEmployeeData();
        displayEmployees();
        writePayrollReport();


    }

    public static void displayEmployees() {
       for(Employee employee: employees) {
           System.out.printf("%d %s %.2f\n", employee.getEmployeeId(), employee.getName(), employee.getGrossPay());
       }
    }

    public static void loadEmployeeData()
    {
          // load a file reader object,
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
                  String[] columns = line.split("[|]");

                  // get the specific variables
                  int employeeId = Integer.parseInt(columns[0]);
                  String name = columns[1];
                  double hoursWorked = Double.parseDouble(columns[2]);
                  double payRate = Double.parseDouble(columns[3]);

                  Employee employee = new Employee(employeeId, name, hoursWorked, payRate);
                  employees.add(employee);
              }

          }
          catch (FileNotFoundException e)
          {
              System.out.println("Sorry, Error loading employee data. ");
          }

    }

    public static void employee(int employeeId, String name, double hoursWorked, double payRate, double getGrossPay)
    {

    }

    public static void writePayrollReport()
    {
        // prompt the user for the output file name
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the payroll file to create: ");
        String outputFileName = scanner.nextLine();

        // create a FileWriter object
        try(FileWriter writer = new FileWriter(outputFileName))
        {
            // write the header to the file
            writer.write("id|name|gross pay\n");

            // write employee data to the file
            for(Employee employee: employees)
            {
                writer.write(String.format("%d|%s|%.2f\n", employee.getEmployeeId(), employee.getName(), employee.getGrossPay()));

            }
            System.out.println("Payroll report has been successfully created. ");
        }
        catch(IOException ex)
        {
            System.out.println("There was an error reading the file. ");
        }


    }



}