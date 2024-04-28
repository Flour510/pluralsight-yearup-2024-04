package org.example;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.TemporalField;

public class Main {
    public static void main(String[] args)
    {
        dateAndTime();
    }

    public static void dateAndTime()
    {
        System.out.println("--------------------------------------");
        System.out.println("            DATE AND TIME");
        System.out.println("--------------------------------------");
        LocalDateTime now = LocalDateTime.now();
        ZonedDateTime utcNow = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println();
        System.out.println("California: " + now);
        System.out.println("UTC: " + utcNow);
        System.out.println();

        System.out.println("--------------------------------------");
        System.out.println("           LOCAL TIME ZONE");
        System.out.println("--------------------------------------");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("h:mm");
        System.out.println(now.format(formatter) + " on " + now);


    }
}