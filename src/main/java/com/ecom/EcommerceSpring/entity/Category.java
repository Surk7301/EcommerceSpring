package com.ecom.EcommerceSpring.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.List;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Category extends BaseEntity{

    private String image;
    private String color;
    private int price;
    private String description;
    private int discount;
    private String model;
    //    private int id;
    private String title;
    private String category;
    private String brand;
    private boolean popular;

    //One category has many products
    @OneToMany(mappedBy = "category")
    private List<Product> products;
}
