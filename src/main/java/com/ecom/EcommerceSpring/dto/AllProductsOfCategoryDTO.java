package com.ecom.EcommerceSpring.dto;

import lombok.*;

import java.util.List;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AllProductsOfCategoryDTO {
    private long categoryId;
    private String name;
    private List<ProductDTO> products;
}
