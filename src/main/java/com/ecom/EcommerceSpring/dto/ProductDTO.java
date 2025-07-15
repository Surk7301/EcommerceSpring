package com.ecom.EcommerceSpring.dto;

import com.ecom.EcommerceSpring.entity.Category;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
    private Long id;
    private String title;
    private Long categoryId;
    private String brand;
    private boolean popular;


}
