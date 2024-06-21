package com.pluralsight.demo.configurations.services;

import com.pluralsight.demo.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Component
public class JdbcProductDao implements ProductDao
{
    private DataSource dataSource;

    @Autowired
    public JdbcProductDao(DataSource dataSource) { this.dataSource = dataSource; }

    @Override
    public List<Product> getAll() {
        List<Product> products = new ArrayList<>();
        String sql = "SELECT productId, productName, categoryId, unitPrice FROM Products";

        try (Connection connection = dataSource.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery())
        {
            while (resultSet.next())
            {
                Product product = mapRowToProduct(resultSet);
                products.add(product);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return products;
    }

    @Override
    public Product getById(int id) {
        String sql = "SELECT productId, productName, categoryId, unitPrice FROM Products WHERE productId = ?";
        Product product = null;

        try (Connection connection = dataSource.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql))
        {
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next())
            {
                product = mapRowToProduct(resultSet);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return product;
    }

    @Override
    public List<Product> searchProducts(String productName, String searchProduct) {
        return List.of();
    }

    private Product mapRowToProduct(ResultSet resultSet) throws SQLException
    {
        int productId = resultSet.getInt("ProductId");
        String productName = resultSet.getString("ProductName");
        int categoryId = resultSet.getInt("CategoryId");
        double unitPrice = resultSet.getDouble("UnitPrice");

        return new Product(productId, productName, categoryId, unitPrice);
    }
}
