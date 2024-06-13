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
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/northwind",
                    username,
                    password);

            // 2. execute a statement
            String sql = """
                    SELECT ProductID
                        , ProductName
                        , UnitPrice 
                        , UnitsInStock FROM Products
                    """;
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            // heading
            System.out.println();
            System.out.println("*************** Products Sold By Northwind *****************");
            System.out.println(" Id         Name                             Price   Stock");
            System.out.println("_".repeat(59));

            // read the results
            while(resultSet.next())
            {
                int productId = resultSet.getInt("ProductID");
                String productName = resultSet.getString("ProductName");
                double unitPrice = resultSet.getDouble("UnitPrice");
                int unitsInStock = resultSet.getInt("UnitsInStock");

                System.out.printf("%3d %-40s %.2f %6d\n", productId, productName, unitPrice, unitsInStock);
            }

            // 3. close the connection
            connection.close();

        } catch(Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
// it works :)