package com.ecom.EcommerceSpring.services;

import com.ecom.EcommerceSpring.dto.CategoryDTO;
import com.ecom.EcommerceSpring.entity.Category;
import com.ecom.EcommerceSpring.mappers.CategoryMapper;
import com.ecom.EcommerceSpring.repository.CategoryRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
@Primary
public class CategoryService  implements ICategoryService{

    private final CategoryRepository repo;

    public CategoryService( CategoryRepository repo){
        this.repo = repo;
    }

//    public CategoryDTO getProductByCategory(String category) throws Exception {
//        return catRepo.findByCategory(category)
//                .map(CategoryMapper::toDto)
//                .orElseThrow(()-> new Exception("Category not found"));
//    }

    @Override
    public CategoryDTO getProductByCategory(String category) throws Exception {
        return null;
    }

    @Override
    public CategoryDTO createCategory(CategoryDTO categoryDTO){
        Category category = CategoryMapper.toEntity(categoryDTO);
        Category saved = repo.save(category);
        return CategoryMapper.toDto(saved);
    }

    public CategoryDTO getByName(String name)throws Exception{
        Category category = repo.findByName(name)
                .orElseThrow(()-> new Exception("Category not found with name: "+ name));
        return CategoryMapper.toDto(category);
    }

    @Override
    public List<CategoryDTO> getAllCategories() throws IOException {
        return List.of();
    }



//    @Override
//    public List<CategoryDTO> getAllCategories() throws IOException {
//        List<CategoryDTO> dtos = new ArrayList<>();
//
//    }


}
