package com.iticsolution.demo_product;

import com.iticsolution.demo_product.entities.Category;
import com.iticsolution.demo_product.entities.Product;
import com.iticsolution.demo_product.repository.CategoryRepository;
import com.iticsolution.demo_product.repository.ProductRepository;
import com.iticsolution.demo_product.service.CategoryService;
import com.iticsolution.demo_product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoProductApplication implements CommandLineRunner {
@Autowired
    ProductService productService;
@Autowired
    CategoryService categoryService;
    public static void main(String[] args) {
        SpringApplication.run(DemoProductApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Category cat1=new Category(null,"Cat1",null);
        Category cat2=new Category(null,"Cat2",null);
        Category cat3=new Category(null,"Cat3",null);
        Category catdb1=categoryService.addCategory(cat1);
        Category catdb2= categoryService.addCategory(cat2);
        Category catdb3=categoryService.addCategory(cat3);
        System.out.println("********Category added*****");
        Product p1=new Product(null,"Produit1",220,2,catdb1);
        Product p2=new Product(null,"Produit2",220,2,catdb1);
        Product p3=new Product(null,"Produit3",220,2,catdb2);
        Product p4=new Product(null,"Produit4",220,2,catdb2);
        Product p5=new Product(null,"Produit5",220,2,catdb3);
        productService.addProduct(p1);
        productService.addProduct(p2);
        productService.addProduct(p3);
        System.out.println("********Products added*****");

        for(Product p:productService.getAllProducts()){
            System.out.println("id="+p.getId()+" Name="+p.getName()+" Price"+p.getPrice()+" Qte"+p.getQte()+" Category="+p.getCate().getName());
        }

        System.out.println("********Products By Category*****");

        for(Product p:categoryService.getCategoryById(1L).getProduits()){
            System.out.println(p.getName());
        }
    }
}
