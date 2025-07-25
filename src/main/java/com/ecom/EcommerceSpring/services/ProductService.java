package com.ecom.EcommerceSpring.services;

import com.ecom.EcommerceSpring.dto.ProductDTO;
import com.ecom.EcommerceSpring.dto.ProductWithCategoryDTO;
import com.ecom.EcommerceSpring.entity.Category;
import com.ecom.EcommerceSpring.entity.Product;
import com.ecom.EcommerceSpring.exception.ProductNotFoundException;
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

    public ProductDTO getProductById(Long id) {
        return repo.findById(id)
                .map(ProductMapper::toDto)
                .orElseThrow(() -> new ProductNotFoundException("Product with ID " + id + " not found"));

    }


    @Override
    public ProductDTO createProduct(ProductDTO dto) throws Exception {
        Category category = categoryRepository.findById(dto.getCategoryId())
             .orElseThrow(()-> new Exception("Category not found"));

        Product saved = repo.save(ProductMapper.toEntity(dto, category));
        return ProductMapper.toDto(saved);
    }

    @Override
    public ProductWithCategoryDTO getProductWithCategory(Long id) throws Exception {
        Product product = repo.findById(id)
                .orElseThrow(() -> new Exception("Product not found"));
        return ProductMapper.toProductWithCategoryDTO(product);
    }
}
