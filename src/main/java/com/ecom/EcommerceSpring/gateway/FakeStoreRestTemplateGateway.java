package com.ecom.EcommerceSpring.gateway;

import com.ecom.EcommerceSpring.dto.CategoryDTO;

import com.ecom.EcommerceSpring.dto.FakeStoreCategoryResponseDTO;
import com.ecom.EcommerceSpring.mappers.GetAllCategoriesMapper;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.List;

import static java.util.stream.Collectors.toList;

@Component("fakeStoreRestTemplateGateway")

public class FakeStoreRestTemplateGateway implements ICategoryGateway{

    private final RestTemplateBuilder restTemplateBuilder;

    public FakeStoreRestTemplateGateway(RestTemplateBuilder restTemplateBuilder){
        this.restTemplateBuilder = restTemplateBuilder;
    }

    @Override
    public List<CategoryDTO> getAllCategories() throws IOException {
        RestTemplate restTemplate = restTemplateBuilder.build();
        String url = "https://fakestoreapi.in/api/products/category";

        ResponseEntity<FakeStoreCategoryResponseDTO> response = restTemplate.getForEntity(url, FakeStoreCategoryResponseDTO.class);
        if(response.getBody() == null){
            throw new IOException("Failed to fetch categories");
        }

//        return response.getBody().getCategories().stream()
//                .map(category -> CategoryDTO.builder()
//                .name(category)
//                .build())
//                .toList();
        return GetAllCategoriesMapper.toCategoryDto(response.getBody());
    }

    @Override
    public CategoryDTO getProductByCategory(String category) throws IOException {
        return null;
    }
}
