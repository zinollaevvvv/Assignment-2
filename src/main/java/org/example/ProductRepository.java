package org.example;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.ArrayList;

@Repository
public class ProductRepository {
    private final List<Product> products = new ArrayList<>();
    public void addProduct(Product product) {
        products.add(product);
    }
    public List<Product> getAllProducts() {
        return products;
    }
}