package com.pluralsight.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ProductsController
{
    @GetMapping("/products")
    public List<String> getAllProducts() {
        return Arrays.asList("Chai", "Chang", "Aniseed Syrup", "Chef Anton's Cajun Seasoning");
    }
}
