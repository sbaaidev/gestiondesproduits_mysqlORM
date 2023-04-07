package com.iticsolution.demo_product.service.serviceImpl;

import com.iticsolution.demo_product.entities.Product;
import com.iticsolution.demo_product.repository.ProductRepository;
import com.iticsolution.demo_product.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;
 @Service
public class ProductServiceImpl implements ProductService {
    final ProductRepository productRepository;
    public ProductServiceImpl(ProductRepository productRepository){
        this.productRepository=productRepository;
    }
    @Override
    public Product addProduct(Product p) {
        Product p2=new Product();
        if(p.getName()!=null && p.getQte()!=0){
             p2=productRepository.save(p);
        }
        return p2;

    }

    @Override
    public Product getProductById(Long id) {
        return productRepository.findById(id).get();
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product updateProduct(Product p, Long id) {
        Product p2=new Product();
        p2.setId(id);
        p2=p;
        return  productRepository.save(p2);
    }

    @Override
    public void deleteProduct(Long id) {
    productRepository.deleteById(id);
    }

    @Override
    public List<Product> getProductsByName(String s) {

        return productRepository.findByNameContains(s);
    }
}
