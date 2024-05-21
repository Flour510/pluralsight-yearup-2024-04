package com.pluralsight;

import com.pluralsight.models.*;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Shape> shapes = new ArrayList<>();

        // load all shapes into the arraylist
        shapes.add(new Circle(5));
        shapes.add(new Circle(12));
        shapes.add(new Rectangle(10, 8));
        shapes.add(new Rectangle(30, 15));
        shapes.add(new Square(15));
        shapes.add(new Square(12));
        shapes.add(new Triangle(10, 25));
        shapes.add(new Triangle(15, 20));


        // then print the toString() of each shape
        for (Shape shape: shapes) {
            System.out.println(shape.toString());
            System.out.println("Area: " + shape.getArea());
        }
    }
}