package com.ecom.EcommerceSpring.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductDTO {

    //Created with pojo creater automatic
    private String image;
    private String color;
    private int price;
    private String description;
    private int discount;
    private String model;
    private int id;
    private String title;
    private String category;
    private String brand;
    private boolean popular;
}
