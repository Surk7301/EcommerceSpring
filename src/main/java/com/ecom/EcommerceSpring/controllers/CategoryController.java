package com.ecom.EcommerceSpring.controllers;

import com.ecom.EcommerceSpring.services.ICategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/categories")
public class CategoryController {

    private final ICategoryService categoryService;

    CategoryController(ICategoryService categoryService){
        this.categoryService=categoryService;
        }

    @GetMapping
    public List<String> getAllCategories(){
    return this.categoryService.getAllCategories();
    }



}
