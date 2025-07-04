package com.ecom.EcommerceSpring.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FakeStoreProductOfCategoryResponseDTO {
    private List<ProductOfCategoryDTO> productOfCategory;
    private String status;
    private String message;
}
