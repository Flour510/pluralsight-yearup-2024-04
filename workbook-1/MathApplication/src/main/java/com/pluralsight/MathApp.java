package com.pluralsight;

import javax.sql.rowset.serial.SQLOutputImpl;
import java.sql.SQLOutput;

public class MathApp {
    public static void main(String[] args) {
        // find all 7 questions in your workbook on page

        question1();
        question2();
        question3();
        question4();
        question5();
        question6();
        question7();

    }

    // write ONLY code for QUESTION 1 in this function
    public static void question1() {
        // Question 1:
        // declare variables here
        int bobSalary = 70000;
        int garySalary = 30000;
        int highestSalary;

        // code the logic to the problem here
        highestSalary = Math.max(bobSalary, garySalary);

        // use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
        System.out.println("The highest salary is: $" + highestSalary);
    }


    // write ONLY code for QUESTION 2 in this function
    public static void question2() {
        // Question 2:
        // declare variables here
        int carPrice = 10000;
        int truckPrice = 45000;
        int cheaperVehiclePrice;

        // code the logic to the problem here

        // use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);

        cheaperVehiclePrice = Math.min(carPrice, truckPrice);
        System.out.println("The cheaper vehicle is: $" + cheaperVehiclePrice);

    }


    // write ONLY code for QUESTION 3 in this function
    public static void question3() {
        // Question 3:
        // declare variables here
        double radius = 7.25;
        double areaOfCircle = Math.PI * Math.pow(radius, 2);

        // use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
        System.out.println("The area of a circle with a radius of 7.25 is: " + areaOfCircle);

    }


    // write ONLY code for QUESTION 4 in this function
    public static void question4() {
        // Question 4:
        // declare variables here
        double squareRootOriginalValue = 5.0;
        double squareRoot = Math.sqrt(5.0);

        // code the logic to the problem here
        System.out.println(squareRoot);

        // use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
    }


    // write ONLY code for QUESTION 5 in this function
    public static void question5() {
        // Question 5:
        // declare variables here
        double x1 = 5, y1 = 10;
        double x2 = 85, y2 = 50;

        // code the logic to the problem here
        double distanceBetweenPoints = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        // use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
        System.out.println("The distances between the two points: " + distanceBetweenPoints);
    }

    // write ONLY code for QUESTION 6 in this function
    public static void question6() {
        // Question 6:
        // declare variables here
        double x = -3.8;
        double absoluteValue;

        // code the logic to the problem here
        absoluteValue = Math.abs(-3.8);

        // use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
        System.out.println(absoluteValue);
    }

    // write ONLY code for QUESTION 7 in this function
    public static void question7() {
        // Question 7:
        // declare variables here
        // Also, code the logic to the problem here
        double randomNumber = Math.random();

        // use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
        System.out.println("Random number between 0 - 1: " + randomNumber);
    }
}