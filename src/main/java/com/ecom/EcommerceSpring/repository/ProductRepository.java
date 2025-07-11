package com.ecom.EcommerceSpring.repository;

import com.ecom.EcommerceSpring.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
