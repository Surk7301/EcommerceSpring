package com.ecom.EcommerceSpring.services;

import com.ecom.EcommerceSpring.dto.ProductDTO;
import com.ecom.EcommerceSpring.entity.Category;
import com.ecom.EcommerceSpring.entity.Product;
import com.ecom.EcommerceSpring.mappers.ProductMapper;
import com.ecom.EcommerceSpring.repository.CategoryRepository;
import com.ecom.EcommerceSpring.repository.ProductRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class ProductService implements IProductService{

    private final ProductRepository repo;
    private final CategoryRepository categoryRepository;

    public ProductService(ProductRepository repo, CategoryRepository categoryRepository){
        this.repo = repo;
        this.categoryRepository = categoryRepository;
    }

    public ProductDTO getProductById(Long id) throws Exception{
        return repo.findById(id)
                .map(ProductMapper::toDto)
                .orElseThrow(() -> new Exception("Product not found"));

    }


    @Override
    public ProductDTO createProduct(ProductDTO dto) {
        Category category = categoryRepository.findById(dto.getCategoryId())
             .orElseThrow(()-> new RuntimeException("Category not found"));

        Product saved = repo.save(ProductMapper.toEntity(dto, category));
        return ProductMapper.toDto(saved);
    }
}
