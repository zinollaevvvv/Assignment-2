package org.example;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        ProductService productService = context.getBean(ProductService.class);
        productService.addProduct(new Product("Laptop", 1000.0));
        productService.addProduct(new Product("Phone", 500.0));
        productService.addProduct(new Product("Tablet", 2000.0));

        System.out.println("All products: "+productService.getAllProducts());
        context.getBean(LazyB.class);
    }
}