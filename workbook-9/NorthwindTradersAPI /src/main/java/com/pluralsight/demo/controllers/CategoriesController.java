package com.pluralsight.demo.controllers;

import com.pluralsight.demo.configurations.services.CategoryDao;
import com.pluralsight.demo.models.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

   // adds a new category
   @RequestMapping("/categories")
   public Category addCategory(@RequestBody Category category)
   {
      return categoryDao.insert(category);
   }
}
