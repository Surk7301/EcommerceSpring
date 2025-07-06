package com.ecom.EcommerceSpring.gateway;

import com.ecom.EcommerceSpring.dto.ProductOfCategoryDTO;

import java.util.List;

public interface IProductOfCategoryGateway {
     List<ProductOfCategoryDTO> getProductOfCategory(long type) throws Exception;
}
