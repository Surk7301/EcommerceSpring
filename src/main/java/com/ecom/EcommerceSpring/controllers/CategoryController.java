package com.ecom.EcommerceSpring.controllers;

import com.ecom.EcommerceSpring.dto.AllProductsOfCategoryDTO;
import com.ecom.EcommerceSpring.dto.CategoryDTO;
import com.ecom.EcommerceSpring.services.ICategoryService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("api/categories")
public class CategoryController {

    private final ICategoryService categoryService;


    CategoryController( ICategoryService categoryService){
        this.categoryService=categoryService;

        }

        @GetMapping("/{category}")
    public ResponseEntity<CategoryDTO> getProductByCategory(@PathVariable String category) throws Exception{
        CategoryDTO result = this.categoryService.getProductByCategory(category);
        return ResponseEntity.ok(result);
    }

    @PostMapping
    public ResponseEntity<CategoryDTO> createCategory(@RequestBody CategoryDTO dto) {
        return ResponseEntity.ok(categoryService.createCategory(dto));
    }

    @GetMapping()
    public ResponseEntity <?> getAllCategories(@RequestParam(required = false) String name) throws Exception{
        if(name != null && !name.isBlank()){
            CategoryDTO categoryDTO = categoryService.getByName(name);
            return ResponseEntity.ok(categoryDTO);
        }else{
            List<CategoryDTO> response = this.categoryService.getAllCategories();
            return ResponseEntity.ok(response);
        }

        // below code for customizing API response message
//        return ResponseEntity.created(null)
//                .body(result);
    }

    @GetMapping("/{id}/products")
    public ResponseEntity<AllProductsOfCategoryDTO> getAllProductsOfCategory(@PathVariable Long id) throws Exception{
        AllProductsOfCategoryDTO dto = categoryService.getAllProductsOfCategory(id);
        return ResponseEntity.ok(dto);
    }






}
