package com.iticsolution.demo_product.repository;

import com.iticsolution.demo_product.entities.Product;
import jakarta.annotation.Resource;
import jakarta.annotation.Resources;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
public List<Product> findByNameContains(String name);
}
