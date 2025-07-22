package com.ecom.EcommerceSpring.services;

import com.ecom.EcommerceSpring.dto.ProductDTO;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface IProductService {

   ProductDTO getProductById(Long id) throws Exception;

   ProductDTO createProduct(ProductDTO dto) throws Exception;
}
