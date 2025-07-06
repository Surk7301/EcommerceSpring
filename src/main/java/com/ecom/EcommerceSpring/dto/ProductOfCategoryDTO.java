package com.ecom.EcommerceSpring.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductOfCategoryDTO {
    private String image;
    private String color;
    private Integer price;
    private String description;
    private Boolean onSale;
    private Integer discount;
    private String model;
    private long id;
    private String title;
    private String category;
    private String brand;
    private Boolean popular;
}
