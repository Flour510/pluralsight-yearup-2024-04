package com.pluralsight;

import com.mysql.cj.jdbc.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String username = "root";
        String password = "YUm15510n ";
        Scanner scanner = new Scanner(System.in);

        try {
            // creates a DataSource instance
            MysqlDataSource dataSource = new MysqlDataSource();
            dataSource.setURL("jdbc:mysql://localhost:3306/sakila");
            dataSource.setUser(username);
            dataSource.setPassword(password);

            System.out.println();
            System.out.println("*************** WELCOME TO SAKILA MOVIES DATABASE ***************");
            while (true) {
                // prompt the user for input
                System.out.println();
                System.out.println("Enter the last name of an actor you like: ");
                String lastName = scanner.nextLine().trim();

                if (!lastName.isEmpty()) {
                    displayActorsByLastName(dataSource, lastName);
                    System.out.println("_".repeat(60));

                    System.out.println("Enter the first name of an actor to see their movies: ");
                    String firstName = scanner.nextLine().trim();
                    System.out.println("Enter the last name of the actor to see their movies: ");
                    String lastNameForMoviesSearch = scanner.nextLine().trim();

                    if (!firstName.isEmpty() && !lastNameForMoviesSearch.isEmpty()) {
                        displayMoviesByActor(dataSource, firstName, lastNameForMoviesSearch);
                    } else {
                        System.out.println("Invalid names. Please try again. ");
                    }
                } else {
                    System.out.println("Invalid option. Please try again. ");
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void displayActorsByLastName(DataSource dataSource, String lastName) {
        String sql = "SELECT first_name, last_name FROM actor WHERE last_name = ?";
        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setString(1, lastName);
            try (ResultSet resultSet = statement.executeQuery()) {
                System.out.println();
                System.out.println("*************** ACTORS WITH LAST NAME " + lastName.toUpperCase() + " ***************");
                if (!resultSet.isBeforeFirst()) {
                    System.out.println("No actors found with the last name: " + lastName);
                } else {
                    while (resultSet.next()) {
                        String firstName = resultSet.getString("first_name");
                        String actorLastName = resultSet.getString("last_name");
                        System.out.println(firstName + " " + actorLastName);
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error loading actors: " + e.getMessage());
        }
    }

    private static void displayMoviesByActor(DataSource dataSource, String firstName, String lastName){
        String sql = "SELECT f.title FROM film f " +
                "JOIN film_actor fa ON f.film_id = fa.film_id " +
                "JOIN actor a ON fa.actor_id = a.actor_id " +
                "WHERE a.first_name = ? AND a.last_name = ?";
        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)){

            statement.setString(1, firstName);
            statement.setString(2, lastName);
            try (ResultSet resultSet = statement.executeQuery()) {
                System.out.println();
                System.out.println("*************** FILMS WITH " + firstName.toUpperCase() + " " + lastName.toUpperCase() + " ***************");
                if (!resultSet.isBeforeFirst()) {
                    System.out.println("No films found for the actor: " + firstName + " " + lastName);
                } else {
                    while (resultSet.next()) {
                        String title = resultSet.getString("title");
                        System.out.println(title);
                    }
                }
            }
        } catch (Exception e){
            System.out.println("Error loading films: " + e.getMessage());
        }
    }
}
