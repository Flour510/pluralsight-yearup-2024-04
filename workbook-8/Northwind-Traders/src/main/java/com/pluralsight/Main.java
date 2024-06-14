package com.pluralsight;

import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String username = "root";
        String password = "YUm15510n ";
        Connection connection = null;
        Scanner scanner = new Scanner(System.in);

        try {
            // load the MySQL Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // open a connection to the database
            // use the database URL to point to the correct database
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/northwind",
                    username,
                    password);

            System.out.println();
            System.out.println("************** WELCOME TO NORTHWIND DATABASE **************");
            while (true) {
                // display home screen
                System.out.println();
                System.out.println("What do you want to do?");
                System.out.println("    1) Display all products");
                System.out.println("    2) Display all customers");
                System.out.println("    3) Display all categories");
                System.out.println("    0) Exit");
                System.out.println("Select an option: ");
                int option = scanner.nextInt();

                if (option == 0) {
                    System.out.println();
                    System.out.println("Goodbye! \uD83D\uDC4B");
                    break;
                } else if (option == 1) {
                    displayAllProducts(connection);
                    System.out.println("_".repeat(59));
                } else if (option == 2) {
                    displayAllCustomers(connection);
                    System.out.println("_".repeat(118));
                } else if (option == 3){
                    displayAllCategories(connection);
                    System.out.println("Enter Category ID to display products: ");
                    int categoryId = scanner.nextInt();
                    displayProductsByCategory(connection, categoryId);
                } else {
                    System.out.println("Invalid option. Please try again. ");
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (connection != null && !connection.isClosed()) {
                    connection.close();
                }
            } catch (Exception e) {
                System.out.println("Error closing the connection: " + e.getMessage());
            }
        }
    }

    private static void displayAllProducts(Connection connection) {
        try {
            // execute a statement
            String sql = """
                    SELECT ProductID
                        , ProductName
                        , UnitPrice 
                        , UnitsInStock FROM Products
                    """;
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            // home screen
            System.out.println();
            System.out.println("*************** PRODUCTS SOLD BY NORTHWIND *****************");
            System.out.println(" Id         Name                             Price   Stock");
            System.out.println("_".repeat(59));
            // read the results
            while (resultSet.next()) {
                int productId = resultSet.getInt("ProductID");
                String productName = resultSet.getString("ProductName");
                double unitPrice = resultSet.getDouble("UnitPrice");
                int unitsInStock = resultSet.getInt("UnitsInStock");

                System.out.printf("%3d %-40s %.2f %6d\n", productId, productName, unitPrice, unitsInStock);
            }
            resultSet.close();
            statement.close();
        } catch (Exception e) {
            System.out.println("Error loading products: " + e.getMessage());
        }
    }

    private static void displayAllCustomers(Connection connection) {
        try {
            // execute a statement
            String sql = """
                    SELECT ContactName
                    , CompanyName
                    , City
                    , Country
                    , Phone
                    FROM Customers
                    ORDER BY Country
                    """;
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            System.out.println();
            System.out.println("*************************************************** CUSTOMERS *******************************************************");
            System.out.println("Contact Name                   Company Name                        City                      Country    Phone");
            System.out.println("_".repeat(118));
            // read the results
            while (resultSet.next()) {
                String contactName = resultSet.getString("ContactName");
                String companyName = resultSet.getString("CompanyName");
                String city = resultSet.getString("City");
                String country = resultSet.getString("Country");
                String phone = resultSet.getString("Phone");

                System.out.printf("%-30s %-35s %-25s %-10s %s\n", contactName, companyName, city, country, phone);
            }
            resultSet.close();
            statement.close();
        } catch (Exception e) {
            System.out.println("Error loading customers: " + e.getMessage());
        }
    }

    private static void displayAllCategories(Connection connection) {
        try {
            String sql = """
            SELECT CategoryID, CategoryName
            FROM Categories
            ORDER BY CategoryID
            """;
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            System.out.println();
            System.out.println("******************************************************** Categories ********************************************************");
            System.out.println("Category ID          Category Name");
            System.out.println("_".repeat(60));

            while (resultSet.next()) {
                int categoryId = resultSet.getInt("CategoryID");
                String categoryName = resultSet.getString("CategoryName");

                System.out.printf("%-30s %-35s\n", categoryId, categoryName);
            }
            resultSet.close();
            statement.close();
        } catch (Exception e) {
            System.out.println("Error loading categories: " + e.getMessage());
        }
    }

    private static void displayProductsByCategory(Connection connection, int categoryId) {
        try {
            String sql = """
            SELECT ProductID, ProductName, UnitPrice, UnitsInStock
            FROM Products
            WHERE CategoryID = ?
            """;
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, categoryId);
            ResultSet resultSet = statement.executeQuery();

            System.out.println();
            System.out.println("******************************************************** Products ********************************************************");
            System.out.println("Product ID          Product Name               Unit Price           Units In Stock");
            System.out.println("_".repeat(100));

            while (resultSet.next()) {
                int productId = resultSet.getInt("ProductID");
                String productName = resultSet.getString("ProductName");
                double unitPrice = resultSet.getDouble("UnitPrice");
                int unitsInStock = resultSet.getInt("UnitsInStock");

                System.out.printf("%-25s %-35s %-20s %s\n", productId, productName, unitPrice, unitsInStock);
            }

            resultSet.close();
            statement.close();
        } catch (Exception e) {
        System.out.println("Error loading Products by Category: " + e.getMessage());
        }
    }
}
