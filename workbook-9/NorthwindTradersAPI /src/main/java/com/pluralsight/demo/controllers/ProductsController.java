package com.pluralsight.demo.controllers;

import com.pluralsight.demo.models.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;

@RestController
public class ProductsController
{
    // temporary list of products
    private List<Product> products = Arrays.asList(
            new Product(1, "Chai", 1, 18.00),
            new Product(2, "Chang", 1, 19.00),
            new Product(3, "Aniseed Syrup", 2, 10.00),
            new Product(4, "Chef Anton's Cajun Seasoning", 2, 22.00)
    );

    // return all products
    @GetMapping("/products")
    public List<Product> getAllProducts()
    {
        return products;
    }

    // return a specific product
    @GetMapping("/products/{id}")
    public Product getById(@PathVariable int id) { return products.get(id); }
}