package com.ecom.EcommerceSpring.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product extends BaseEntity {
    private String image;
    private String color;
    private int price;
    private String description;
    private int discount;
    private String model;
//    private int id;
    private String title;
//    private String category;
    private String brand;
    private boolean popular;



    // Each products belongs to one category
    //One category can have many products
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(nullable = false)
    private Category category;
}
