package com.ecom.EcommerceSpring.services;

import com.ecom.EcommerceSpring.dto.CategoryDTO;
import com.ecom.EcommerceSpring.repository.CategoryRepository;
import org.springframework.stereotype.Service;

@Service
public class CategoryService  implements ICategoryService{

    private final CategoryRepository catRepo;

    public CategoryService(CategoryRepository catRepo){
        this.catRepo = catRepo;
    }

    public CategoryDTO getProductByCategory(String category){
        return catRepo.findByCategory(category)
                .map
    }

}
