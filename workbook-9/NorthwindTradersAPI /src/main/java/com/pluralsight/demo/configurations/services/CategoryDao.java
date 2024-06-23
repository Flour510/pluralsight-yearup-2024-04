package com.pluralsight.demo.configurations.services;

import com.pluralsight.demo.models.Category;
import java.util.List;

public interface CategoryDao
{
    List<Category> getAll();
    Category getById(int id);

    Category insert(Category category);
}
