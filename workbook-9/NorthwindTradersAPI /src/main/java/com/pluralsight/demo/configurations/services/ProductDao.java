package com.pluralsight.demo.configurations.services;

import com.pluralsight.demo.models.Product;
import java.util.List;

public interface ProductDao
{
    List<Product> getAll();
    Product getById(int id);

    List<Product> searchProducts(String productName, String searchProduct);

    Product insert(Product product);

    void update(int id, Product product);
}
