package com.ecom.EcommerceSpring.repository;

import com.ecom.EcommerceSpring.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

 //http://localhost:7777/api/categories?minPrice=2500
 @Query("Select p from Product p where p.price > :minPrice")
 List<Product>findExpensiveProducts(@Param("minValue") double minPrice);

 @Query(value = "Select * FROM product WHERE MATCH(name, description) AGAINST (:keyword)", nativeQuery = true)
 List<Product> searchFullText(@Param("keyword") String keyword);

 @Query("Select p from Product p WHERE p.price > :minPrice AND p.brand = :brand")
 List<Product>findByBrandAndPrice(
         @Param("minPrice") int price,
         @Param("brand") String brandName
 );
}
