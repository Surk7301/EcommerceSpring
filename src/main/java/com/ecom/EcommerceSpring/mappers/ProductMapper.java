package com.ecom.EcommerceSpring.mappers;

import com.ecom.EcommerceSpring.dto.ProductDTO;
import com.ecom.EcommerceSpring.dto.ProductWithCategoryDTO;
import com.ecom.EcommerceSpring.entity.Category;
import com.ecom.EcommerceSpring.entity.Product;

public class ProductMapper {
     public static ProductDTO toDto(Product product){
         return ProductDTO.builder()
                 .id(product.getId())
                 .image(product.getImage())
                 .color(product.getColor())
                 .price(product.getPrice())
                 .description(product.getDescription())
                 .discount(product.getDiscount())
                 .model(product.getModel())
                 .title(product.getTitle())
                 .categoryId(product.getCategory().getId())
                 .brand(product.getBrand())
                 .popular(product.isPopular())
                 .build();
     }

     public static Product toEntity(ProductDTO dto, Category category){
         return Product.builder()
                 .image(dto.getImage())
                 .color(dto.getColor())
                 .price(dto.getPrice())
                 .description(dto.getDescription())
                 .discount(dto.getDiscount())
                 .model(dto.getModel())
                 .title(dto.getTitle())
                 .category(category)
                 .brand(dto.getBrand())
                 .popular(dto.isPopular())
                 .build();
     }

     public static ProductWithCategoryDTO toProductWithCategoryDTO(Product product){
         return ProductWithCategoryDTO.builder()
                 .id(product.getId())
                 .image(product.getImage())
                 .color(product.getColor())
                 .price(product.getPrice())
                 .description(product.getDescription())
                 .discount(product.getDiscount())
                 .model(product.getModel())
                 .title(product.getTitle())
                 .categoryId(product.getCategory().getId())
                 .brand(product.getBrand())
                 .popular(product.isPopular())
                 .category(CategoryMapper.toDto(product.getCategory()))
                 .build();

     }
}
