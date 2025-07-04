package com.ecom.EcommerceSpring.controllers;

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



    @GetMapping()
    public ResponseEntity <List<CategoryDTO>> getAllCategories() throws IOException{
        List<CategoryDTO> response = this.categoryService.getAllCategories();
    return ResponseEntity.ok(response);

        // below code for customizing API response message
//        return ResponseEntity.created(null)
//                .body(result);
    }






}
