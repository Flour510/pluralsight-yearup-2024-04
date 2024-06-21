package com.pluralsight.demo.controllers;

import com.pluralsight.demo.configurations.services.ProductDao;
import com.pluralsight.demo.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class ProductsController
{
    private ProductDao productDao;

    @Autowired
    public ProductsController(ProductDao productDao) {
        this.productDao = productDao;
    }

    // return all products
    @GetMapping("/products")
    public List<Product> getAllProducts()
    {
        return productDao.getAll();
    }

    // return a specific product
    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable int id) { return productDao.getById(id); }
}
