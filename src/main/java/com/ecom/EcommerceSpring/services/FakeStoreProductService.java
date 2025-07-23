package com.ecom.EcommerceSpring.services;

import com.ecom.EcommerceSpring.dto.ProductDTO;
import com.ecom.EcommerceSpring.dto.ProductWithCategoryDTO;
import com.ecom.EcommerceSpring.gateway.IProductGateway;
import org.springframework.stereotype.Service;

@Service
public class FakeStoreProductService implements IProductService{

    private final IProductGateway productGateway;
    public FakeStoreProductService(IProductGateway productGateway){
        this.productGateway = productGateway;
    }

    @Override
    public ProductDTO getProductById(Long id) throws Exception{
       return this.productGateway.getProductById(id);
    }


    public ProductDTO createProduct(ProductDTO dto) {
        return null;
    }

    public ProductWithCategoryDTO getProductWithCategory(Long id) throws Exception{
        return null;
    }
}
