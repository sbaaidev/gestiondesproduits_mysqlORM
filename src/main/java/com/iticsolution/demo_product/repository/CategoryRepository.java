package com.iticsolution.demo_product.repository;

import com.iticsolution.demo_product.entities.Category;
import jakarta.annotation.Resource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {
public List<Category> findCategoryByNameContains(String name);
}
