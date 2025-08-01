package com.ecom.EcommerceSpring.services;

import com.ecom.EcommerceSpring.dto.ProductDTO;

import com.ecom.EcommerceSpring.dto.ProductWithCategoryDTO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface IProductService {

   ProductDTO getProductById(Long id) ;

   ProductDTO createProduct(ProductDTO dto) throws Exception;

   ProductWithCategoryDTO getProductWithCategory(Long id) throws Exception;
}
