package com.ecom.EcommerceSpring.services;

import com.ecom.EcommerceSpring.dto.CategoryDTO;
import com.ecom.EcommerceSpring.entity.Category;
import com.ecom.EcommerceSpring.mappers.CategoryMapper;
import com.ecom.EcommerceSpring.repository.CategoryRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
@Primary
public class CategoryService  implements ICategoryService{

    private final CategoryRepository catRepo;

    public CategoryService( CategoryRepository catRepo){
        this.catRepo = catRepo;
    }

    public CategoryDTO getProductByCategory(String category) throws Exception {
        return catRepo.findByCategory(category)
                .map(CategoryMapper::toDto)
                .orElseThrow(()-> new Exception("Category not found"));
    }

    @Override
    public CategoryDTO createCategory(CategoryDTO dto){
        Category saved = catRepo.save(CategoryMapper.toEntity(dto));
        return CategoryMapper.toDto(saved);
    }

    @Override
    public List<CategoryDTO> getAllCategories() throws IOException {
        return List.of();
    }

}
