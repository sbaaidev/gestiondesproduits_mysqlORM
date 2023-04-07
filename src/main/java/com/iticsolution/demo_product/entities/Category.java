package com.iticsolution.demo_product.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Entity
@Data@AllArgsConstructor@NoArgsConstructor
public class Category {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;
    private String name;
@OneToMany(mappedBy = "cate",fetch = FetchType.EAGER)
    @JsonIgnore
private List<Product> produits;

}
