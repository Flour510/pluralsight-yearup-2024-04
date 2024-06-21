package com.pluralsight.demo.controllers;

import com.pluralsight.demo.configurations.services.CategoryDao;
import com.pluralsight.demo.models.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class CategoriesController
{
   private CategoryDao categoryDao;

   @Autowired
   public CategoriesController(CategoryDao categoryDao) {
      this.categoryDao = categoryDao;
   }

   // return all categories
   @GetMapping("/categories")
   public List<Category> getAllCategories()
   {
       return categoryDao.getAll();
   }

   // return a specific category
   @GetMapping("/categories/{id}")
   public Category getCategoryById(@PathVariable int id) { return categoryDao.getById(id); }
}
