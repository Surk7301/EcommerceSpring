package com.ecom.EcommerceSpring.services;

import com.ecom.EcommerceSpring.dto.AllProductsOfCategoryDTO;
import com.ecom.EcommerceSpring.dto.CategoryDTO;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
public interface ICategoryService {

    CategoryDTO getProductByCategory(String category) throws Exception;
    CategoryDTO createCategory(CategoryDTO dto);
    List<CategoryDTO> getAllCategories() throws IOException;
    CategoryDTO getByName(String name) throws Exception;
    AllProductsOfCategoryDTO getAllProductsOfCategory(Long categoryId) throws Exception;


}
