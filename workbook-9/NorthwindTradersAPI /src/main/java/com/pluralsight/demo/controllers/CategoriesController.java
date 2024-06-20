package com.pluralsight.demo.controllers;

import com.pluralsight.demo.models.Category;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;

@RestController
public class CategoriesController
{
   // temporary list of categories
   private List<Category> categories = Arrays.asList(
           new Category(1, "Beverages"),
           new Category(2, "Condiments"),
           new Category(3, "Confections"),
           new Category(4, "Dairy Products")
   );

   // return all categories
   @GetMapping("/categories")
   public List<Category> getAllCategories()
   {
       return categories;
   }

   // return a specific category
   @GetMapping("/categories/{id}")
   public Category getById(@PathVariable int id) { return categories.get(id); }
}
