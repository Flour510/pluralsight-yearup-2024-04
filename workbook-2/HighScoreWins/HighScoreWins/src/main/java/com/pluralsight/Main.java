package com.pluralsight;

import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args)
    {
        // prompt the user for the game winner
        System.out.println("Who is the winner? \nHome:Visitor | 21:9");

        // user inputs a game score
        String input = "Home:Visitor|21:9";

        // splits the user input string
        String[] tokens = input.split("[\\|:]");

        // assign tokens to variable names
        String homeTeam = tokens[0];
        String visitorTeam = tokens[1];
        int homeScore = Integer.parseInt(tokens[2]);
        int visitorScore = Integer.parseInt(tokens[3]);

        // determine the winner using boolean
        String winner = (homeScore > visitorScore) ? homeTeam: ((homeScore < visitorScore) ? visitorTeam : "It's a tie!");

        // output the winner
        System.out.println("The winner is: " + winner);

    }
}