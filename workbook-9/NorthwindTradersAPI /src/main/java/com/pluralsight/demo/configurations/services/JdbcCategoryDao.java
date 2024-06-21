package com.pluralsight.demo.configurations.services;

import com.pluralsight.demo.models.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javax.sql.DataSource;
import java.util.List;

@Component
public class JdbcCategoryDao implements CategoryDao
{
    private DataSource dataSource;

    @Autowired
    public JdbcCategoryDao(DataSource dataSource) { this.dataSource = dataSource; }

    @Override
    public List<Category> getAll() {
        // jdbc code to get all categories
        return List.of();
    }

    @Override
    public Category getById(int id) {
        // jdbc code to get a category by id
        return null;
    }
}
