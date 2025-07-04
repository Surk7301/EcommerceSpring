package com.ecom.EcommerceSpring.services;

import com.ecom.EcommerceSpring.dto.ProductDTO;
import com.ecom.EcommerceSpring.gateway.IProductGateway;
import org.springframework.stereotype.Service;

@Service
public class FakeStoreProductService implements IProductService{

    private final IProductGateway productGateway;
    FakeStoreProductService(IProductGateway productGateway){
        this.productGateway = productGateway;
    }

    public ProductDTO getProductById(Long id) throws Exception{
       return this.productGateway.getProductById(id);
    }

}
