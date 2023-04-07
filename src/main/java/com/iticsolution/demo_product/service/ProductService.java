package com.iticsolution.demo_product.service;

import com.iticsolution.demo_product.entities.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface ProductService {
    public Product addProduct(Product p);
    public Product getProductById(Long id);
    public List<Product> getAllProducts();
    public Product updateProduct(Product p, Long id);
    public void  deleteProduct(Long id);
    public List<Product> getProductsByName(String s);
}
