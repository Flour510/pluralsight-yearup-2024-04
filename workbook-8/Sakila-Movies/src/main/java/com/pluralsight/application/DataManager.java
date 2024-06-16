package com.pluralsight.application;

import com.mysql.cj.jdbc.MysqlDataSource;
import com.pluralsight.models.Actor;
import com.pluralsight.models.Film;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DataManager {
    private MysqlDataSource dataSource;

    public DataManager(String url, String user, String password) {
        dataSource = new MysqlDataSource();
        dataSource.setURL(url);
        dataSource.setUser(user);
        dataSource.setPassword(password);
    }

    public List<Actor> searchActorsByLastName(String lastName) {
        List<Actor> actors = new ArrayList<>();
        String sql = "SELECT actor_id, first_name, last_name FROM actor WHERE last_name = ?";

        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)){

            statement.setString(1, lastName);
            try (ResultSet resultSet = statement.executeQuery()){
                if (resultSet.next()) {
                    do {
                        int actorId = resultSet.getInt("actor_id");
                        String firstName = resultSet.getString("first_name").trim();
                        String actorLastName = resultSet.getString("last_name").trim();
                        actors.add(new Actor(actorId, firstName, actorLastName));
                    } while (resultSet.next());
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return actors;
    }

    public List<Film> getFilmsByActorId(int actorId) {
        List<Film> films = new ArrayList<>();
        String sql = "SELECT f.film_id, f.title, f.description, f.release_year, f.length " +
                "FROM film f " +
                "JOIN film_actor fa  ON f.film_id = fa.film_id " +
                "JOIN actor a ON fa.actor_id = a.actor_id " +
                "WHERE a.actor_id = ? ";

        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setInt(1, actorId);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    do {
                        int filmId = resultSet.getInt("film_id");
                        String title = resultSet.getString("title").trim();
                        String description = resultSet.getString("description").trim();
                        int releaseYear = resultSet.getInt("release_year");
                        int length = resultSet.getInt("length");
                        films.add(new Film(filmId, title, description, releaseYear, length));
                    } while (resultSet.next());
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return films;
    }
}
