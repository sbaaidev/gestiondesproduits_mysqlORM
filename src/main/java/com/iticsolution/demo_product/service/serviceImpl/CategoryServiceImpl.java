package com.iticsolution.demo_product.service.serviceImpl;

import com.iticsolution.demo_product.entities.Category;
import com.iticsolution.demo_product.repository.CategoryRepository;
import com.iticsolution.demo_product.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryServiceImpl implements CategoryService {

    final CategoryRepository categoryRepository;
    public CategoryServiceImpl(CategoryRepository categoryRepository){
        this.categoryRepository=categoryRepository;
    }
    @Override
    public Category addCategory(Category p) {
        return categoryRepository.save(p);
    }

    @Override
    public Category getCategoryById(Long id) {
        return categoryRepository.findById(id).get();
    }

    @Override
    public List<Category> getAllCategorys() {
        return categoryRepository.findAll();
    }

    @Override
    public Category updateCategory(Category c, Long id) {
        Category cat=new Category();
        cat.setId(id);
        cat=c;
        return categoryRepository.save(cat);
    }

    @Override
    public void deleteCategory(Long id) {
    categoryRepository.deleteById(id);
    }

    @Override
    public List<Category> getCategorysByName(String s)
    {
        return categoryRepository.findCategoryByNameContains(s);
    }
}
