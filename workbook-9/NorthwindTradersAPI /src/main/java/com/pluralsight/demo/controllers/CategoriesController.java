package com.pluralsight.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CategoriesController
{
    @GetMapping("/categories")
    public List<String> getAllCategories() {
        return Arrays.asList("Beverages", "Condiments", "Confections", "Dairy Products", "Grains/Cereals", "Meat/Poultry", "Produce", "Seafood");
    }
}
