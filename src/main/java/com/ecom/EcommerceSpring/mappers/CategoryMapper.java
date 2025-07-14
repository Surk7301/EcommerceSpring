package com.ecom.EcommerceSpring.mappers;

import com.ecom.EcommerceSpring.dto.CategoryDTO;
import com.ecom.EcommerceSpring.dto.ProductDTO;
import com.ecom.EcommerceSpring.entity.Category;
import com.ecom.EcommerceSpring.entity.Product;

public class CategoryMapper {
    CategoryDTO toDto(Category category){
        return CategoryDTO.builder()
                .image(category.getImage())
                .color(category.getColor())
                .price(category.getPrice())
                .description(category.getDescription())
                .discount(category.getDiscount())
                .model(category.getModel())
                .title(category.getTitle())
                .category(category.getCategory())
                .brand(category.getBrand())
                .popular(category.isPopular())
                .build();
    }

    public static Product toEntity(ProductDTO dto){
        return Product.builder()
                .image(dto.getImage())
                .color(dto.getColor())
                .price(dto.getPrice())
                .description(dto.getDescription())
                .discount(dto.getDiscount())
                .model(dto.getModel())
                .title(dto.getTitle())
                .category(dto.getCategory())
                .brand(dto.getBrand())
                .popular(dto.isPopular())
                .build();
    }
}
