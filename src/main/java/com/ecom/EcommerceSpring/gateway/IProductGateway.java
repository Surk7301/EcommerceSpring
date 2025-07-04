package com.ecom.EcommerceSpring.gateway;

import com.ecom.EcommerceSpring.dto.ProductDTO;

public interface IProductGateway {
    ProductDTO getProductById(Long id) throws Exception;
}
