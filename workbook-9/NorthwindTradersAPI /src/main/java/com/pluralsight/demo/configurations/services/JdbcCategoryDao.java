package com.pluralsight.demo.configurations.services;

import com.pluralsight.demo.models.Category;
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
public class JdbcCategoryDao implements CategoryDao
{
    private DataSource dataSource;

    @Autowired
    public JdbcCategoryDao(DataSource dataSource) { this.dataSource = dataSource; }

    @Override
    public List<Category> getAll() {
        List<Category> categories = new ArrayList<>();
        String sql = "SELECT categoryId, categoryName FROM Categories";

        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery())
        {
            while (resultSet.next())
            {
                Category category = mapRowToProduct(resultSet);
                categories.add(category);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return categories;
    }

    @Override
    public Category getById(int id) {
        String sql = "SELECT categoryId, categoryName FROM Categories WHERE categoryId = ?";
        Category category = null;

        try (Connection connection = dataSource.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql))
        {
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next())
            {
                category = mapRowToProduct(resultSet);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return category;
    }

    private Category mapRowToProduct(ResultSet resultSet) throws SQLException
    {
        int categoryId = resultSet.getInt("CategoryId");
        String categoryName = resultSet.getString("CategoryName");

        return new Category(categoryId, categoryName);
    }
}
