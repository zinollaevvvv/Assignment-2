package org.example;
import org.example.Product;
import org.example.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
@Primary

public class FirstService implements ProductService {
    private final ProductRepository productRepository;
    @Autowired
    public FirstService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }
    @Override
    public void addProduct(Product product) {
        System.out.println("FirstService: addProduct->" + product);
        productRepository.addProduct(product);
    }
    @Override
    public List<Product> getAllProducts() {return productRepository.getAllProducts();}
}
