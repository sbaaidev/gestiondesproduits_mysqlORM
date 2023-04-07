package com.iticsolution.demo_product.service;

import com.iticsolution.demo_product.entities.Category;
import com.iticsolution.demo_product.entities.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface CategoryService {
    public Category addCategory(Category p);
    public Category getCategoryById(Long id);
    public List<Category> getAllCategorys();
    public Category updateCategory(Category c, Long id);
    public void  deleteCategory(Long id);
    public List<Category> getCategorysByName(String s);
}
