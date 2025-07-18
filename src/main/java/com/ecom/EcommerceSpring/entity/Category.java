package com.ecom.EcommerceSpring.entity;

import jakarta.persistence.Column;
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



    @Column(nullable = false, unique = true)
    private String name;

//    @Column(nullable = false, unique = true)
//    private Long category_id;

    //One category has many products
    @OneToMany(mappedBy = "category")
    private List<Product> products;
}
