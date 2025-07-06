package com.ecom.EcommerceSpring.services;

import com.ecom.EcommerceSpring.dto.ProductOfCategoryDTO;
import com.ecom.EcommerceSpring.gateway.IProductOfCategoryGateway;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FakeStoreProductOfCategoryService implements IProductOfCategoryService{
    private final IProductOfCategoryGateway productOfCategoryGateway;

    FakeStoreProductOfCategoryService (IProductOfCategoryGateway productOfCategoryGateway){
        this.productOfCategoryGateway = productOfCategoryGateway;
    }

    @Override
    public List<ProductOfCategoryDTO> getProductOfCategory(long type) throws Exception{
        return  this.productOfCategoryGateway.getProductOfCategory(type);

    }


}
