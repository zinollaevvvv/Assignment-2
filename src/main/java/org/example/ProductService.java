package org.example;
import org.example.Product;

import java.util.List;

public interface ProductService {
    void addProduct(Product product);
    List<Product> getAllProducts();
}
