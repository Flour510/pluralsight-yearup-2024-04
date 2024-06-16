package com.pluralsight;

import com.pluralsight.application.DataManager;
import com.pluralsight.models.Actor;
import com.pluralsight.models.Film;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/sakila";
        String username = "root";
        String password = "YUm15510n ";
        DataManager dataManager = new DataManager(url, username, password);
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("*************** \uD83C\uDFAC WELCOME TO SAKILA MOVIES DATABASE \uD83C\uDF9E\uFE0F ***************");
        while (true) {
            // prompt the user for input
            System.out.println();
            System.out.println("Enter the last name of an actor you like \uD83C\uDFAD: ");
            String lastName = scanner.nextLine().trim();

            if (!lastName.isEmpty()) {
                List<Actor> actors = dataManager.searchActorsByLastName(lastName);
                if (!actors.isEmpty()) {
                    System.out.println("*************** ACTORS WITH LAST NAME " + lastName.toUpperCase() + " ***************");
                    for (Actor actor : actors) {
                        System.out.println(actor);
                    }
                    System.out.println("_".repeat(60));

                    System.out.println("Enter the actor ID to see their movies: ");
                    int actorId = scanner.nextInt();
                    scanner.nextLine(); // consumes new line

                    List<Film> films = dataManager.getFilmsByActorId(actorId);
                    if (!films.isEmpty()) {
                        System.out.println("*************** FILMS WITH ACTOR ID " + actorId + " ***************");
                        for (Film film : films) {
                            System.out.println(film);
                        }
                    } else {
                        System.out.println("No films found for the actor ID: " + actorId);
                    }
                } else {
                    System.out.println("No actors found with the last name: " + lastName);
                }

                System.out.println("Enter the first name of an actor to see their movies: ");
            } else {
                System.out.println("Invalid option. Please try again. ");
            }
        }
    }
}
