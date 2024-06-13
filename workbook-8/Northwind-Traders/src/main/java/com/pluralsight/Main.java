package com.pluralsight;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args)
    {
        String username = "root";
        String password = "YUm15510n ";

        try {
            // load the MySQL Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 1. open a connection to the database
            // use the database URL to point to the correct database
            // Connection connection;
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/northwind",
                    username,
                    password);

            // 2. execute a statement
            String sql = """
                    SELECT ProductID
                        , ProductName
                        , UnitPrice FROM Products
                    """;
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            // 2 a. - read the results
            while(resultSet.next())
            {
                int productId = resultSet.getInt("ProductID");
                String productName = resultSet.getString("ProductName");
                double unitPrice = resultSet.getDouble("UnitPrice");

                System.out.printf("%3d %-30s %.2f\n", productId, productName, unitPrice);
            }

            // 3. close the connection
            connection.close();

        } catch(Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
