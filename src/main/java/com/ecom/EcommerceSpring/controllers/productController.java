package com.ecom.EcommerceSpring.controllers;

import com.ecom.EcommerceSpring.dto.ProductDTO;
import com.ecom.EcommerceSpring.services.IProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
public class productController {
    private final IProductService productCategoryService;

    productController (IProductService productCategoryService){
        this.productCategoryService =  productCategoryService;
    }

//    public List<CategoryDTO>getAllProductsOfCategory() throws IOException {
//        return this.productCategoryService.getAllProductsOfCategory();
//    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductDTO> getProductById(@PathVariable Long id) throws Exception {
        ProductDTO result = this.productCategoryService.getProductById(id);

        return ResponseEntity.ok(result);

    }
}
