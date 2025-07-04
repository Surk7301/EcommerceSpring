package com.ecom.EcommerceSpring.controllers;


import com.ecom.EcommerceSpring.dto.ProductOfCategoryDTO;
import com.ecom.EcommerceSpring.services.IProductOfCategoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/api/products/category")
public class pocController {
    private final IProductOfCategoryService productOfCategoryService;

    pocController(IProductOfCategoryService productOfCategoryService){
        this.productOfCategoryService = productOfCategoryService;
    }

    @GetMapping("?{type}")
    public List<ProductOfCategoryDTO> getProductOfCategory(){
        ProductOfCategoryDTO result = (ProductOfCategoryDTO) this.productOfCategoryService.getProductOfCategory();

    }
}
