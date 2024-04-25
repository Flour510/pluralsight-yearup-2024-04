package com.pluralsight;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalField;

public class Main
{
    public static void main(String[] args)
    {
        dateOnly();
        timeOnly();
        dateAndTime();
    }

    public static void dateOnly()
    {
        LocalDate today = LocalDate.now();
        System.out.println(today);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMM yy");
        System.out.println(today.format(formatter));
        System.out.println();

        System.out.println(today.getDayOfMonth());
        System.out.println(today.getMonth());
        System.out.println(today.getMonthValue());
        System.out.println(today.getYear());
        System.out.println(today.plusMonths(1));
    }

    public static void timeOnly()
    {
        System.out.println();
        LocalTime now = LocalTime.now();
        System.out.println(now);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("h:mm a");
        System.out.println(now.format(formatter));

        System.out.println(now.getHour());
    }

    public static void dateAndTime()
    {
        LocalDateTime now = LocalDateTime.now();
        ZonedDateTime utcNow = now.atZone(ZoneId.of("Africa/Lagos"));
        System.out.println();
        System.out.println("Utah: "  + now);
        System.out.println("UTC: " + utcNow);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("h:mm a");
        System.out.println(now.format(formatter));

        System.out.println();
        System.out.println(now.plusMinutes(5));
    }
}