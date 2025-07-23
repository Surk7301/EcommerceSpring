package com.ecom.EcommerceSpring.services;

import com.ecom.EcommerceSpring.dto.CategoryDTO;
import com.ecom.EcommerceSpring.dto.ProductWithCategoryDTO;
import com.ecom.EcommerceSpring.gateway.ICategoryGateway;

import java.io.IOException;
import java.util.List;


public class FakeStoreCategoryService implements ICategoryService {


    private final ICategoryGateway categoryGateway;

    //Qualifier is inside becoz we are using constructor injection
    public FakeStoreCategoryService(  ICategoryGateway categoryGateway){
        this.categoryGateway = categoryGateway;

    }

    public CategoryDTO getProductByCategory(String category)throws Exception {
        return this.categoryGateway.getProductByCategory(category);
    }

    @Override
    public CategoryDTO createCategory(CategoryDTO dto) {
        return null;
    }

    @Override
    public List<CategoryDTO> getAllCategories() throws IOException {
        return this.categoryGateway.getAllCategories();
    }

    @Override
    public CategoryDTO getByName(String name) throws Exception {
        return null;
    }


}
