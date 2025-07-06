package com.ecom.EcommerceSpring.services;

import com.ecom.EcommerceSpring.dto.CategoryDTO;
import com.ecom.EcommerceSpring.gateway.ICategoryGateway;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service("categoryService")
public class FakeStoreCategoryService implements ICategoryService {


    private final ICategoryGateway categoryGateway;

    //Qualifier is inside becoz we are using constructor injection
    public FakeStoreCategoryService( @Qualifier("fakeStoreRestTemplateGateway") ICategoryGateway categoryGateway){
        this.categoryGateway = categoryGateway;

    }

    @Override
    public List<CategoryDTO> getAllCategories() throws IOException {
        return this.categoryGateway.getAllCategories();
    }



}
