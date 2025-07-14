package com.ecom.EcommerceSpring.repository;

import com.ecom.EcommerceSpring.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CategoryRepository extends JpaRepository<Category, String> {
    Optional<Category> findByCategory(String category);
}
