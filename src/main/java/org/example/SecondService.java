package org.example;

import org.example.Product;
import org.example.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service

public class SecondService implements ProductService {
    private final ProductRepository productRepository;
    @Autowired
    public SecondService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    @Override
    public void addProduct(Product product) {
        System.out.println("Second Service: addProduct -> "+product);
        productRepository.addProduct(product);
    }
    @Override
    public List<Product> getAllProducts() {
        return productRepository.getAllProducts();
    }

}
