package com.ecom.EcommerceSpring.controllers;

import com.ecom.EcommerceSpring.dto.ProductDTO;
import com.ecom.EcommerceSpring.dto.ProductWithCategoryDTO;
import com.ecom.EcommerceSpring.exception.ProductNotFoundException;
import com.ecom.EcommerceSpring.services.IProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/products")
public class productController {
    private final IProductService productService;

    productController (IProductService productService){
        this.productService =  productService;
    }

//    public List<CategoryDTO>getAllProductsOfCategory() throws IOException {
//        return this.productCategoryService.getAllProductsOfCategory();
//    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductDTO> getProductById(@PathVariable Long id) {

        ProductDTO result = this.productService.getProductById(id);

        return ResponseEntity.ok(result);

    }

    @PostMapping
    public ResponseEntity<ProductDTO> createProduct(@RequestBody ProductDTO dto) throws Exception {
        return ResponseEntity.ok(productService.createProduct(dto));
    }

    @GetMapping("/{id}/details")
    public ResponseEntity<ProductWithCategoryDTO> getProductWithCategory(@PathVariable long id) throws Exception{
        ProductWithCategoryDTO dto = productService.getProductWithCategory(id);
        return ResponseEntity.ok(dto);
    }


}
