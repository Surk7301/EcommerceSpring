package com.ecom.EcommerceSpring.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FakeStoreProductsResponseDTO {
    private String status;

    private String message;

    private ProductDTO productsOfCategory;
}
