package com.ecom.EcommerceSpring.services;

import com.ecom.EcommerceSpring.gateway.FakeStoreCategoryGateway;
import com.ecom.EcommerceSpring.gateway.ICategoryGateway;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FakeStoreCategoryService implements ICategoryService {

    private final ICategoryGateway categoryGateway;

    public FakeStoreCategoryService(ICategoryGateway categoryGateway){
        this.categoryGateway = categoryGateway;
    }

    public List<String>getAllCategories(){
        return List.of();
    }

}
