package com.ecom.EcommerceSpring.repository;

import com.ecom.EcommerceSpring.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, String> {
}
