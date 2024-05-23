package com.pluralsight;

import com.pluralsight.collection.FixedList;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        FixedList<Integer> numbers = new FixedList<>(3);
        numbers.add(10);
        numbers.add(3);
        numbers.add(92);
        try {
            numbers.add(43); // this line should fail
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        System.out.println(numbers.getItems().size());

        FixedList<LocalDate> dates = new FixedList<>(2);
        dates.add(LocalDate.now());
        dates.add(LocalDate.now());
        try {
            dates.add(LocalDate.ofEpochDay(15)); // this line should fail
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}